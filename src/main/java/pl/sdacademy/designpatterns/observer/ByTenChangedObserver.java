package pl.sdacademy.designpatterns.observer;

public class ByTenChangedObserver extends Observer {

    private int previousState;

    public ByTenChangedObserver(Subject subject) {
        super(subject);
        previousState = subject.getState();
    }

    @Override
    public void update() {
        if (Math.abs(subject.getState() - previousState) >= 10) {
            System.out.println("Valued changed ten and is now  " + subject.getState());
        }
        previousState = subject.getState();
    }
}
