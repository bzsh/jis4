package by.vss.practice.product_system.utill.validator;

import org.junit.Test;

import static org.junit.Assert.*;

public class ProductValidatorTest {

    @Test
    public void isDigit() {
    }

    @Test
    public void isQuit() {
        assertTrue(ProductValidator.isQuit("quit"));
    }
    @Test
    public void isNotQuit() {
        assertFalse(ProductValidator.isQuit(""));
    }

    @Test
    public void isExit() {
        assertTrue(ProductValidator.isQuit("exit"));
    }
    @Test
    public void isNotExit() {
        assertFalse(ProductValidator.isQuit(""));
    }

    @Test
    public void isCategory() {
        assertTrue(ProductValidator.isCategory("vegetables"));
    }

    @Test
    public void isNotCategory() {
        assertFalse(ProductValidator.isCategory("smth"));
    }

    @Test
    public void isCorrectString() {
    }

    @Test
    public void isBigInteger() {
    }

    @Test
    public void checkLogin() {
    }

    @Test
    public void checkPassword() {
    }
}