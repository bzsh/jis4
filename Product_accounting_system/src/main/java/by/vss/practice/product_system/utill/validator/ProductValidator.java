package by.vss.practice.product_system.utill.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ProductValidator {
    private static final String LOGIN = "admin";
    private static final String PASSWORD = "admin";

    private static final Pattern NUMBER_PATTERN = Pattern.compile("\\d+");
    private static final Pattern QUITE_PATTERN = Pattern.compile("(QUIT)|(EXIT)");
    private static final Pattern CATEGORY_PATTERN = Pattern.compile("(MEAT)|(MILK)|(ALCOHOL)|(FRUIT)|(VEGETABLES)|(FISH)|(BAKERY)");
    private  static final Pattern BIG_DECIMAL_PATTERN = Pattern.compile("\\d+(\\.\\d{1,3})?");
    private static Matcher matcher;

    public static boolean isNumber(String answer) {
        matcher = NUMBER_PATTERN.matcher(answer);
        return matcher.matches();
    }

    public static boolean isBigDecimal(String answer) {
        matcher = BIG_DECIMAL_PATTERN.matcher(answer);
        return matcher.matches();
    }

    public static boolean isQuit(String answer) {
        matcher = QUITE_PATTERN.matcher(answer.toUpperCase());
        return matcher.matches();
    }

    public static boolean isCategory(String answer) {
        matcher = CATEGORY_PATTERN.matcher(answer.toUpperCase());
        return matcher.matches();
    }

    public static boolean isNotEmptyString(String answer) {
        return !answer.isEmpty();
    }

    public static boolean checkLogin(String login) {
        return login.equals(LOGIN);
    }

    public static boolean checkPassword(String password) {
        return password.equals(PASSWORD);
    }


}

