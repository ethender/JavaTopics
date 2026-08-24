package com.java.collections;

import java.util.LinkedList;
import java.util.Queue;

public class ProcessIncomingIdeas {

    public static void main(String[] args) {
        Queue<String> incomingOrders = new LinkedList<>();
        String firstProcessed = "";
        String secondProcessed = "";
        String nextOrder = "";

        // TODO: add three orders, remove two, and peek at the next one.
        incomingOrders.add("Order-1001");
        incomingOrders.add("Order-1002");
        incomingOrders.add("Order-1003");

        firstProcessed = incomingOrders.remove();
        secondProcessed = incomingOrders.remove();
        nextOrder = incomingOrders.peek();
        System.out.println("Processed: " + firstProcessed);
        System.out.println("Processed: " + secondProcessed);
        System.out.println("Next order: " + nextOrder);
        System.out.println("Remaining orders: " + incomingOrders.size());
    }
}
