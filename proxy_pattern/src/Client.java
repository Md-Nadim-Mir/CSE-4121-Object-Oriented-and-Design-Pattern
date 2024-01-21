import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {

        Item laptop = new Item();
        laptop.name = "Laptop";

        Item smartphone = new Item();
        smartphone.name = "Smartphone";

        Order order = new Order();
        order.itemList.add(laptop);
        order.itemList.add(smartphone);

        Warehouse warehouse1 = new Warehouse("Warehouse 1");
        warehouse1.stock.put("Laptop", 5);
        warehouse1.stock.put("Smartphone", 3);

        Warehouse warehouse2 = new Warehouse("Warehouse 2");
        warehouse2.stock.put("Laptop", 2);
        warehouse2.stock.put("Smartphone", 0);

        List<Warehouse> warehouses = new ArrayList<>();
        warehouses.add(warehouse1);
        warehouses.add(warehouse2);

        OrderFulfillment orderFulfillment = new OrderFulfillment(warehouses);

        orderFulfillment.fulfillOrder(order);
    }
}
