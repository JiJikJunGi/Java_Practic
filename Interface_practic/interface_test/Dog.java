package day7.interface_test;

public class Dog extends Animal{
    Dog(int speed){
        super(speed);
    }

    @Override
    void run(int hour) {
        distace = (hour * speed) * 0.5;
    }
}
