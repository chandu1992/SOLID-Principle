package org.example.DependencyInversionPrinciple.Bad;

    public class MySQLDatabase {
        public void save(String data) {
            System.out.println("Saving data to MySQL: " + data);
        }
    }

    class OrderService {
        private MySQLDatabase db = new MySQLDatabase(); // tightly coupled

        public void placeOrder(String order) {
            db.save(order); // directly depending on low-level class
        }
    }


