package org.example.DependencyInversionPrinciple.Good;

public class Main {
    public static void main(String[] args) {
        Database db = new MySQLDatabase(); // or use new MongoDatabase();
        OrderService service = new OrderService(db);
        service.placeOrder("iPhone");
    }
}

