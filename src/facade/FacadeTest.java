package facade;

import java.math.BigDecimal;

public class FacadeTest {
    public static void main(String[] args) {

        BankService bankService = new BankService();
        IAccount savings = bankService.createNewAccount("savings", BigDecimal.valueOf(100));
        IAccount investment = bankService.createNewAccount("investment", BigDecimal.valueOf(500));

        bankService.transferMoney(1,0,BigDecimal.valueOf(25));

        System.out.println(savings.getInitAmount());
        System.out.println(investment.getInitAmount());
    }
}
