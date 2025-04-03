package com.designpattern.visitor;

public class HighlightOperation implements Operation{
    @Override
    public void apply(HeadingNode heading) {
        System.out.println("Highlight-heading");
    }

    @Override
    public void apply(AnchorNode anchore) {
        System.out.println("Highlight-anchor");
    }
}