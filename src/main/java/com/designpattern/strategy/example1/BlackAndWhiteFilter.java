package com.designpattern.strategy.example1;

public class BlackAndWhiteFilter implements Filter{
    @Override
    public void apply(String fileName) {
        System.out.println("Applying B&W filter");
    }
}