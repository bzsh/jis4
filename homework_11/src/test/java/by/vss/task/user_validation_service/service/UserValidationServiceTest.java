package by.vss.task.user_validation_service.service;

import by.vss.task.user_validation_service.bean.User;
import by.vss.task.user_validation_service.exception.UserValidationException;
import org.junit.Before;
import org.junit.Test;

import static by.vss.task.user_validation_service.service.UserValidationService.*;

public class UserValidationServiceTest {
    User userOne;
    User userTwo;
    User userThree;

    @Before
    public void setup() {
        userOne = new User("Ualentinov", "Ualentin", 200);
        userTwo = new User("FirstName", "Ln", 21);
        userThree = new User("VeryBigFirstName", "Name", 19);
    }

    @Test(expected = UserValidationException.class)
    public void checkMinSymbolsShouldThrowException() {
        checkMinSymbolsInFirstAndLastName(userTwo);
    }

    @Test(expected = UserValidationException.class)
    public void checkMaxSymbolsShouldThrowException() {
        checkMaxSymbolsInFirstAndLastName(userThree);
    }

    @Test(expected = UserValidationException.class)
    public void checkPermittedAgeShouldThrowException() {
        checkPermittedAge(userOne);
    }

    @Test
    public void checkMinSymbolsShouldNotThrowException() {
        checkMinSymbolsInFirstAndLastName(userOne);
    }

    @Test
    public void checkMaxSymbolsShouldNotThrowException() {
        checkMaxSymbolsInFirstAndLastName(userOne);
    }

    @Test
    public void checkPermittedAgeShouldNotThrowException() {
        checkPermittedAge(userThree);
    }
}