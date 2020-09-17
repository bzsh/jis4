package by.jrr.task.user_login.service;

import by.jrr.task.user_login.bean.User;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserLoginServiceTest {

    @Test
    public void loginTestShouldReturnTrue() {
        User user = new User("User", "1234");
        UserLoginService userLoginService = new UserLoginService();
        boolean actual = userLoginService.login(user, "1234");
        assertTrue(actual);
    }
    @Test
    public void loginTestShouldReturnFalse() {
        User user = new User("User", "1234");
        UserLoginService userLoginService = new UserLoginService();
        boolean actual = userLoginService.login(user, "12345");
        assertFalse(actual);
    }

    @Test
    public void comparePasswordsShouldReturnTrue() {
        User user = new User("User", "1234");
        UserLoginService userLoginService = new UserLoginService();
        boolean condition = userLoginService.comparePasswords(user, "1234");
        assertTrue(condition);
    }

    @Test
    public void comparePasswordsShouldReturnFalse() {
        User user = new User("User", "1234");
        UserLoginService userLoginService = new UserLoginService();
        boolean condition = userLoginService.comparePasswords(user, "12234");
        assertFalse(condition);
    }

    @Test
    public void resetCountOfLoginAttempts() {
        User user = new User("User", "1234");
        UserLoginService userLoginService = new UserLoginService();
        user.setCountOfLoginAttempts(12);
        userLoginService.resetCountOfLoginAttempts(user);
        int expected = 3;
        int actual = user.getCountOfLoginAttempts();
        assertEquals(expected, actual);
    }

    @Test
    public void decrementCountOfLoginAttempts() {
        User user = new User("User", "1234");
        UserLoginService userLoginService = new UserLoginService();
        userLoginService.decrementCountOfLoginAttempts(user);
        int expected = 2;
        int actual = user.getCountOfLoginAttempts();
        assertEquals(expected, actual);
    }

    @Test
    public void checkIfPasswordMatchUserPasswordShouldReturnTrue() {
        User user = new User("User", "1234");
        UserLoginService userLoginService = new UserLoginService();
        boolean actual = userLoginService.comparePasswords(user, "1234");
        assertTrue(actual);
    }
    @Test
    public void checkIfPasswordMatchUserPasswordShouldReturnFalse() {
        User user = new User("User", "1234");
        UserLoginService userLoginService = new UserLoginService();
        boolean actual = userLoginService.comparePasswords(user, "12345");
        assertFalse(actual);
    }

    @Test
    public void dropLoginAttempLeft() {
        User user = new User("User", "1234");
        UserLoginService userLoginService = new UserLoginService();
        user.setCountOfLoginAttempts(1);
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
        boolean actual = userLoginService.isUserBlocked(user);
        assertTrue(actual);
    }
    @Test
    public void isUserBlockedShouldReturnFalse() {
        User user = new User("User", "1234");
        user.setBlocked(false);
        UserLoginService userLoginService = new UserLoginService();
        boolean actual = userLoginService.isUserBlocked(user);
        assertFalse(actual);
    }

    @Test
    public void decrementLoginAttemptLeft() {
        User user = new User("User", "1234");
        user.setCountOfLoginAttempts(3);
        UserLoginService userLoginService = new UserLoginService();
        int expected = 2;
        userLoginService.decrementCountOfLoginAttempts(user);
        int actual = user.getCountOfLoginAttempts();
        assertEquals(expected, actual);
    }

    @Test
    public void blockUserShouldReturnTrue() {
        User user = new User("User", "1234");
        UserLoginService userLoginService = new UserLoginService();
        userLoginService.blockUser(user);
        boolean actual = user.isBlocked();
        assertTrue(actual);
    }

    @Test
    public void ifLoginAttemptLeftIsLeft() {
        User user = new User("User", "1234");
        user.setCountOfLoginAttempts(1);
        UserLoginService userLoginService = new UserLoginService();
        boolean actual = userLoginService.isLoginAttemptsLeft(user);
        assertTrue(actual);
    }

    @Test
    public void loginShouldBlockUser() {
        User user = new User("User", "1234");
        user.setCountOfLoginAttempts(1);
        UserLoginService userLoginService = new UserLoginService();
        userLoginService.login(user, "12345");
        boolean actual = user.isBlocked();
        assertTrue(actual);
    }
    @Test
    public void loginShouldNotProceed() {
        User user = new User("User", "1234");
        user.setCountOfLoginAttempts(0);
        user.setBlocked(true);
        UserLoginService userLoginService = new UserLoginService();
        boolean actual = userLoginService.login(user, "1234");
        assertFalse(actual);
    }
}