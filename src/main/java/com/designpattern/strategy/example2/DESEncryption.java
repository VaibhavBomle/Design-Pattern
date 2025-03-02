package com.designpattern.strategy.example2;

public class DESEncryption implements EncryptionStrategy{
    @Override
    public String encrypt(String data) {
        return "DSEEncrypted "+data;
    }
}