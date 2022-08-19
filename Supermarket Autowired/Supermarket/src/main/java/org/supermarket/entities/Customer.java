package org.supermarket.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Customer {

    private int customerId;
    private String customerName;
    @Autowired
    @Qualifier("Items3")
    private Items items;

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Items getItems() {
        return items;
    }

    public void setItems(Items items) {
        this.items = items;
    }

    public Customer() {
    }

    public Customer(int customerId, String customerName, Items items) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.items = items;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", customerName='" + customerName + '\'' +
                ", items=" + items +
                '}';
    }
}
