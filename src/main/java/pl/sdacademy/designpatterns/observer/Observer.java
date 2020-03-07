package pl.sdacademy.designpatterns.observer;

public abstract class Observer {

    protected Subject subject;

    public Observer(Subject subject) {
        this.subject = subject;
        subject.subscribe(this);
    }

    abstract void update();
}
