package com.designpattern.mediator;

public class ArticlesDialogBox extends DialogBox{

    private ListBox  articlesListBox = new ListBox(this);
    private TextBox  titleTextBox = new TextBox(this);
    private Button  saveButton = new Button(this);

    public void simulateUserInteraction(){
        articlesListBox.setSelection("Article 1");
        titleTextBox.setContent("");
        articlesListBox.setSelection("Article 2");
        System.out.println("TextBox : "+titleTextBox.getContent());
        System.out.println("Button : "+saveButton.isEnabled());
    }


    @Override
    public void changed(UIControl uiControl) {
        if(uiControl == articlesListBox){
            articleSelected();
        }else if(uiControl == titleTextBox){
            titleChanged();
        }
    }

    private void titleChanged(){
      var content = titleTextBox.getContent();
      var isEmpy = (content == null || content.isEmpty());
      saveButton.setEnabled(!isEmpy);
    }

    private void articleSelected(){
        titleTextBox.setContent(articlesListBox.getSelection());
        saveButton.setEnabled(true);
    }
}
