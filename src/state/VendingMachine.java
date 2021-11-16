package state;

public class VendingMachine {

    private State idleState;
    private State hasOneDollarState;
    private State outOfStockState;
    private State currentState;


    private int count;

    public VendingMachine( int count ) {
        // make the needed states
        idleState = new IdleState();
        hasOneDollarState = new HasOneDollarState();
        outOfStockState = new outOfStockState();
        if (count > 0) {
            currentState = idleState;
            this.count = count;
        } else {
            currentState = outOfStockState;
            this.count = 0;
        }
    }

    public State getIdleState() {
        return idleState;
    }

    public void setIdleState(State idleState) {
        this.idleState = idleState;
    }

    public State getHasOneDollarState() {
        return hasOneDollarState;
    }

    public void setHasOneDollarState(State hasOneDollarState) {
        this.hasOneDollarState = hasOneDollarState;
    }

    public State getOutOfStockState() {
        return outOfStockState;
    }

    public void setOutOfStockState(State outOfStockState) {
        this.outOfStockState = outOfStockState;
    }

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void insertDollar(){
        currentState.insertDollar(this);
    }

    public void ejectMoney(){
        currentState.ejectMoney(this);
    }

    public void dispense(){
        currentState.dispense(this);
    }
}
