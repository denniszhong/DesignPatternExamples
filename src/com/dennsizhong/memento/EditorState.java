package com.dennsizhong.memento;

public class EditorState {
    private final String content; // Cannot change after initializing it

    public EditorState(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
