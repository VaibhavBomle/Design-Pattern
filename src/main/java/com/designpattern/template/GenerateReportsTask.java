package com.designpattern.template;

public class GenerateReportsTask extends Task {
    @Override
    protected void doExecute() {
         System.out.println("Generate Reports");
    }
}