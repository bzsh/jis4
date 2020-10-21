package by.vss.task.user_validation_service.service;

import by.vss.task.user_validation_service.bean.User;
import by.vss.task.user_validation_service.exception.UserValidationException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class UserValidationService {
    public static final Logger LOGGER = LogManager.getLogger(UserValidationService.class);

    private UserValidationService() {
    }

    public static void checkMinSymbolsInFirstAndLastName(User user) {
        if (user.getFirstName().length() < 3 || user.getLastName().length() < 3) {
            throw new UserValidationException("User FirstName or LastName has less than three characters!");
        }
    }

    public static void checkMaxSymbolsInFirstAndLastName(User user) {
        if (user.getFirstName().length() > 15 || user.getLastName().length() > 15) {
            throw new UserValidationException("User FirstName or LastName has more than fifteen characters!");
        }
    }

    public static void checkPermittedAge(User user) {
        if (user.getAge() > 120 || user.getAge() < 0) {
            throw new UserValidationException("User Age is out of permitted range");
        }
    }
}
