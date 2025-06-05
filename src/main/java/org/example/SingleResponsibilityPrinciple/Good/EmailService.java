package org.example.SingleResponsibilityPrinciple.Good;

public class EmailService {
    // Handle notifications
    public void sendConfirmation(Order order) {
        System.out.println("Sending confirmation email to " + order.getCustomerEmail());
    }
}
