package com.javagenerics.day01;

// Create a abstract class Product 
abstract class Product<T> {
    //Create a private variable productName,productPrice, and productCategory
    private String productName;
    private double productPrice;
    private T productCategory;

    //Parameterized constructor to initialize value
    public Product(String productName, double productPrice, T productCategory) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productCategory = productCategory;
    }

    //Create a getter method to get price of the product
    public double getPriceOfProduct() {
        return productPrice;
    }

    //Create a getter method to get price of the product
    public void setPriceOfProduct(double productPrice) {
        this.productPrice = productPrice;
    }

    //Create a method displayProductDetails to display the product details
    public void displayProductDetails() {
        System.out.println("Product Name : \""+productName+"\" Price : \"₹"+productPrice+"\" Category: \""+productCategory+"\"");
    }

    //Create a static generic method to apply discounts
    public static <T extends Product<?>> void applyDiscount(T product, double percentage) {
        double discountPrice = product.getPriceOfProduct() - (product.getPriceOfProduct() * percentage / 100);
        product.setPriceOfProduct(discountPrice);
        product.displayProductDetails();
    }
}

//Create a class ClothingCategory which extends Product class
class BookCategory extends Product<String> {
    //Parameterized constructor to initialize value
    public BookCategory(String productName, double productPrice, String productCategory) {
        super(productName, productPrice, productCategory);
    }
}

//Create a class ClothingCategory which extends Product class
class ClothingCategory extends Product<String> {
    //Parameterized constructor to initialize value
    public ClothingCategory(String productName, double productPrice, String productCategory) {
        super(productName, productPrice, productCategory);
    }
}

// Create a class Gadget to extends the Product class
class Gadget extends Product<String> {
    //Create a parametrized constructor to initialize gadget details
    public Gadget(String productName, double productPrice, String productCategory) {
        super(productName, productPrice, productCategory);
    }
}

//Create a class DynamicOnlineMarketplace
public class DynamicOnlineMarketplace {
    public static void main(String[] args) {
        //Create an object of BookCategory class
        BookCategory book = new BookCategory("Let Us C", 3000, "C");
        //Create an object of ClothingCategory class
        ClothingCategory clothing = new ClothingCategory("T-Shirt", 1500, "Men");
        //Create an object of Gadget class
        Gadget gadget = new Gadget("Smartphone", 15000, "Mobile");

        //Print the result
        System.out.println("Original Price:");
        //Call the method to display details
        book.displayProductDetails();
        clothing.displayProductDetails();
        gadget.displayProductDetails();

        //print price details with discounted price
        System.out.println("\nAfter Discount: " );
        //call the method
        Product.applyDiscount(book, 10);
        Product.applyDiscount(clothing, 20);
        Product.applyDiscount(gadget, 15);
    }
}