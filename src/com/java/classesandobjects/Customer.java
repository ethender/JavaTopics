package com.java.classesandobjects;

public class Customer {


    public String name;
    public int loyaltyPoints;
    public boolean active;

    public static void main(String[] args) {
        Customer alice = new Customer();
        Customer ben = new Customer();

        // TODO: Set alice.name to "Alice Lee".
        alice.name = "Alice Lee";
        // TODO: Set alice.loyaltyPoints to 250.
        alice.loyaltyPoints = 250;
        // TODO: Set alice.active to true.
        alice.active = true;
        // TODO: Set ben.name to "Ben Ortiz".
        ben.name = "Ben Ortiz";
        // TODO: Set ben.loyaltyPoints to 75.
        ben.loyaltyPoints = 75;
        // TODO: Set ben.active to false.
        ben.active = false;

        printCustomer(alice);
        printCustomer(ben);
    }

    static void printCustomer(Customer customer) {
        System.out.println(customer.name + " | points: " + customer.loyaltyPoints + " | active: " + customer.active);
    }
}
