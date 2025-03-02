package com.designpattern.strategy.example1;

public class PngCompressor implements Compressor{
    @Override
    public void compress(String fileName) {
        System.out.println("PngCompressor");
    }
}