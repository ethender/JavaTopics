package com.java.collections;

import java.util.HashSet;
import java.util.Set;

public class CouponCodes {

    public static void main(String[] args) {
        Set<String> appliedCoupons = new HashSet<>();
        boolean firstWelcome = false;
        boolean secondWelcome = false;
        boolean freeShipAdded = false;
        boolean hasFreeShip = false;

        // TODO: add "WELCOME10", add "WELCOME10" again, add "FREESHIP", and check for "FREESHIP".
        firstWelcome = appliedCoupons.add("WELCOME10");
        secondWelcome = appliedCoupons.add("WELCOME10");
        freeShipAdded = appliedCoupons.add("FREESHIP");
        hasFreeShip = appliedCoupons.contains("FREESHIP");

        System.out.println("First WELCOME10 added: " + firstWelcome);
        System.out.println("Second WELCOME10 added: " + secondWelcome);
        System.out.println("FREESHIP added: " + freeShipAdded);
        System.out.println("Unique coupons: " + appliedCoupons.size());
        System.out.println("Has FREESHIP: " + hasFreeShip);
    }
}
