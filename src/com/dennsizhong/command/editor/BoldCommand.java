package com.dennsizhong.command.editor;

public class BoldCommand implements UndoableCommand{
    private String prevContent;
    private HtmlDocument document;
    private History history;

    public BoldCommand(HtmlDocument htmlDocument, History history) {
        this.document = htmlDocument;
        this.history = history;
    }

    @Override
    public void execute() {
        prevContent = document.getContent();
        document.makeBold();
        history.push(this);
    }

    @Override
    public void unexecute() {
        document.setContent(prevContent);
    }
}
