package by.vss.practice.product_system.utill.validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Component
public class ProductValidator {
    private static final Pattern NUMBER_PATTERN = Pattern.compile("\\d+");
    private static final Pattern QUITE_PATTERN = Pattern.compile("(QUIT)|(EXIT)");
    private static final Pattern CATEGORY_PATTERN = Pattern.compile("(MEAT)|(MILK)|(ALCOHOL)|(FRUIT)|(VEGETABLES)|(FISH)|(BAKERY)");
    private static final Pattern BIG_DECIMAL_PATTERN = Pattern.compile("\\d+(\\.\\d{1,3})?");
    private static Matcher matcher;

    @Autowired
    Properties properties;

    public  boolean isNumber(String answer) {
        matcher = NUMBER_PATTERN.matcher(answer);
        return matcher.matches();
    }

    public  boolean isBigDecimal(String answer) {
        matcher = BIG_DECIMAL_PATTERN.matcher(answer);
        return matcher.matches();
    }

    public  boolean isQuit(String answer) {
        matcher = QUITE_PATTERN.matcher(answer.toUpperCase());
        return matcher.matches();
    }

    public  boolean isCategory(String answer) {
        matcher = CATEGORY_PATTERN.matcher(answer.toUpperCase());
        return matcher.matches();
    }

    public  boolean isNotEmptyString(String answer) {
        return !answer.isEmpty();
    }

    public boolean checkLogin(String login) {
        if(login != null) {
            return login.equals(properties.getProperty("login"));
        }
        return false;
    }

    public boolean checkPassword(String password) {
        if(password != null) {
            return password.equals(properties.getProperty("password"));
        }
        return false;
    }

}

