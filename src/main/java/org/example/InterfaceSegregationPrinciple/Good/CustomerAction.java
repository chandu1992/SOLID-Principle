package org.example.InterfaceSegregationPrinciple.Good;

    interface CustomerActions {
        void browseProducts();
        void purchaseProduct();
    }

    interface AdminActions {
        void addProductToCatalog();
        void removeProductFromCatalog();
    }
