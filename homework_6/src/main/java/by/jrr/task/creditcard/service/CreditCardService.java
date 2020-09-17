package by.jrr.task.creditcard.service;

import by.jrr.task.creditcard.bean.CreditCard;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CreditCardService {
    public static final Logger LOGGER = LogManager.getLogger(CreditCardService.class);
    private final CreditCard card;

    public CreditCardService(CreditCard card) {
        this.card = card;
    }

    public boolean deposit(int pinCode, double sum) {
        if (checkPinCode(pinCode)) {
            if (isCardHasDept()) {
                repayCredit(sum);
            } else {
                rechargeBalance(sum);
            }
            return true;
        } else {
            LOGGER.warn("Wrong pinCode, operation rejected !");
            return false;
        }
    }

    public boolean withdraw(int pinCode, double sum) {
        if (checkPinCode(pinCode)) {
            if (!isSumWithdrawMoreThanCardsSolvency(sum)) {
                if (isSumWithdrawMoreBalance(sum)) {
                    withdrawFromBalanceAndCredit(sum);
                } else {
                    withdrawFromBalance(sum);
                }
                return true;
            } else {
                LOGGER.warn("Sum withdraw more than cards solvency, operation rejected !");
                return false;
            }
        } else {
            LOGGER.warn("Wrong pinCode, operation rejected !");
            return false;
        }
    }

    private boolean checkPinCode(int pinCode) {
        if (card.getPinCode() == pinCode) {
            LOGGER.info("pinCodes match");
            return true;
        } else {
            LOGGER.info("pinCodes do not match");
            return false;
        }
    }

    private void repayCredit(double sum) {
        if (isDeptMoreOrEqualDeposit(sum)) {
            card.setCreditDept(card.getCreditDept() - sum);
        } else {
            sum -= card.getCreditDept();
            card.setCreditDept(0);
            rechargeBalance(sum);
        }
    }

    private void rechargeBalance(double sum) {
        card.setBalance(sum);
    }

    private void withdrawFromBalance(double sum) {
        card.setBalance(card.getBalance() - sum);
    }

    private void withdrawFromBalanceAndCredit(double sum) {
        sum -= card.getBalance();
        card.setBalance(0);
        sum += card.getCreditDept();
        card.setCreditDept(sum);
    }

    private boolean isCardHasDept() {
        return card.getCreditDept() > 0;
    }

    private boolean isDeptMoreOrEqualDeposit(double sum) {
        return card.getCreditDept() >= sum;
    }

    private boolean isSumWithdrawMoreBalance(double sum) {
        return sum > card.getBalance();
    }

    private boolean isSumWithdrawMoreThanCardsSolvency(double sum) {
        return sum > card.getBalance() + card.getCreditLimit() - card.getCreditDept();
    }
}
