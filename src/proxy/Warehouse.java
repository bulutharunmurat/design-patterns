package proxy;

import java.util.Hashtable;

public class Warehouse implements IOrder{
    private Hashtable<String, Integer> stock;
    private String address;
    /* Constructors and other attributes would go here */

    @Override
    public void fulfillOrder(Order order) {
        for (String item : order.getItemList())
            this.stock.replace(item, stock.get(item)-1);
        /* Process the order for shipment and delivery */

    }
    public int currentInventory(String item) {
        if (stock.containsKey(item))
            return stock.get(item).intValue();
        return 0;
    }
}
