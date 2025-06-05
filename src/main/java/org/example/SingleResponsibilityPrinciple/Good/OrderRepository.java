package org.example.SingleResponsibilityPrinciple.Good;

public class OrderRepository {

        // Handle DB operations
        public void save(Order order) {
            System.out.println("Saving order to database");
        }
}
