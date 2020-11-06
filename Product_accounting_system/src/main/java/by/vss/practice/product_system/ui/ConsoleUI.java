package by.vss.practice.product_system.ui;

import by.vss.practice.product_system.exception.ProductDatabaseException;
import by.vss.practice.product_system.exception.ProductFileDatabaseException;
import by.vss.practice.product_system.service.ProductController;
import by.vss.practice.product_system.utill.validator.ProductValidator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Scanner;

import static by.vss.practice.product_system.constant.menu.MenuHolder.*;

@Component
public class ConsoleUI {

    private final Logger LOGGER = LogManager.getLogger("");

    @Autowired
    private ProductController service;
    @Autowired
    private Scanner scanner;
    @Autowired
    ProductValidator productValidator;


    public void mainMenu() {
        int result;
        loginMenu();
        while (true) {
            result = getAnswerMenu(MAIN_MENU, MAIN_MENU_ERROR_STRING, NUMBER_OF_MAIN_MENU_ITEMS);

            switch (result) {
                case 1:
                    addProductMenu();
                    break;
                case 2:
                    getProductByIdMenu();
                    break;
                case 3:
                    getAllProductsByCategoryMenu();
                    break;
                case 4:
                    getAllProductsMenu();
                    break;
                case 5:
                    deleteProductMenu();
                    break;
                case 6:
                    updateProductMenu();
                    break;
                case 7:
                    updateAllProductsDiscountsByCategory();
                    break;
                case 8:
                    saveToFile();
                    break;
                case 9:
                    loadFromFile();
                    break;
                case 10:
                    return;
            }
        }
    }

    private int getAnswerMenu(String menu, String errorString, int menuSize) {
        String answer;
        int result;
        while (true) {
            LOGGER.info(menu);
            if (scanner.hasNextLine()) {
                answer = scanner.nextLine();
                if (productValidator.isNumber(answer)) {
                    result = Integer.parseInt(answer);
                    if (result <= menuSize && result > 0) {
                        return result;
                    } else {
                        errorMenu(errorString);
                    }
                }
                errorMenu(errorString);
            }
            errorMenu(errorString);
        }
    }

    private void loginMenu() {
        while (true) {
            LOGGER.info(LOGIN_STRING);
            if (scanner.hasNextLine() && productValidator.checkLogin(scanner.nextLine())) {
                LOGGER.info(CORRECT_STRING);
                while (true) {
                    LOGGER.info(PASSWORD_STRING);
                    if (scanner.hasNextLine() && productValidator.checkPassword(scanner.nextLine())) {
                        LOGGER.info(CORRECT_STRING);
                        return;
                    }
                    LOGGER.info(PASSWORD_ERROR_STRING);
                }
            }
            LOGGER.info(LOGIN_ERROR_STRING);
        }
    }

    private void updateProductMenu() {
        long id = getProductIdMenu(PRE_UPDATE_PRODUCT_BY_ID_MENU);
        while (true) {
            int result = getAnswerMenu(UPDATE_PRODUCT_BY_ID_MENU, PRE_UPDATE_MENU_ERROR_STRING, NUMBER_OF_UPDATE_MENU_ITEMS);
            String string;
            try {
                switch (result) {
                    case 1:
                        string = getProductNameMenu(UPDATE_PRODUCT_NAME_MENU);
                        if (!productValidator.isQuit(string)) {
                            service.updateProductName(id, string);
                        }
                        break;
                    case 2:
                        string = getProductPriceMenu(UPDATE_PRODUCT_PRICE_MENU);
                        if (!productValidator.isQuit(string)) {
                            service.updateProductPrice(id, string);
                        }
                        break;
                    case 3:
                        string = getProductCategoryMenu(UPDATE_PRODUCT_CATEGORY_MENU);
                        if (!productValidator.isQuit(string)) {
                            service.updateProductCategory(id, string);
                        }
                        break;
                    case 4:
                        string = getProductDiscountMenu(UPDATE_PRODUCT_DISCOUNT_MENU);
                        if (!productValidator.isQuit(string)) {
                            service.updateProductDiscount(id, string);
                        }
                        break;
                    case 5:
                        string = getProductDescriptionMenu(UPDATE_PRODUCT_DESCRIPTION_MENU);
                        if (!productValidator.isQuit(string)) {
                            service.updateProductDescription(id, string);
                        }
                        break;
                    case 6:
                        return;
                }
            } catch (ProductDatabaseException e) {
                errorMenu(e.getMessage());
            }
        }
    }

    private void addProductMenu() {
        boolean isNotAdded = true;
        String[] arr = new String[5];
        int result = getAnswerMenu(PRE_ADD_PRODUCT_MENU, PRE_ADD_MENU_ERROR_STRING, NUMBER_OF_PRE_ADD_MENU_ITEMS);

        while (isNotAdded) {
            switch (result) {
                case 1:
                    arr = createDefaultProductMenu();
                    break;
                case 2:
                    arr = createOptionalProductMenu();
                    break;
                case 3:
                    return;
            }

            for (String s : arr) {
                if (s == null || productValidator.isQuit(s)) {
                    return;
                }
            }
            service.addProductToDatabase(arr);
            successOperation();
            isNotAdded = false;
        }
    }

    private long getProductIdMenu(String menu) {
        String str;
        while (true) {
            LOGGER.info(menu);
            if (scanner.hasNextLine()) {
                str = scanner.nextLine();
                if (productValidator.isNumber(str)) {
                    return Long.parseLong(str);
                } else if (productValidator.isQuit(scanner.next())) {
                    return -1;
                } else {
                    errorMenu(CORRECT_PRODUCT_ID_ERROR_STRING);
                }
            }
        }
    }

