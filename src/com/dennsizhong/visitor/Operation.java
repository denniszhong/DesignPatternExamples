package com.dennsizhong.visitor;

public interface Operation {
    void apply(AnchorNode anchorNode);
    void apply(HeadingNode headingNote);
}
