package com.java.collections;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    public static void main(String[] args) {
        List<String> cart = new ArrayList<>();
        String fourthItem = "";

        // TODO: add "Notebook", "Pen", "Eraser", and "Highlighter" to cart in this order.
        cart.add("Notebook");
        cart.add("Pen");
        cart.add("Eraser");
        cart.add("Highlighter");
        // TODO: assign the item at index 3 to fourthItem.
        fourthItem = cart.get(3);
        System.out.println("Cart has " + cart.size() + " items.");
        System.out.println("Fourth item: " + fourthItem);
    }
}
