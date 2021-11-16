package state;

public class IdleState implements State{
    @Override
    public void insertDollar(VendingMachine vendingMachine) {
        System.out.println( "dollar inserted" );
        vendingMachine.setCurrentState(
                vendingMachine.getHasOneDollarState()
        );
    }

    @Override
    public void ejectMoney(VendingMachine vendingMachine) {

    }

    @Override
    public void dispense(VendingMachine vendingMachine) {

    }
}
