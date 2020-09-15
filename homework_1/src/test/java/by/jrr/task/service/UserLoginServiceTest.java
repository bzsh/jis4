package by.jrr.task.service;

import by.jrr.task.bean.User;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserLoginServiceTest {
    @Test
    public void loginTestshouldReturnTrue() {
        User user = new User("User", "1234");

        UserLoginService userLoginService = new UserLoginService();
        boolean actual = userLoginService.login(user, "1234");

        boolean expected = true;

        assertEquals(expected, actual);
    }

    @Test
    public void loginTestShouldReturnFalse() {
        User user = new User("User", "1234");

        UserLoginService userLoginService = new UserLoginService();
        boolean actual = userLoginService.login(user, "12345");

        boolean expected = false;

        assertEquals(expected, actual);
    }

    @Test
    public void comparePasswordsShouldReturnTrue() {
        User user = new User("User", "1234");
        UserLoginService userLoginService = new UserLoginService();
        String password = "1234";

        boolean expected = true;
        boolean actual = userLoginService.comparePasswords(user, password);

        assertEquals(expected, actual);
    }

    @Test
    public void comparePasswordsShouldReturnFalse() {
        User user = new User("User", "1234");
        UserLoginService userLoginService = new UserLoginService();
        String password = "12345";

        boolean expected = false;
        boolean actual = userLoginService.comparePasswords(user, password);

        assertEquals(expected, actual);
    }

    @Test
    public void checkIfPasswordMatchUserPasswordShouldReturnTrue() {
        User user = new User("User", "1234");

        UserLoginService userLoginService = new UserLoginService();
        boolean actual = userLoginService.comparePasswords(user, "1234");

        boolean expected = true;

        assertEquals(expected, actual);
    }

    @Test
    public void checkIfPasswordMatchUserPasswordShouldReturnFalse() {
        User user = new User("User", "1234");

        UserLoginService userLoginService = new UserLoginService();
        boolean actual = userLoginService.comparePasswords(user, "12345");

        boolean expected = false;

        assertEquals(expected, actual);
    }

    @Test
    public void dropLoginAttempLeft() {
        User user = new User("User", "1234");
        user.setCountOfLoginAttempts(1);

        UserLoginService userLoginService = new UserLoginService();
        User updatedUser = userLoginService.resetCountOfLoginAttempts(user);

        int expected = 3;
        int actual = updatedUser.getCountOfLoginAttempts();

        assertEquals(expected, actual);
    }

    @Test
    public void isUserBlockedShouldReturnTrue() {
        User user = new User("User", "1234");
        user.setBlocked(true);

        UserLoginService userLoginService = new UserLoginService();

        boolean expected = true;
        boolean actual = userLoginService.isUserBlocked(user);

        assertEquals(expected, actual);
    }

    @Test
    public void isUserBlockedShouldReturnfalse() {
        User user = new User("User", "1234");
        user.setBlocked(false);

        UserLoginService userLoginService = new UserLoginService();

        boolean expected = false;
        boolean actual = userLoginService.isUserBlocked(user);

        assertEquals(expected, actual);
    }

    @Test
    public void decrementloginAttemptLeft() {
        User user = new User("User", "1234");
        user.setCountOfLoginAttempts(3);

        UserLoginService userLoginService = new UserLoginService();

        int expected = 2;
        userLoginService.decrementCountOfLoginAttempts(user);
        int actual = user.getCountOfLoginAttempts();

        assertEquals(expected, actual);
    }

    @Test
    public void blockUser() {
        User user = new User("User", "1234");

        UserLoginService userLoginService = new UserLoginService();

        boolean expected = true;
        userLoginService.blockUser(user);
        boolean actual = user.isBlocked();

        assertEquals(expected, actual);
    }

    @Test
    public void ifLoginAttemptLeftIsLeft() {
        User user = new User("User", "1234");
        user.setCountOfLoginAttempts(1);

        UserLoginService userLoginService = new UserLoginService();

        boolean expected = true;
        boolean actual = userLoginService.isLoginAttemptsLeft(user);

        assertEquals(expected, actual);
    }

    @Test
    public void loginShouldBlockUser() {
        User user = new User("User", "1234");
        user.setCountOfLoginAttempts(1);

        UserLoginService userLoginService = new UserLoginService();

        userLoginService.login(user, "12345");
        boolean actual = user.isBlocked();
        boolean expected = true;

        assertEquals(expected, actual);
    }

    @Test
    public void loginShouldNotProceed() {
        User user = new User("User", "1234");
        user.setCountOfLoginAttempts(0);
        user.setBlocked(true);

        UserLoginService userLoginService = new UserLoginService();

        boolean actual = userLoginService.login(user, "1234");
        boolean expected = false;

        assertEquals(expected, actual);
    }
}