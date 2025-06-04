package org.example.SingleResponsibilityPrinciple.SRP;

public class OrderValidator {
    // handle Validation
    public void validate(Order order) {
        if (order.getItems().isEmpty()) {
            throw new RuntimeException("Order has no items");
        }
    }
}
