package com.designpattern.strategy.example2;

public class ASEEncryption implements EncryptionStrategy{
    @Override
    public String encrypt(String data) {
        return "ASE encrypted: "+data;
    }
}