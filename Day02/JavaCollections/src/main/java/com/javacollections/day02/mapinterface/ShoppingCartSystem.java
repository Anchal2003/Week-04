package com.javacollections.day02.mapinterface;
import java.util.*;
//Create a class ShoppingCart
class ShoppingCart {
    //Create a HashMap productPrices to store the product price
    Map<String, Double> productPrices = new HashMap<>();

    //Create a LinkedHashMap
    Map<String, Integer> cart = new LinkedHashMap<>();

    //Create a TreeMap to store the sorted product
    Map<String, Double> sortedProducts = new TreeMap<>();

    //Create  a method to add item into cart
    public void addItemToCart(String product, int quantity) {
        if (productPrices.containsKey(product)) {
            cart.put(product, quantity);
        } else {
            System.out.println("Product not found: " + product);
        }
    }

    //Create a method to display cart item
    public void displayCart() {
        System.out.printf("%-10s %-10s %s\n","ItemName","Price","Quantity");
        for (Map.Entry<String, Integer> entry : cart.entrySet()) {
            //Create a variable to store product
            String product = entry.getKey();
            //Create a variable to store the quantity
            int quantity = entry.getValue();
            double price = productPrices.get(product);
            System.out.printf("%-10s %-10s %d\n",product,price,quantity);
        }
    }

    //Create a method to sort the product based on price
    public void sortProductsByPrice() {
        // Sort products based on price
        for (Map.Entry<String, Double> entry : productPrices.entrySet()) {
            sortedProducts.put(entry.getKey(), entry.getValue());
        }
    }

    //Create a method to display to sorted product
    public void displaySortedProducts() {
        System.out.printf("%-10s %s\n","ItemName","Price");
        for (Map.Entry<String, Double> entry : sortedProducts.entrySet()) {
            String product = entry.getKey();
            double price = entry.getValue();
            System.out.printf("%-10s %s\n",product,price);
        }
    }
}

//create a class ShoppingCartSystem
public class ShoppingCartSystem {
    public static void main(String[] args) {
        //Create an object of ShoppingCart
        ShoppingCart shoppingCart = new ShoppingCart();

        //call the put method to add element into productPrice
        shoppingCart.productPrices.put("Mobile", 15000.0);
        shoppingCart.productPrices.put("TV", 20000.0);
        shoppingCart.productPrices.put("Laptop", 500000.0);
        shoppingCart.productPrices.put("Iron", 3000.0);

        //Call the method to add item into cart
        shoppingCart.addItemToCart("Mobile", 2);
        shoppingCart.addItemToCart("TV", 3);
        shoppingCart.addItemToCart("Laptop", 1);

        // Call the method and print the item details
        System.out.println("Items in Cart:");
        shoppingCart.displayCart();

        //Call the method and print the result
        System.out.println("\nItems Sorted by Price:");
        shoppingCart.sortProductsByPrice();
        shoppingCart.displaySortedProducts();
    }
}