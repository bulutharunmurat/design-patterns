package facade;

import java.math.BigDecimal;

public interface IAccount {

    public void deposit(BigDecimal amount);
    public void withdraw(BigDecimal amount);
    public void transfer(Object account, BigDecimal amount);
    public int getAccountNumber();

}
