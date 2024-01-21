# Proxy Pattern Description

## Item.java

- **Role:** Represents a product in the store.
- **Description:** Defines the `Item` class with a `name` attribute.

## Order.java

- **Role:** Represents a customer order.
- **Description:** Defines the `Order` class, which contains a list of items (`itemList`).

## OrderInterface.java

- **Role:** Defines the common interface for order fulfillment.
- **Description:** Declares the `OrderInterface` interface with a method `fulfillOrder(Order order)`.

## Warehouse.java

- **Role:** Represents a warehouse handling inventory and order fulfillment.
- **Description:** Defines the `Warehouse` class, which implements the `OrderInterface`. It contains stock information and methods for fulfilling orders.

## OrderFulfillment.java

- **Role:** Represents the real subject in the proxy pattern, handling the order fulfillment logic.
- **Description:** Defines the `OrderFulfillment` class, which implements the `OrderInterface`. It contains the logic for fulfilling orders, checking stock in warehouses, and updating inventory.

## Client.java

- **Role:** Represents the client code that interacts with the proxy (Warehouse) to fulfill an order.
- **Description:** Serves as the client code, creating items, orders, warehouses, and demonstrating the order fulfillment process using the proxy (`Warehouse`) and the real subject (`OrderFulfillment`).
