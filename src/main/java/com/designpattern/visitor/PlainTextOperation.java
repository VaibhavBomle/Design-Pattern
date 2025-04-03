package com.designpattern.visitor;

public class PlainTextOperation implements Operation{
    @Override
    public void apply(HeadingNode heading) {
        System.out.println("text-heading");
    }

    @Override
    public void apply(AnchorNode anchore) {
        System.out.println("text-anchor");
    }
}