package by.jrr.task.creditcard.bean;

import org.junit.Test;

import static org.junit.Assert.*;

public class CreditCardTest {

    @Test
    public void testEqualsShouldReturnTrue() {
        CreditCard cardOne = new CreditCard(4434_5426_3111_8888L, 1111);
        CreditCard cardTwo = new CreditCard(4434_5426_3111_8888L, 1111);
        boolean expected = cardOne.equals(cardTwo);
        assertTrue(expected);
    }

    @Test
    public void testEqualsShouldReturnFalse() {
        CreditCard cardOne = new CreditCard(4434_5426_3111_8888L, 1111);
        CreditCard cardTwo = new CreditCard(4434_5426_3111_8888L, 1112);
        boolean expected = cardOne.equals(cardTwo);
        assertFalse(expected);
    }

    @Test
    public void testHashCode() {
        CreditCard cardOne = new CreditCard(4434_5426_3111_8888L, 1111);
        int expected = -1818438271;
        int actual = cardOne.hashCode();
        assertEquals(expected, actual);
    }

    @Test
    public void testToString() {
        CreditCard card = new CreditCard(4434_5426_3111_8888L, 1111);
        String expected = "CreditCard{cardNumber=4434542631118888, pinCode=1111, balance=0.0, creditLimit=0.0, creditDept=0.0}";
        String actual = card.toString();
        assertEquals(expected, actual);
    }
}