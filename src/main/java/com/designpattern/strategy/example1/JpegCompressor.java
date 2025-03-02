package com.designpattern.strategy.example1;

public class JpegCompressor implements Compressor{
    @Override
    public void compress(String fileName) {
        System.out.println("Compress JpegCompressor");
    }
}