package by.jrr.task.bean;

import org.junit.Test;

import static org.junit.Assert.*;

public class UserTest {

    @Test
    public void testEqualsShouldReturnTrue() {
        User userOne = new User("User", "Password");
        User userTwo = new User("User", "Password");
        boolean expected = true;
        boolean actual = userTwo.equals(userOne);
        assertEquals(expected, actual);
    }
    @Test
    public void testEqualsShouldReturnFalse() {
        User userOne = new User("User", "Password");
        User userTwo = new User("User", "1234567");
        boolean expected = false;
        boolean actual = userTwo.equals(userOne);
        assertEquals(expected, actual);
    }
    @Test
    public void testHashCode() {
        User user = new User("User", "1234");
        int expected = -1326005946;
        int actual = user.hashCode();
        assertEquals(expected, actual);
    }
}