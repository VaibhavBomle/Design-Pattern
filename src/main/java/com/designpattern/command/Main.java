package com.designpattern.command;


import com.designpattern.command.editor.BoldCommand;
import com.designpattern.command.editor.History;
import com.designpattern.command.editor.HtmlDocument;
import com.designpattern.command.editor.UndoCommand;

public class Main {
    public static void main(String[] args) {


        // 1st
//        var service = new CustomerService();
//        var command = new AddCustomerCommand(service);
//        var button = new Button(command);
//
//        button.click();

        // 2nd
//        var composite = new CompositeCommand();
//        composite.add(new ResizeCommand());
//        composite.add(new BlackAndWhiteCommand());
//        composite.execute();

        var history = new History();
        var document = new HtmlDocument();
        document.setContent("Hello World");

        var boldCommand = new BoldCommand(document, history);
        boldCommand.execute();
        System.out.println(document.getContent());

        var undoCommand = new UndoCommand(history);
        undoCommand.execute();
        System.out.println(document.getContent());
    }
}