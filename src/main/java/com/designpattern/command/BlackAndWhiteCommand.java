package com.designpattern.command;


import com.designpattern.command.fx.Command;

public class BlackAndWhiteCommand implements Command {
    @Override
    public void execute() {
        System.out.println("BlackAndWhiteCommand");
    }
}