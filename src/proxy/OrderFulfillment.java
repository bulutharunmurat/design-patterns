package proxy;

import java.util.List;

public class OrderFulfillment implements IOrder{
    private List<Warehouse> warehouses;
    /* Constructors and other attributes would go here */
    public void fulfillOrder(Order order) {
    /* For each item in a customer order, check each warehouse to see if it is in stock.
    If it is then create a new Order for that warehouse. Else check the next warehouse.
    Send the all the Orders to the warehouse(s) after you finish iterating over all the items in the original Order. */
        for (String item: order.getItemList()) {
            for (Warehouse warehouse: warehouses) {
                // find stock and get order from related warehouses
            }
        }
        return;
    }
}
