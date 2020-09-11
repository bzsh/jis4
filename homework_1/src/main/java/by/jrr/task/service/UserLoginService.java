package by.jrr.task.service;

import by.jrr.task.bean.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class UserLoginService {
    private static final Logger LOGGER = LogManager.getLogger(UserLoginService.class);

    public boolean login(User user, String password) {
        LOGGER.info("Logging user");
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
        LOGGER.info("Comparing passwords");
        return user.getPassword().equals(password);
    }

    public User blockUser(User user) {
        LOGGER.info("Blocking user");
        user.setBlocked(true);
        return user;
    }

    public User resetCountOfLoginAttempts(User user){
        LOGGER.info("Resetting counter of login attempts");
        user.setCountOfLoginAttempts(3);
        return user;
    }

    public boolean isUserBlocked(User user) {
        LOGGER.info("Blocking user");
        return user.isBlocked();
    }

    public User decrementCountOfLoginAttempts(User user) {
        LOGGER.info("Decrementing counter of login attempts");
        user.setCountOfLoginAttempts(user.getCountOfLoginAttempts() - 1);
        return user;
    }

    public boolean isLoginAttemptsLeft(User user) {
        LOGGER.info("Returning number of login attempts");
        return user.getCountOfLoginAttempts() > 0;
    }
}
