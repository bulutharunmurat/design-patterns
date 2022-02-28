package facade;

import java.math.BigDecimal;

public class Investment implements IAccount{

    private BigDecimal initAmount;

    public Investment(BigDecimal initAmount) {
        this.initAmount = initAmount;
    }

    @Override
    public void deposit(BigDecimal amount) {
        this.initAmount = this.initAmount.add(amount);
    }

    @Override
    public void withdraw(BigDecimal amount) {
        this.initAmount = this.initAmount.subtract(amount);
    }

    @Override
    public void transfer(IAccount account, BigDecimal amount) {
        this.withdraw(amount);
        account.deposit(amount);
    }

    public BigDecimal getInitAmount() {
        return this.initAmount;
    }

    @Override
    public int getAccountNumber() {
        return 0;
    }
}
