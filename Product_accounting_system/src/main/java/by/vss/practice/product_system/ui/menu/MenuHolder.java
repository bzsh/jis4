package by.vss.practice.product_system.ui.menu;

public class MenuHolder {
    public final static String MAIN_MENU =
            "\n-----------------------------------\n" +
                    "Welcome to Product Accounting System" +
                    "\n" +
                    "\n" +
                    "\tYou are in main menu" +
                    "\n" +
                    "enter menu item number ! " +
                    "\n" +
                    "1. add product\n" +
                    "2. get product by Id\n" +
                    "3. get all products\n" +
                    "4. delete product\n" +
                    "5. update product\n" +
                    "6. save to file\n" +
                    "7. load from file\n" +
                    "8. exit";

    public final static String PRE_ADD_PRODUCT_MENU = "-----------------------------------\n" +
            "\n-You are in add product menu-" +
            "\n" +
            "To add a product you need to enter name, price and category of product\n" +
            "optionally you can enter discount and description.\n" +
            "\n" +
            "Enter:\n" +
            " 1 to add new product with default parameters\n" +
            " 2 to add new product with optional parameters\n" +
            " 3 to cancel and return to main menu\n";

    public final static String ADD_PRODUCT_NAME_MENU = "-----------------------------------\n" +
            "- Please enter product NAME, than press ENTER\n" +
            "- you can use a-z, A-Z Symbols, digits, space and - , _ symbols\n" +
            "- Enter \"quit\" to cancel operation and return to add menu\n";

    public final static String ADD_PRODUCT_PRICE_MENU = "-----------------------------------\n" +
            "- Please enter product PRICE (price should have number format), than press ENTER\n" +
            "- Enter \"quit\" to cancel operation and return to add menu\n";

    public final static String ADD_PRODUCT_CATEGORY_MENU = "-----------------------------------\n" +
            "    FRUIT,\n" +
            "    MEAT,\n" +
            "    MILK,\n" +
            "    ALCOHOL,\n" +
            "    VEGETABLES,\n" +
            "    FISH,\n" +
            "    BAKERY\n" +
            "- Please select and enter product CATEGORY from the list above, than press ENTER\n" +
            "- Enter \"quit\" to cancel operation and return to add menu\n";
    ;

    public final static String ADD_PRODUCT_DISCOUNT_MENU = "-----------------------------------\n" +
            "- Please enter product discount than press ENTER\n" +
            "- Enter \"quit\" to cancel operation and return to add menu\n";

    public final static String ADD_PRODUCT_DESCRIPTION_MENU = "-----------------------------------\n" +
            "- Please enter product description than press ENTER\n" +
            "- Enter \"quit\" to cancel operation and return to add menu\n";

    public final static String PRE_GET_PRODUCT_BY_ID_MENU = "-----------------------------------\n" +
            "- To get product please enter product ID than press ENTER\n" +
            "- Enter \"quit\" to cancel operation and return to main menu\n";

    public final static String DELETE_PRODUCT_BY_ID_MENU = "-----------------------------------\n" +
            "- To delete product please enter product ID than press ENTER\n" +
            "- Enter \"quit\" to cancel operation and return to main menu\n";

    public final static String PRE_UPDATE_PRODUCT_BY_ID_MENU = "-----------------------------------\n" +
            "- To update product please enter product ID than press ENTER\n" +
            "- Enter \"quit\" to cancel operation and return to main menu\n";

    public final static String UPDATE_PRODUCT_BY_ID_MENU = "-----------------------------------\n" +
            "\n-You are in update product menu-" +
            "\n" +
            " Enter:\n" +
            " 1 to update product name\n" +
            " 2 to update product price\n" +
            " 3 to update product category\n" +
            " 4 to update product discount\n" +
            " 5 to update product description\n" +
            " 6 to return to MAIN menu\n";

    public final static String UPDATE_PRODUCT_NAME_MENU = "-----------------------------------\n" +
            "- Please enter new product NAME, than press ENTER\n" +
            "- you can use a-z, A-Z Symbols, digits, space and - , _ symbols\n" +
            "- Enter \"quit\" to cancel operation and return to UPDATE menu\n";

    public final static String UPDATE_PRODUCT_PRICE_MENU = "-----------------------------------\n" +
            "- Please enter new product PRICE (price should have number format), than press ENTER\n" +
            "- Enter \"quit\" to cancel operation and return to UPDATE menu\n";

    public final static String UPDATE_PRODUCT_CATEGORY_MENU = "-----------------------------------\n" +
            "    FRUIT,\n" +
            "    MEAT,\n" +
            "    MILK,\n" +
            "    ALCOHOL,\n" +
            "    VEGETABLES,\n" +
            "    FISH,\n" +
            "    BAKERY\n" +
            "- Please select and enter new product CATEGORY from the list above, than press ENTER\n" +
            "- Enter \"quit\" to cancel operation and return to UPDATE menu\n";
    ;

    public final static String UPDATE_PRODUCT_DISCOUNT_MENU = "-----------------------------------\n" +
            "- Please enter new product DISCOUNT than press ENTER\n" +
            "- Enter \"quit\" to cancel operation and return to UPDATE menu\n";

    public final static String UPDATE_PRODUCT_DESCRIPTION_MENU = "-----------------------------------\n" +
            "- Please enter new product DESCRIPTION than press ENTER\n" +
            "- Enter \"quit\" to cancel operation and return to UPDATE menu\n";

    public final static String SUCCESS_OPERATION = "-----------------------------------\n" +
            "- Operation successful! " +
            "Press ENTER key to return to main menu" +
            "-----------------------------------\n";

    public final static String CLEAR_STRING = "\n\n\n\n\n\n\n\n\n\n" +
            "\n\n\n\n\n\n\n\n\n\n" +
            "\n\n\n\n\n\n\n\n\n\n" +
            "\n\n\n\n\n\n\n\n\n\n" +
            "\n\n\n\n\n\n\n\n\n\n" +
            "\n\n\n\n\n\n\n\n\n\n";

    public final static String LOGIN_STRING = "Please ENTER login than press ENTER";
    public final static String PASSWORD_STRING = "Please enter password than press ENTER";

    public final static String CORRECT_STRING = "good boy";

    public final static String DEFAULT_ERROR_STRING = "Press ENTER key to return and try again!";
    public final static String PASSWORD_ERROR_STRING = "Wrong password! Please enter correct password than press ENTER";
    public final static String LOGIN_ERROR_STRING = "Wrong login! Please enter correct login than press ENTER";
    public final static String MAIN_MENU_ERROR_STRING = "You have to enter number from 1 to 6";
    public final static String PRE_ADD_MENU_ERROR_STRING = "You have to enter number from 1 to 3";
    public final static String PRE_UPDATE_MENU_ERROR_STRING = "You have to enter number from 1 to 6";
    public final static String CORRECT_NAME_ERROR_STRING = "Please enter correct product name";
    public final static String CORRECT_PRICE_ERROR_STRING = "Please enter correct product price";
    public final static String CORRECT_CATEGORY_ERROR_STRING = "Please enter correct product category";
    public final static String CORRECT_DISCOUNT_ERROR_STRING = "Please enter correct product discount";
    public final static String CORRECT_DESCRIPTION_ERROR_STRING = "Please enter correct product description";
    public final static String CORRECT_PRODUCT_ID_ERROR_STRING = "please enter correct product ID";


}
