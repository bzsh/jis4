package by.jrr.task.creditcard.service;

import by.jrr.task.creditcard.bean.CreditCard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CreditCardServiceTest {
    CreditCard card;
    CreditCardService cardService;

    @Before
    public void setUp(){
        card = new CreditCard(4434_5426_3111_8888L, 1111);
        cardService = new CreditCardService(card);
    }

    @Test
    public void depositWithWrongPinCodeShouldReturnFalse() {
        assertFalse(cardService.deposit(1112, 1000));
    }

    @Test
    public void depositWithRightPinCodeShouldReturnTrue() {
        assertTrue(cardService.deposit(1111, 1000));
    }

    @Test
    public void depositShouldChangeCreditDept() {
        card.setBalance(0);
        card.setCreditDept(2000);
        card.setCreditLimit(2000);
        cardService.deposit(1111, 1999);
        double expected = 1;
        double actual = card.getCreditDept();
        assertEquals(expected, actual, 0);
    }

    @Test
    public void depositShouldChangeCreditDeptAndBalance() {
        card.setBalance(0);
        card.setCreditDept(2000);
        card.setCreditLimit(2000);
        cardService.deposit(1111, 2500);
        double expectedBalance = 500;
        double expectedCreditDept = 0;
        double actualBalance = card.getBalance();
        double actualCreditDept = card.getCreditDept();
        assertEquals(expectedBalance, actualBalance, 0);
        assertEquals(expectedCreditDept, actualCreditDept, 0);
    }

    @Test
    public void withdrawWithRightPinCodeShouldReturnTrue() {
        assertTrue(cardService.withdraw(1111, 0));
    }

    @Test
    public void withdrawWithRightPinCodeShouldReturnFalse() {
        assertFalse(cardService.withdraw(1112, 0));
    }

    @Test
    public void withdrawOutOfCardSolvencyShouldReturnFalse(){
        assertFalse(cardService.withdraw(1111, 1000));
    }

    @Test
    public void withdrawCreditDeptShouldChange(){
        card.setBalance(0);
        card.setCreditDept(0);
        card.setCreditLimit(2000);
        cardService.withdraw(1111, 1000);
        double expected = 1000;
        double actual = card.getCreditDept();
        assertEquals(expected, actual, 0);
    }

    @Test
    public void withdrawWithPositiveBalanceBalanceShouldChange(){
        card.setBalance(1000);
        card.setCreditDept(0);
        card.setCreditLimit(2000);
        cardService.withdraw(1111, 999);
        double expected = 1;
        double actual = card.getBalance();
        assertEquals(expected, actual, 0);
    }

    @Test
    public void withdrawWithPositiveBalanceCreditDeptShouldChange(){
        card.setBalance(1000);
        card.setCreditDept(0);
        card.setCreditLimit(2000);
        cardService.withdraw(1111, 1999);
        double expected = 999;
        double actual = card.getCreditDept();
        assertEquals(expected, actual, 0);
    }
}