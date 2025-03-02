package com.designpattern.strategy.example2;

public class ChatClient {
    private EncryptionStrategy encryptionStrategy;

    public ChatClient(EncryptionStrategy encryptionStrategy){
        this.encryptionStrategy = encryptionStrategy;
    }

    public void send(String message){
        String encryptedMessage = encryptionStrategy.encrypt(message);
        System.out.println("Sending encrypted message: " + encryptedMessage);
    }

    public void setEncryptionStrategy(EncryptionStrategy encryptionStrategy){
        this.encryptionStrategy = encryptionStrategy;
    }
}