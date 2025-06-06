package org.example.InterfaceSegregationPrinciple.Bad;

interface UserOperations {
    void browseProducts();
    void purchaseProduct();
    void addProductToCatalog();  // Only admin uses this
    void removeProductFromCatalog();
}
