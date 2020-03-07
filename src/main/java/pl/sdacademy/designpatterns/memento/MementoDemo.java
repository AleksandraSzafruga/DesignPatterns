package pl.sdacademy.designpatterns.memento;

public class MementoDemo {

    public static void main(String[] args) {
        EditorText editorText = new EditorText();
        EditorTextMementoManager mementoManager = new EditorTextMementoManager();
        mementoManager.save(new EditorTextMemento(editorText));

        editorText.addText("This is first line");
        mementoManager.save(new EditorTextMemento(editorText));

        editorText.addText("\nThis is second line");
        mementoManager.save(new EditorTextMemento(editorText));

        editorText.addText("\nThis is third line");
        mementoManager.save(new EditorTextMemento(editorText));

        editorText.addText("\nThis is second part of third line");
        mementoManager.save(new EditorTextMemento(editorText));

        System.out.println(editorText.getValue());
        System.out.println();

        mementoManager.restore();
        mementoManager.restore();
        editorText.restoreText(mementoManager.restore());
        System.out.println(editorText.getValue());


    }
}
