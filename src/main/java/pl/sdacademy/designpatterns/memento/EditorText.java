package pl.sdacademy.designpatterns.memento;

import java.util.Deque;

public class EditorText {

    private String value = "";

    public void addText (String textToAdd){
        value +=textToAdd;
    }

    public String getValue() {
        return value;
    }

    public void restoreText (EditorTextMemento memento){

        //deep copy
        value = memento.getValue();

    }
}
