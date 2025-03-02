package com.designpattern.strategy.example1;

public class Main {
    public static void main(String[] args) {
        var imageStorage = new ImageStorage();
        imageStorage.store("a",new JpegCompressor(),new BlackAndWhiteFilter());
        imageStorage.store("a",new PngCompressor(),new BlackAndWhiteFilter());

    }
}