package com.designpattern.command;


import com.designpattern.command.fx.Command;

public class ResizeCommand implements Command {
    @Override
    public void execute() {
        System.out.println("ResizeCommand");
    }
}