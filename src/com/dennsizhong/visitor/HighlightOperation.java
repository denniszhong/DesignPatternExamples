package com.dennsizhong.visitor;

public class HighlightOperation implements Operation{
    @Override
    public void apply(AnchorNode anchorNode) {
        System.out.println("Highlight anchor");
    }

    @Override
    public void apply(HeadingNode headingNote) {
        System.out.println("Highlight heading");
    }
}
