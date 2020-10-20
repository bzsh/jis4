package by.vss.practice.product_system.ui;

import by.vss.practice.product_system.exception.ProductDatabaseException;
import by.vss.practice.product_system.service.ProductService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.Scanner;

import static by.vss.practice.product_system.ui.menu.MenuHolder.*;
import static by.vss.practice.product_system.validator.ProductValidator.*;

public class ConsoleUI {
    public final Logger LOGGER = LogManager.getLogger("");
    Scanner scanner;

    public ConsoleUI() {
        scanner = new Scanner(System.in);
    }

    public void menu() {
        loginMenu();
        while (true) {
            int result;
            result = mainMenu();
            switch (result) {
                case 1:
                    addProductMenu();
                    break;
                case 2:
                    getProductByIdMenu();
                    break;
                case 3:
                    getAllProductsMenu();
                    break;
                case 4:
                    deleteProductMenu();
                    break;
                case 5:
                    return;
            }
        }
    }

    private int mainMenu() {
        LOGGER.info(MAIN_MENU);
        String answer = "";
        int result = 0;
        while (true) {
            if (scanner.hasNext()) {
                answer = scanner.nextLine();
            }
            if (isDigit(answer)) {
                result = Integer.parseInt(answer);

                if (result <= 5 && result > 0) {
                    return result;
                } else {
                    errorMenu(MAIN_MENU_ERROR_STRING);
                    return 0;
                }
            }
        }
    }

    private void loginMenu() {
        while (true) {
            LOGGER.info(LOGIN_STRING);
            if (scanner.hasNext() && checkLogin(scanner.next())) {
                LOGGER.info(CORRECT_STRING);
                while (true) {
                    LOGGER.info(PASSWORD_STRING);
                    if (scanner.hasNext() && checkPassword(scanner.next())) {
                        LOGGER.info(CORRECT_STRING);
                        return;
                    }
                    LOGGER.info(PASSWORD_ERROR_STRING);
                }
            }
            LOGGER.info(LOGIN_ERROR_STRING);
        }
    }

    private void clear() {
        LOGGER.info(CLEAR_STRING);
    }

    private int preAddProductMenu() {
        int result;
        while (true) {
            LOGGER.info(PRE_ADD_PRODUCT_MENU);
            if (scanner.hasNextLine()) {
                result = scanner.nextInt();
                if (result <= 3 && result > 0) {
                    return result;
                } else {
                    errorMenu(PRE_ADD_MENU_ERROR_STRING);
                }
            }
        }
    }

    private void addProductMenu() {
        ProductService service = new ProductService();
        boolean isNotAdded = true;
        String[] arr = new String[5];
        while (isNotAdded) {
            int result = preAddProductMenu();
            switch (result) {
                case 1:
                    arr = createDefaultProductMenu();
                    isNotAdded = false;
                    break;
                case 2:
                    arr = createOptionalProductMenu();
                    isNotAdded = false;
                    break;
                case 3:
                    return;
            }
            if (isQuit(arr[2])) {
                return;
            } else {
                service.addProductToDatabase(arr);
                successOperation();
                isNotAdded = false;
            }
        }
    }

    private long preGetProductByIdMenu() {
        while (true) {
            LOGGER.info(PRE_GET_PRODUCT_BY_ID_MENU);
            if (scanner.hasNextLong()) {
                return scanner.nextLong();
            } else if (scanner.hasNext()) {
                if (isQuit(scanner.next())) {
                    return -1;
                } else {
                    errorMenu(PRE_GET_PRODUCT_BY_ID_MENU_ERROR_STRING);
                }
            }
        }
    }

    private void getProductByIdMenu() {
        String result = "";
        long id = preGetProductByIdMenu();
        if (id > 0) {
            ProductService service = new ProductService();
            try {
               result =  service.getProductByIdFromDatabase(id);
            } catch (ProductDatabaseException e) {
                errorMenu(e.getMessage());
            }
            LOGGER.info(result);
        }
    }

    private void getAllProductsMenu() {
        String[] result;
        ProductService service = new ProductService();
        try {
           result = service.getAllProductsFromDatabase();
            Arrays.stream(result).forEach(LOGGER::info);
        } catch (ProductDatabaseException e) {
            errorMenu(e.getMessage());
        }

    }

    private void deleteProductMenu() {                            //TODO

    }

    private String[] createDefaultProductMenu() {
        String[] arr = new String[5];
        arr[0] = addProductNameMenu();
        if (isQuit(arr[0])) {
            return arr;
        }
        arr[1] = addProductPriceMenu();

        if (isQuit(arr[1])) {
            return arr;
        }
        arr[2] = addProductCategoryMenu();

        /*if (isQuit(arr[2])) {                                      //TODO
            return arr;
        }*/
        return arr;
    }

    private String[] createOptionalProductMenu() {
        String[] arr = createDefaultProductMenu();
        arr[3] = addProductDiscountMenu();
        if (isQuit(arr[3])) {
            return arr;
        }
        arr[4] = addProductDescriptionMenu();

        if (isQuit(arr[4])) {                                        //TODO
            return arr;
        }
        return arr;
    }

    private String addProductNameMenu() {
        String result;
        while (true) {
            LOGGER.info(ADD_PRODUCT_NAME_MENU);
            if (scanner.hasNextLine()) {
                result = scanner.nextLine();
                if (isNotEmptyString(result)) {
                    return result;
                }
            } else {
                errorMenu(ADD_NAME_ERROR_STRING);
            }
        }
    }

    private String addProductCategoryMenu() {
        String result;
        while (true) {
            LOGGER.info(ADD_PRODUCT_CATEGORY_MENU);
            if (scanner.hasNextLine()) {
                result = scanner.nextLine();
                if (isCategory(result) || isQuit(result)) {
                    return result.toUpperCase();
                }
                errorMenu(ADD_CATEGORY_ERROR_STRING);
            }
        }
    }

    private String addProductDescriptionMenu() {
        String result;
        while (true) {
            LOGGER.info(ADD_PRODUCT_DESCRIPTION_MENU);
            if (scanner.hasNext()) {
                result = scanner.next();
                if (isNotEmptyString(result)) {
                    return result;
                }
                errorMenu(ADD_DESCRIPTION_ERROR_STRING);
            }
        }
    }

    private String addProductPriceMenu() {
        return getBigDecimalString(ADD_PRODUCT_PRICE_MENU, ADD_PRICE_ERROR_STRING);
    }

    private String addProductDiscountMenu() {
        return getBigDecimalString(ADD_PRODUCT_DISCOUNT_MENU, ADD_DISCOUNT_ERROR_STRING);
    }

    private String getBigDecimalString(String menu, String errorString) {
        String str;
        while (true) {
            LOGGER.info(menu);
            if (scanner.hasNextLine()) {
                str = scanner.nextLine();
                if (isDigit(str)) {
                    return str;
                } else if (isQuit(str)) {
                    return str;
                }
            }
            errorMenu(errorString);
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
