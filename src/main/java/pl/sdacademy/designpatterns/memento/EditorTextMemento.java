package pl.sdacademy.designpatterns.memento;

public class EditorTextMemento {

    private String value; //te same pola co klasa, którą reprezentujemy

    public EditorTextMemento(EditorText editorText) {

        //deep copy! nie shallow, tzn nie '=' dla Obiektów
        value = editorText.getValue();

    }

    public String getValue() {
        return value;
    }
}
