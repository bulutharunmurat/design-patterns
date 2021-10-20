package facade;

import java.math.BigDecimal;

public class Savings implements IAccount{

    private BigDecimal initAmount;

    public Savings(BigDecimal initAmount) {
        this.initAmount = initAmount;
    }

    public BigDecimal getInitAmount() {
        return initAmount;
    }

    @Override
    public void deposit(BigDecimal amount) {

    }

    @Override
    public void withdraw(BigDecimal amount) {

    }

    @Override
    public void transfer(Object account, BigDecimal amount) {
    }

    @Override
    public int getAccountNumber() {
        return 1;
    }
}
