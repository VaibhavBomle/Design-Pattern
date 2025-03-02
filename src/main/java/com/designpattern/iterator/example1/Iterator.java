package com.designpattern.iterator.example1;

public interface Iterator {

    boolean hasNext();
    String current();
    void next();
}