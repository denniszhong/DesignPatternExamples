package com.dennsizhong.mediator.event;

public class ArticleEditorDialogBox {
    private ListBox articlesListBox = new ListBox();
    private Button saveButton = new Button();
    private TextBox titleTextBox = new TextBox();

    public ArticleEditorDialogBox() {
        articlesListBox.addEventHandler(this::articleSelected);
        titleTextBox.addEventHandler(this::titleUpdated);
        saveButton.addEventHandler(this::contentSaved);
    }

    public void simulateUserInteraction() {
        articlesListBox.setSelection("Article 1");
        titleTextBox.setContent("new title: learning design pattern");
        System.out.println("TextBox: " + titleTextBox.getContent());
        System.out.println("Button: " + saveButton.isEnabled());
    }

    private void articleSelected() {
        titleTextBox.setContent(articlesListBox.getSelection());
        saveButton.setEnabled(true);
    }

    private void titleUpdated() {
        var content = titleTextBox.getContent();
        var isEmpty = content == null || content.isEmpty();
        saveButton.setEnabled(!isEmpty);
    }
    private void contentSaved() {

    }
}
