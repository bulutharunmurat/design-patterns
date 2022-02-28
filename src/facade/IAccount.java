package facade;

import java.math.BigDecimal;

public interface IAccount {

    void deposit(BigDecimal amount);
    void withdraw(BigDecimal amount);
    void transfer(IAccount account, BigDecimal amount);
    int getAccountNumber();
    BigDecimal getInitAmount();

}
