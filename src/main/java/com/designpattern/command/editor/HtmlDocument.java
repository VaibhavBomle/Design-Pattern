package com.designpattern.command.editor;

public class HtmlDocument {

    private String content;
    public void makeBold() {
        content = "<b>" +content + "</b>";
    }

    public String getContent(){
        return content;
    }

    public void setContent(String context){
        this.content = context;
    }
}