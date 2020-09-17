package by.jrr.task.user_login.service;

import by.jrr.task.user_login.bean.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class UserLoginService {
    public static final Logger LOGGER = LogManager.getLogger(UserLoginService.class);

    public boolean login(User user, String password) {
        LOGGER.info("login method has been called");
        if (comparePasswords(user, password)) {
            if (!isUserBlocked(user)) {
                resetCountOfLoginAttempts(user);
                return true;
            }
            return false;
        } else {
            decrementCountOfLoginAttempts(user);
            if(!isLoginAttemptsLeft(user)) {
                blockUser(user);
            }
            return false;
        }
    }

    public boolean comparePasswords(User user, String password) {
        LOGGER.info("comparePasswords method has been called");
        return user.getPassword().equals(password);
    }

    public User blockUser(User user) {
        LOGGER.info("blocking user");
        user.setBlocked(true);
        return user;
    }

    public User resetCountOfLoginAttempts(User user){
        LOGGER.info("resetting count of login attempts");
        user.setCountOfLoginAttempts(3);
        return user;
    }

    public boolean isUserBlocked(User user) {
        return user.isBlocked();
    }

    public User decrementCountOfLoginAttempts(User user) {
        LOGGER.info("decrementing count of login attempts");
        user.setCountOfLoginAttempts(user.getCountOfLoginAttempts() - 1);
        return user;
    }

    public boolean isLoginAttemptsLeft(User user) {
        return user.getCountOfLoginAttempts() > 0;
    }
}
