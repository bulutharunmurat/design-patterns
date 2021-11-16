package state;

public class HasOneDollarState implements State {
    public void insertDollar( VendingMachine vendingMachine ) {
        System.out.println( "already have one dollar" );
    }
    public void ejectMoney( VendingMachine vendingMachine ) {
        System.out.println( "returning money" );
        vendingMachine.setCurrentState(
                vendingMachine.getIdleState()
        );
    }

    public void dispense( VendingMachine vendingMachine ) {
        System.out.println( "releasing product" );
        if (vendingMachine.getCount() > 1) {
            vendingMachine.ejectMoney();
            vendingMachine.setCurrentState(
                    vendingMachine.getIdleState()
            );
        } else {
            vendingMachine.ejectMoney();
            vendingMachine.setCurrentState(
                    vendingMachine.getOutOfStockState() );
        }
    }
}