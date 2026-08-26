package com.java.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductPrices {
    public static void main(String[] args) {
        Map<String, Integer> pricesCents = new HashMap<>();
        List<String> cart = new ArrayList<>(List.of("NOTEBOOK", "PEN", "PEN", "ERASER"));
        int subtotalCents = 0;

        // TODO: put prices for "PEN", "NOTEBOOK", and "ERASER" into pricesCents.
        pricesCents.put("NOTEBOOK", 499);
        pricesCents.put("PEN", 129);
        pricesCents.put("ERASER", 99);

        // TODO: loop over cart and add each looked-up price to subtotalCents.
        for(String item: cart){
            subtotalCents += pricesCents.get(item);
        }

        System.out.println("Items: " + cart.size());
        System.out.println("PEN price cents: " + pricesCents.get("PEN"));
        System.out.println("Subtotal cents: " + subtotalCents);
    }
}
