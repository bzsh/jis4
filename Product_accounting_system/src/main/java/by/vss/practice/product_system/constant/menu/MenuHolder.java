package by.vss.practice.product_system.constant.menu;

public final class MenuHolder {
    public static final String DEFAULT_DISCOUNT = "0.0";
    public static final String DEFAULT_DESCRIPTION = "default description";
    public static final int NUMBER_OF_MAIN_MENU_ITEMS = 10;
    public static final String STRING_LINE = "-----------------------------------\n";
    public static final String QUIT_TO_ADD_MENU_STRING = "- Enter \"quit\" to cancel operation and return to add menu\n";
    public static final String QUIT_TO_MAIN_MENU_STRING = "- Enter \"quit\" to cancel operation and return to main menu\n";
    public static final String QUIT_TO_UPDATE_MENU_STRING = "- Enter \"quit\" to cancel operation and return to update menu\n";
    public static final String MAIN_MENU = "\n" + STRING_LINE +
                    "Welcome to Product Accounting System" +
                    "\n" +
                    "\n" +
                    "\tYou are in main menu" +
                    "\n" +
                    "enter menu item number ! " +
                    "\n" +
                    "1. add product\n" +
                    "2. get product by Id\n" +
                    "3. get all products by Category\n" +
                    "4. get all products\n" +
                    "5. delete product\n" +
                    "6. update product by Id\n" +
                    "7. update products discount by category\n" +
                    "8. save to file\n" +
                    "9. load from file\n" +
                    "10. exit";
    public static final int NUMBER_OF_PRE_ADD_MENU_ITEMS = 3;
    public static final String PRE_ADD_PRODUCT_MENU = STRING_LINE +
            "\n-You are in add product menu-" +
            "\n" +
            "To add a product you need to enter name, price and category of product\n" +
            "optionally you can enter discount and description.\n" +
            "\n" +
            "Enter:\n" +
            " 1 to add new product with default parameters\n" +
            " 2 to add new product with optional parameters\n" +
            " 3 to cancel and return to main menu\n";
    public static final String ADD_PRODUCT_NAME_MENU = STRING_LINE +
            "- Please enter product NAME, than press ENTER\n" +
            "- you can use a-z, A-Z Symbols, digits, space and - , _ symbols\n" +
            QUIT_TO_ADD_MENU_STRING;
    public static final String ADD_PRODUCT_PRICE_MENU = STRING_LINE +
            "- Please enter product PRICE (price should have number format), than press ENTER\n" +
            QUIT_TO_ADD_MENU_STRING;
    public static final String ADD_PRODUCT_CATEGORY_MENU = STRING_LINE +
            "    FRUIT,\n" +
            "    MEAT,\n" +
            "    MILK,\n" +
            "    ALCOHOL,\n" +
            "    VEGETABLES,\n" +
            "    FISH,\n" +
            "    BAKERY\n" +
            "- Please select and enter product CATEGORY from the list above, than press ENTER\n" +
            QUIT_TO_ADD_MENU_STRING;
    public static final String ADD_PRODUCT_DISCOUNT_MENU = STRING_LINE +
            "- Please enter product discount than press ENTER\n" +
            QUIT_TO_ADD_MENU_STRING;
    public static final String ADD_PRODUCT_DESCRIPTION_MENU = STRING_LINE +
            "- Please enter product description than press ENTER\n" +
            QUIT_TO_ADD_MENU_STRING;
    public static final String PRE_GET_PRODUCT_BY_ID_MENU = STRING_LINE +
            "- To get product please enter product ID than press ENTER\n" +
            QUIT_TO_MAIN_MENU_STRING;
    public static final String DELETE_PRODUCT_BY_ID_MENU = STRING_LINE +
            "- To delete product please enter product ID than press ENTER\n" +
            QUIT_TO_MAIN_MENU_STRING;
    public static final String PRE_UPDATE_PRODUCT_BY_ID_MENU = STRING_LINE +
            "- To update product please enter product ID than press ENTER\n" +
            QUIT_TO_MAIN_MENU_STRING;
    public static final int NUMBER_OF_UPDATE_MENU_ITEMS = 6;
    public static final String UPDATE_PRODUCT_BY_ID_MENU = STRING_LINE +
            "\n-You are in update product menu-" +
            "\n" +
            " Enter:\n" +
            " 1 to update product name\n" +
            " 2 to update product price\n" +
            " 3 to update product category\n" +
            " 4 to update product discount\n" +
            " 5 to update product description\n" +
            " 6 to return to MAIN menu\n";
    public static final String UPDATE_PRODUCT_NAME_MENU = STRING_LINE +
            "- Please enter new product NAME, than press ENTER\n" +
            "- you can use a-z, A-Z Symbols, digits, space and - , _ symbols\n" +
            QUIT_TO_UPDATE_MENU_STRING;
    public static final String UPDATE_PRODUCT_PRICE_MENU = STRING_LINE +
            "- Please enter new product PRICE (price should have number format), than press ENTER\n" +
            QUIT_TO_UPDATE_MENU_STRING;
    public static final String UPDATE_PRODUCT_CATEGORY_MENU = STRING_LINE +
            "    FRUIT,\n" +
            "    MEAT,\n" +
            "    MILK,\n" +
            "    ALCOHOL,\n" +
            "    VEGETABLES,\n" +
            "    FISH,\n" +
            "    BAKERY\n" +
            "- Please select and enter new product CATEGORY from the list above, than press ENTER\n" +
            QUIT_TO_UPDATE_MENU_STRING;
    public static final String UPDATE_PRODUCT_DISCOUNT_MENU = STRING_LINE +
            "- Please enter new product DISCOUNT than press ENTER\n" +
            QUIT_TO_UPDATE_MENU_STRING;
    public static final String UPDATE_PRODUCT_DESCRIPTION_MENU = STRING_LINE +
            "- Please enter new product DESCRIPTION than press ENTER\n" +
            QUIT_TO_UPDATE_MENU_STRING;
    public static final String SUCCESS_OPERATION = STRING_LINE +
            "- Operation successful! " +
            "Press ENTER key to return to main menu" +
            STRING_LINE;
    public static final String LOGIN_STRING = "Please ENTER login than press ENTER";
    public static final String PASSWORD_STRING = "Please enter password than press ENTER";
    public static final String CORRECT_STRING = "good boy";
    public static final String DEFAULT_ERROR_STRING = "Press ENTER key to return and try again!";
    public static final String PASSWORD_ERROR_STRING = "Wrong password! Please enter correct password than press ENTER";
    public static final String LOGIN_ERROR_STRING = "Wrong login! Please enter correct login than press ENTER";
    public static final String MAIN_MENU_ERROR_STRING = "You have to enter number from 1 to 10";
    public static final String PRE_ADD_MENU_ERROR_STRING = "You have to enter number from 1 to 3";
    public static final String PRE_UPDATE_MENU_ERROR_STRING = "You have to enter number from 1 to 6";
    public static final String CORRECT_NAME_ERROR_STRING = "Please enter correct product name";
    public static final String CORRECT_PRICE_ERROR_STRING = "Please enter correct product price";
    public static final String CORRECT_CATEGORY_ERROR_STRING = "Please enter correct product category";
    public static final String CORRECT_DISCOUNT_ERROR_STRING = "Please enter correct product discount";
    public static final String CORRECT_DESCRIPTION_ERROR_STRING = "Please enter correct product description";
    public static final String CORRECT_PRODUCT_ID_ERROR_STRING = "please enter correct product ID";

    private MenuHolder() {
    }
}
