package com.designpattern.memento.example1;

//Memento Pattern :
//Use for Undo machinism in classes
public class MainEditor {

    public static void main(String[] args){
        var editor = new Editor();
        var history = new History();

        editor.setContent("a");
        history.push(editor.createState());

        editor.setContent("b");
        history.push(editor.createState());

        editor.setContent("c");
        editor.restore(history.pop()); // Undo
        editor.restore(history.pop()); // Undo

        System.out.println(editor.getContent()); // This printed the current state : a
    }
}