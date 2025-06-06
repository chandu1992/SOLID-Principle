package org.example.DependencyInversionPrinciple.Good;

    interface Database {
        void save(String data);
    }

    class MySQLDatabase implements Database {
        public void save(String data) {
            System.out.println("Saving to MySQL: " + data);
        }
    }

    class MongoDatabase implements Database {
        public void save(String data) {
            System.out.println("Saving to MongoDB: " + data);
        }
    }

    class OrderService {
        private Database db;

        public OrderService(Database db) { // inject abstraction
            this.db = db;
        }

        public void placeOrder(String order) {
            db.save(order); // depends only on the interface
        }
    }

