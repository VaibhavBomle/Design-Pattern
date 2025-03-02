package com.designpattern.iterator.example3;

public class Main {

    public static void main(String[] args) {
        ProductCollection collection = new ProductCollection();

        // Add some Product
        collection.add(new Product("Prodcut 1"));
        collection.add(new Product("Prodcut 2"));

        // Get the iterator
        Iterator<Product> iterator = collection.createIterator();

        while (iterator.hasNext()){
            Product product = iterator.current();
            System.out.println(product.getName());
            iterator.next();
        }
    }


}