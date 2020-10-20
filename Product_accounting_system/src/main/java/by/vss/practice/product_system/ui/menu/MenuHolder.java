package by.vss.practice.product_system.ui.menu;

public class MenuHolder {
    public final static String MAIN_MENU =
            "-----------------------------------\n" +
                    "\tWelcome to Product Accounting System" +
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
                    "5. exit";

    public final static String PRE_ADD_PRODUCT_MENU = "-----------------------------------\n" +
            "\t-You are in add product menu-" +
            "\n" +
            "To add a product you need to enter name, price and category of product\n" +
            "optionally you can enter discount and description.\n" +
            "\n" +
            "Enter:\n" +
            " 1 to add new product with default parameters\n" +
            " 2 to add new product with optional parameters\n" +
            " 3 to cancel and return to main menu";

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
            "- Enter \"quit\" to cancel operation and return to add menu\n";;

    public final static String ADD_PRODUCT_DISCOUNT_MENU = "-----------------------------------\n" +
            "- Please enter product discount than press ENTER\n" +
            "- Enter \"quit\" to cancel operation and return to add menu\n";

    public final static String ADD_PRODUCT_DESCRIPTION_MENU = "-----------------------------------\n" +
            "- Please enter product description than press ENTER\n" +
            "- Enter \"quit\" to cancel operation and return to add menu\n";

    public final static String PRE_GET_PRODUCT_BY_ID_MENU = "-----------------------------------\n" +
            "- To get product please enter product ID than press ENTER\n" +
            "- Enter \"quit\" to cancel operation and return to main menu\n";

    public final static String GET_PRODUCT_BY_ID_MENU = "-----------------------------------\n" +
            "\t-Selected product below" +
            "Press ENTER key to return to main menu" +
            "-----------------------------------\n";

    public final static String GET_ALL_PRODUCTS_MENU = "-----------------------------------\n" +
            "\t-All products below" +
            "Press ENTER key to return to main menu" +
            "-----------------------------------\n";

    public final static String DELETE_PRODUCT_BY_ID_MENU = "-----------------------------------\n" +
            "- To delete product please enter product ID than press ENTER\n" +
            "- Enter \"quit\" to cancel operation and return to main menu\n";

    public final static String SUCCESS_OPERATION = "-----------------------------------\n" +
            "\t- Operation successful!" +
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
    public final static String MAIN_MENU_ERROR_STRING = "You have to enter number from 1 to 5";
    public final static String PRE_ADD_MENU_ERROR_STRING = "You have to enter number from 1 to 3";
    public final static String ADD_NAME_ERROR_STRING = "Please enter correct product name";
    public final static String ADD_PRICE_ERROR_STRING = "Please enter correct product price";
    public final static String ADD_CATEGORY_ERROR_STRING = "Please enter correct product category";
    public final static String ADD_DISCOUNT_ERROR_STRING = "You have to enter number from 1 to 3";
    public final static String ADD_DESCRIPTION_ERROR_STRING = "You have to enter number from 1 to 3";
    public final static String PRE_GET_PRODUCT_BY_ID_MENU_ERROR_STRING = "please enter correct product ID";


}
