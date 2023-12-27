package day7.interface_test;

public class Chiken extends Animal implements Cheatable{
    Chiken(int speed){
        super(speed);
    }



    @Override
    void run(int hour) {
        distace =  hour * speed;
    }

    @Override
    public void fly() {
        this.speed = speed * 2;
    }
}
