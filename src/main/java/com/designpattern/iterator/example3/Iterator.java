package com.designpattern.iterator.example3;

public interface Iterator<T> {

    boolean hasNext();
    T current();
    void next();
}