package by.jrr.task.user_login.bean;

import org.junit.Test;

import static org.junit.Assert.*;

public class UserTest {

    @Test
    public void testEqualsShouldReturnTrue() {
        User userOne = new User("Admin","admin");
        User userTwo = new User("Admin","admin");
        boolean expected = userOne.equals(userTwo);
        assertTrue(expected);
    }

    @Test
    public void testEqualsShouldReturnFalse() {
        User userOne = new User("Admin","admin");
        User userTwo = new User("admin","admin");
        boolean expected = userOne.equals(userTwo);
        assertFalse(expected);
    }

    @Test
    public void testHashCode() {
        User user = new User("Admin","admin");
        int expected = -2043247793;
        int actual = user.hashCode();
        assertEquals(expected, actual);
    }

    @Test
    public void testToString() {
        User user = new User("Admin","admin");
        String expected = "User{login='Admin', password='admin', isBlocked=false, loginAttemptLeft=3}";
        String actual = user.toString();
        assertEquals(expected, actual);
    }
}