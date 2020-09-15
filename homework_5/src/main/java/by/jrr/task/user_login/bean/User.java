package by.jrr.task.user_login.bean;

import java.util.Objects;

public class User {

    private String login;
    private String password;
    private boolean isBlocked;
    private int countOfLoginAttempts;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
        this.isBlocked = false;
        this.countOfLoginAttempts = 3;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isBlocked() {
        return isBlocked;
    }

    public void setBlocked(boolean blocked) {
        isBlocked = blocked;
    }

    public int getCountOfLoginAttempts() {
        return countOfLoginAttempts;
    }

    public void setCountOfLoginAttempts(int countOfLoginAttempts) {
        this.countOfLoginAttempts = countOfLoginAttempts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return isBlocked == user.isBlocked &&
                countOfLoginAttempts == user.countOfLoginAttempts &&
                Objects.equals(login, user.login) &&
                Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, password, isBlocked, countOfLoginAttempts);
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", isBlocked=" + isBlocked +
                ", loginAttemptLeft=" + countOfLoginAttempts +
                '}';
    }
}
