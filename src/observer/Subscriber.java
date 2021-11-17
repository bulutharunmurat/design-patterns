package observer;

public class Subscriber implements Observer{
    @Override
    public void update() {
        System.out.println("Subscriber notification is successful!!!");
    }
}
