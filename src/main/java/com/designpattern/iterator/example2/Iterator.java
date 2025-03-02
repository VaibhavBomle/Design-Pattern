package com.designpattern.iterator.example2;

public interface Iterator {

    boolean hasNext();
    String current();
    void next();
}