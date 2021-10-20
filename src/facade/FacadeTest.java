package facade;

import java.math.BigDecimal;

public class FacadeTest {
    public static void main(String[] args) {

        BankService bankService = new BankService();
        Savings accountA = (Savings) bankService.createNewAccount("savings", BigDecimal.valueOf(100));
        Investment accountB = (Investment) bankService.createNewAccount("investment", BigDecimal.valueOf(500));

        bankService.transferMoney(1,0,BigDecimal.valueOf(25));
    }
}
