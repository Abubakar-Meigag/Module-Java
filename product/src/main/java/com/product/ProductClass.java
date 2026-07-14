package com.product;

// Exercise 1.1 and 1.2

public class Product {

    private String product_name;
    private int product_price;
    private int product_stock;

    public Product(String product_name, int product_price, int product_stock) {
        this.product_name = product_name;
        this.product_price = product_price;
        this.product_stock = product_stock;
    }

    public Product(String product_name, int product_price) {
        this.product_name = product_name;
        this.product_price = product_price;
        this.product_stock = 0;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public int getProduct_price() {
        return product_price;
    }

    public void setProduct_price(int product_price) {
        this.product_price = product_price;
    }

    public int getProduct_stock() {
        return product_stock;
    }

    public void setProduct_stock(int product_stock) {
        this.product_stock = product_stock;
    }

    public String toString(){
        return "Name: " + product_name + ", Price: " + product_price + ", Stock: " + product_stock;
    }
}

public class ProductClass {
    public static void main(String[] args) {

        Product p1 = new Product("BMW", 65, 8);
        Product p2 = new Product("MG", 24, 4);
        Product p3 = new Product("Bez", 78, 2);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        /*
        here i'm not copying the object — i'm just copying the reference (memory address).
        Both p1 and newP point to the same object in memory
         */

        Product newP = p1;
        newP.setProduct_price(51);

        System.out.println("here both objects share the same memory address");
        System.out.println(p1);
        System.out.println(newP);
        System.out.println(p1.getProduct_price());
        System.out.println(newP.getProduct_price());
        System.out.println(newP.equals(p1));

        /*
        Now they are two separate objects in memory,
        and changing one won't affect the other.
        */

        Product newP2 = new Product(p2.getProduct_name(), p2.getProduct_price(), p2.getProduct_stock());

        System.out.println("here each object has its own memory address");
        System.out.println(newP2);
        System.out.println(p2);
        System.out.println(newP2.equals(p2));

    }
}