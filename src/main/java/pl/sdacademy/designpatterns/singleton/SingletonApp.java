package pl.sdacademy.designpatterns.singleton;

public class SingletonApp {

    public static void main(String[] args) {
        Counter counter1 = Counter.getInstance();
        Counter counter2 = Counter.getInstance();

        counter1.addThree();
        counter2.addTwo();
        counter1.increment();
        counter2.addThree();
    }
}
