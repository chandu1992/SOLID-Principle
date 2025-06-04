package org.example.SingleResponsibilityPrinciple.SRP;

import java.util.HashMap;
import java.util.Map;

public class Order {

    private String customerEmail;
    public String getCustomerEmail() {
        return "chpande@gmail.com";
    }

    public Map<Object, Object> getItems() {
        return new HashMap<Object,Object>();
    }
}
