package com.designpattern.memento.example2;

public class MainDocument {

    public static void main(String[] args){

        var document = new Document();
        var history = new DocumentHistory();

        document.setContent("Hello");
        history.push(document.createState());

        document.setFontName("Arial");
        history.push(document.createState());

        document.setFontSize(12);
        history.push(document.createState());

        // Undo Changes
        document.restore(history.pop()); // Undo
        document.restore(history.pop()); // Undo
        document.restore(history.pop());

        System.out.println(document.getContent());  // Hello
        System.out.println(document.getFontName()); // Arial
        System.out.println(document.getFontSize()); // 0

    }
}