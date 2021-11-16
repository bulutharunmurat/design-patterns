package state;

public class stateDemo {
    public static void main(String[] args) {

        VendingMachine vendingMachine = new VendingMachine(10);

        vendingMachine.insertDollar();
        System.out.println(vendingMachine.getCurrentState());
        vendingMachine.insertDollar();
        vendingMachine.dispense();
        System.out.println(vendingMachine.getCurrentState());

    }
}
