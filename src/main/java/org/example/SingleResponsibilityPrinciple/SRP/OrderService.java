package org.example.SingleResponsibilityPrinciple.SRP;

public class OrderService {
    private OrderValidator validator = new OrderValidator();
    private OrderRepository repository = new OrderRepository();
    private EmailService emailService = new EmailService();

    public void placeOrder(Order order) {
        validator.validate(order);
        repository.save(order);
        emailService.sendConfirmation(order);
    }
}
