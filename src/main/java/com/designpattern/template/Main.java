package com.designpattern.template;

public class Main {
    public static void main(String[] args) {
        var task = new TransferMoneyTask();
        task.execute();
        var taskGenerateReport = new GenerateReportsTask();
        taskGenerateReport.execute();
    }
}