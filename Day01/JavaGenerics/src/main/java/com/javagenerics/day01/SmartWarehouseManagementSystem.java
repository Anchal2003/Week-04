package com.javagenerics.day01;

import java.util.ArrayList;
import java.util.List;

//Create an abstract class WarehouseItem to indicate the item details
abstract class WarehouseItem{
    //Create a variable itemName
    private String itemName;

    //Parameterized constructor to initialize value
    public WarehouseItem(String itemName) {
        this.itemName = itemName;
    }

    //Create a getter method
    String getItemName(){
        return itemName;
    }

    //Create an abstract method
    abstract int getItemPrice();

    //Create an abstract method
    abstract void itemType();
}

//Create a class Electronics which extends WarehouseItem class
class Electronics extends WarehouseItem{
    //Create a private variable to store the itemprice
    private int itemPrice;

    //Parameterized constructor to initialize value
    public Electronics(String itemName, int itemPrice) {
        //Call the superclass constructor
        super(itemName);
        this.itemPrice = itemPrice;
    }

    //Override a method getItemPrice
    public int getItemPrice() {
        return itemPrice;
    }

    //Override a method
    void itemType(){
        System.out.println("Electronics item: ");
    }
}

//Create a class Groceries which extends WarehouseItem class
class Groceries extends WarehouseItem{
    //Create a variable to store the item price
    private int itemPrice;

    //Parameterized constructor to initialize value
    public Groceries(String itemName, int itemPrice) {
        //Call the superclass constructor
        super(itemName);
        this.itemPrice = itemPrice;
    }

    //Override a method getItemPrice
    public int getItemPrice() {
        return itemPrice;
    }

    //Override the method itemType
    void itemType(){
        System.out.println("Groceries item: ");
    }
}

//Create a class Furniture which extends WarehouseItem class
class Furniture extends WarehouseItem{
    //Create a variable to store the item price
    private int itemPrice;

    //Parameterize constructor to initialize variable
    public Furniture(String itemName, int itemPrice) {
        //Call the superclass constructor
        super(itemName);
        this.itemPrice = itemPrice;
    }

    //Override a method getItemPrice
    public int getItemPrice() {
        return itemPrice;
    }

    //Override the method
    void itemType(){
        System.out.println("Furniture item: ");
    }

}

//Create a generic class Storage to store the item details
class Storage<T extends WarehouseItem>{
    //Create an ArrayList to store the items
    ArrayList<T>items = new ArrayList<>();

    //Create a method to add element in ArrayList
    public void addItem(T item){
        items.add(item);
    }

    //Create a static method to display the item details
    public static void displayItem(List<? extends WarehouseItem> items){
        //Call the method to print the item type
        items.getFirst().itemType();

        //Print the item details
        System.out.printf("%-10s %s\n","ItemName","Price");
        for(WarehouseItem val:items){
            System.out.printf("%-10s %d\n",val.getItemName(),val.getItemPrice());
        }

        //next line
        System.out.println();
    }

}

//Create a class SmartWarehouseManagementSystem
public class SmartWarehouseManagementSystem {

    public static void main(String[] args) {

        //Create an object of generic class storage with parameter type Electronics
        Storage<Electronics> electronicsItem = new Storage<>();
        //Call addItem method to add the item in list
        electronicsItem.addItem(new Electronics("Mobile",15000));
        electronicsItem.addItem(new Electronics("Laptop",50000));
        electronicsItem.addItem(new Electronics("TV",10000));
        //Call the method to displayDetails
        Storage.displayItem(electronicsItem.items);

        //Create an object of generic class storage with parameter type Groceries
        Storage<Groceries> groceriesItem = new Storage<>();
        //Call addItem method to add the item in list
        groceriesItem.addItem(new Groceries("Rice",100));
        groceriesItem.addItem(new Groceries("Sugar",80));
        groceriesItem.addItem(new Groceries("Refined Oil",200));

        //Call the method to displayDetails
        Storage.displayItem(groceriesItem.items);


        //Create an object of generic class storage with parameter type Furniture
        Storage<Furniture> furnitureItem = new Storage<>();
        //Call addItem method to add the item in list
        furnitureItem.addItem(new Furniture("Desk",5000));
        furnitureItem.addItem(new Furniture("Sofa",30000));
        furnitureItem.addItem(new Furniture("Chair",1500));

        //Call the method to displayDetails
        Storage.displayItem(furnitureItem.items);
    }
}