    private void getProductByIdMenu() {
        String result = "";
        long id = getProductIdMenu(PRE_GET_PRODUCT_BY_ID_MENU);
        if (id > 0) {
            try {
                result = service.getProductInfoById(id);
            } catch (ProductDatabaseException e) {
                errorMenu(e.getMessage());
            }
            LOGGER.info(result);
            successOperation();
        }
    }

    private void getAllProductsByCategoryMenu() {
        String result = getProductCategoryMenu(ADD_PRODUCT_CATEGORY_MENU);
        if (productValidator.isQuit(result)) {
            return;
        }
        try {
            service.getAllProductsInfoByCategory(result).forEach(LOGGER::info);
            successOperation();
        } catch (ProductDatabaseException e) {
            errorMenu(e.getMessage());
        }
    }

    private void updateAllProductsDiscountsByCategory() {
        String categoryString = getProductCategoryMenu(ADD_PRODUCT_CATEGORY_MENU);

        if (productValidator.isQuit(categoryString)) {
            return;
        }
        String discountString = getProductDiscountMenu(UPDATE_PRODUCT_DISCOUNT_MENU);
        if (productValidator.isQuit(discountString)) {
            return;
        }
        try {
            service.updateAllProductsDiscountsByCategory(categoryString, discountString);
            successOperation();
        } catch (ProductDatabaseException e) {
            errorMenu(e.getMessage());
        }

    }

    private void getAllProductsMenu() {
        List<String> result;
        try {
            result = service.getAllProductsInfo();
            result.forEach(LOGGER::info);
            successOperation();
        } catch (ProductDatabaseException e) {
            errorMenu(e.getMessage());
        }

    }

    private void deleteProductMenu() {
        long id = getProductIdMenu(DELETE_PRODUCT_BY_ID_MENU);
        if (id > 0) {
            try {
                service.deleteProductFromDatabase(id);
                successOperation();
            } catch (ProductDatabaseException e) {
                errorMenu(e.getMessage());
            }
        }
    }

    private String[] createDefaultProductMenu() {
        String[] arr = new String[5];
        String result;

        result = getProductNameMenu(ADD_PRODUCT_NAME_MENU);
        if (!productValidator.isQuit(result)) {
            arr[0] = result;
        }

        result = getProductPriceMenu(ADD_PRODUCT_PRICE_MENU);
        if (!productValidator.isQuit(result)) {
            arr[1] = result;
        }

        result = getProductCategoryMenu(ADD_PRODUCT_CATEGORY_MENU);
        if (!productValidator.isQuit(result)) {
            arr[2] = result;
        }

        arr[3] = DEFAULT_DISCOUNT;
        arr[4] = DEFAULT_DESCRIPTION;
        return arr;
    }

    private String[] createOptionalProductMenu() {
        String[] arr = createDefaultProductMenu();
        arr[3] = getProductDiscountMenu(ADD_PRODUCT_DISCOUNT_MENU);
        if (productValidator.isQuit(arr[3])) {
            return arr;
        }
        arr[4] = getProductDescriptionMenu(ADD_PRODUCT_DESCRIPTION_MENU);
        return arr;
    }

    private String getProductNameMenu(String menu) {
        String result;
        while (true) {
            LOGGER.info(menu);
            if (scanner.hasNextLine()) {
                result = scanner.nextLine();
                if (productValidator.isNotEmptyString(result)) {
                    return result;
                }
                errorMenu(CORRECT_NAME_ERROR_STRING);
            }
        }
    }

    private String getProductCategoryMenu(String menu) {
        String result;
        while (true) {
            LOGGER.info(menu);
            if (scanner.hasNextLine()) {
                result = scanner.nextLine();
                if (productValidator.isCategory(result) || productValidator.isQuit(result)) {
                    return result.toUpperCase();
                }
                errorMenu(CORRECT_CATEGORY_ERROR_STRING);
            }
        }
    }

    private String getProductDescriptionMenu(String menu) {
        String result;
        while (true) {
            LOGGER.info(menu);
            if (scanner.hasNextLine()) {
                result = scanner.nextLine();
                if (productValidator.isNotEmptyString(result)) {
                    return result;
                }
                errorMenu(CORRECT_DESCRIPTION_ERROR_STRING);
            }
        }
    }

    private String getBigDecimalString(String menu, String errorString) {
        String str;
        while (true) {
            LOGGER.info(menu);
            if (scanner.hasNextLine()) {
                str = scanner.nextLine();
                if (productValidator.isBigDecimal(str)) {
                    return str;
                } else if (productValidator.isQuit(str)) {
                    return str;
                }
            }
            errorMenu(errorString);
        }
    }

    private String getProductPriceMenu(String menu) {
        return getBigDecimalString(menu, CORRECT_PRICE_ERROR_STRING);
    }

    private String getProductDiscountMenu(String menu) {
        return getBigDecimalString(menu, CORRECT_DISCOUNT_ERROR_STRING);
    }

    private void loadFromFile() {
        try {
            service.loadFromFileToMemoryDatabase();
            successOperation();
        } catch (ProductFileDatabaseException e) {
            errorMenu(e.getMessage());
        }
    }

    private void saveToFile() {
        try {
            service.saveToFileFromMemoryDatabase();
            successOperation();
        } catch (ProductFileDatabaseException | ProductDatabaseException e) {
            errorMenu(e.getMessage());
        }
    }

    private void errorMenu(String errorMessage) {
        LOGGER.warn(errorMessage);
        LOGGER.warn(DEFAULT_ERROR_STRING);
        scanner.nextLine();
    }

    private void successOperation() {
        LOGGER.info(SUCCESS_OPERATION);
        scanner.nextLine();
    }
}

