package com.dennsizhong.mediator;

public class ArticlesDialogBox extends DialogBox {
    private ListBox articlesListBox = new ListBox(this);
    private TextBox titleTextBox = new TextBox(this);
    private Button saveButton = new Button(this);

    public void simulateUserInteraction() {
        articlesListBox.setSelection("Article 1");
        System.out.println("TextBox: " + titleTextBox.getContent());
        System.out.println("Button: " + saveButton.isEnabled());
    }

    @Override
    public void changed(UIControl control) {
        // Implement all the interaction among UI controls within this dialog
        if (control == articlesListBox) {
            articleSelected();
        } else if (control == titleTextBox) {
            titleUpdated();
        } else if (control == saveButton) {
            // save to db
        }
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
}
