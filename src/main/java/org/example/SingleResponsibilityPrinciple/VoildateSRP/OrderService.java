package org.example.SingleResponsibilityPrinciple.VoildateSRP;

import org.example.SingleResponsibilityPrinciple.Item;

import java.util.List;

public class OrderService {
    private int orderId;
    private List<Item> items;

    public OrderService(int orderId, List<Item> items) {
        this.orderId = orderId;
        this.items = items;
    }

    /*
    1. Business logic (total calculation)
    2. Persistence (database)
    3. Notification (email)

    That's 3 responsibilities. Violates SRP.
     */
    public double calculateTotal() {
        return items.stream()
                .mapToDouble(item -> item.getPrice() * item.getQuantity())
                .sum();
    }

    public void saveToDatabase() {
        // Simulate saving to database
        System.out.println("Saving order to database...");
    }

    public void sendEmailConfirmation() {
        // Simulate sending email
        System.out.println("Sending email confirmation...");
    }
}

