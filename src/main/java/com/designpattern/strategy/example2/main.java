package com.designpattern.strategy.example2;

public class main {
    public static void main(String[] args) {
        ChatClient chatClient = new ChatClient(new ASEEncryption());
        chatClient.send("Hello");

        chatClient.setEncryptionStrategy(new DESEncryption());
        chatClient.send("Hello");
    }
}