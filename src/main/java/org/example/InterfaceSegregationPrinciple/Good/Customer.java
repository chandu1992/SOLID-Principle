package org.example.InterfaceSegregationPrinciple.Good;


    class Customer implements CustomerActions {
        public void browseProducts() { System.out.println("Browsing..."); }
        public void purchaseProduct() { System.out.println("Buying product..."); }
    }

    class Admin implements AdminActions {
        public void addProductToCatalog() { System.out.println("Adding..."); }
        public void removeProductFromCatalog() { System.out.println("Removing..."); }
    }
