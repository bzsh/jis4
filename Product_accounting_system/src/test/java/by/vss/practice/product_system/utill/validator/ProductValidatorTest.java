package by.vss.practice.product_system.utill.validator;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class ProductValidatorTest {

    @Autowired
    private ProductValidator productValidator;

    @Test
    public void isDigit() {
    }

    @Test
    public void isQuit() {
        assertTrue(productValidator.isQuit("quit"));
    }
    @Test
    public void isNotQuit() {
        assertFalse(productValidator.isQuit(""));
    }

    @Test
    public void isExit() {
        assertTrue(productValidator.isQuit("exit"));
    }
    @Test
    public void isNotExit() {
        assertFalse(productValidator.isQuit(""));
    }

    @Test
    public void isCategory() {
        assertTrue(productValidator.isCategory("vegetables"));
    }

    @Test
    public void isNotCategory() {
        assertFalse(productValidator.isCategory("smth"));
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
