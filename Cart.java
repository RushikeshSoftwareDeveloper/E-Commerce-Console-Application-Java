package com.ECommerce;

import java.util.*;

public class Cart {

    List<Product> cart = new ArrayList<>();

    public void add(Product p){
        cart.add(p);
        System.out.println("Product Added to Cart");
    }

    public void remove(int id){

        cart.removeIf(p -> p.id == id);

        System.out.println("Product Removed");
    }

    public void viewCart(){

        double total = 0;

        for(Product p:cart){

            System.out.println(p.name+" ₹"+p.price);

            total += p.price;
        }

        System.out.println("Total: ₹"+total);
    }

    public void checkout(){

        double total=0;

        for(Product p:cart){
            total += p.price;
        }

        System.out.println("Bill Amount: ₹"+total);

        cart.clear();
    }
}