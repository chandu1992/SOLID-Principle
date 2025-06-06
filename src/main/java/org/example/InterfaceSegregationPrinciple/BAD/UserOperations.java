package org.example.InterfaceSegregationPrinciple.BAD;

interface UserOperations {
    void browseProducts();
    void purchaseProduct();
    void addProductToCatalog();  // Only admin uses this
    void removeProductFromCatalog();
}
