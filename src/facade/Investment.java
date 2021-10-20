package facade;

import java.math.BigDecimal;

public class Investment implements IAccount{

    private BigDecimal initAmount;

    public Investment(BigDecimal initAmount) {
        this.initAmount = initAmount;
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

    public BigDecimal getInitAmount() {
        return initAmount;
    }

    @Override
    public int getAccountNumber() {
        return 0;
    }
}
