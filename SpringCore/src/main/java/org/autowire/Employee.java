package org.autowire;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee
{
    @Autowired
    private Address address;

    public Employee() {
    }

    // Constructor
    public Employee(Address address) { // Address object automatically comes here
        this.address = address;
    }

//    //We can either use setter as well as constructor
//    //Setter
//    public void setAddress(Address address) {
//        this.address = address;
//    }

    @Override
    public String toString() {
        return "Employee{" +
                "address=" + address +
                '}';
    }
}
