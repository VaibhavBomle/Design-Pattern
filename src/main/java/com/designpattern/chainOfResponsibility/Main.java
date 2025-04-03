package com.designpattern.chainOfResponsibility;


public class Main {
    public static void main(String[] args) {
        // authenticator -> logger -> compressor

        var compressor = new Compressor(null);
        var logger = new Logger(compressor);
        var authenticator = new Authenticator(logger);
        var server = new WebServer(authenticator);
        server.handle(new HttpRequest("admin","1234")); // If we pass incorrect details it will break in authenticator

        // authenticator  -> compressor
        // If we dont want to remove one of the steps , we dont need to change other part of the code like below
        var compressor1 = new Compressor(null);
        //var logger1 = new Logger(compressor1);
        var authenticator1 = new Authenticator(compressor1);
        var server1 = new WebServer(authenticator1);
        server1.handle(new HttpRequest("admin","1234"));


        // authenticator  -> compressor -> encryptor
        // If we dont want to remove one of the steps , we dont need to change other part of the code like below
        var encryptor2 = new Encryptor(null);
        var compressor2 = new Compressor(encryptor2);
        var authenticator2 = new Authenticator(compressor2);
        var server2 = new WebServer(authenticator2);
        server2.handle(new HttpRequest("admin","1234"));

    }
}