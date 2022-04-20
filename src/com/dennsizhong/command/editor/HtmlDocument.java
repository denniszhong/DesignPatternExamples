package com.dennsizhong.command.editor;

// Actual business logic
// The HtmlDocument class knows how to make content bold
public class HtmlDocument {
    private String content;

    public void makeBold(){
        content = "<b>" + content + "</b>";
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
