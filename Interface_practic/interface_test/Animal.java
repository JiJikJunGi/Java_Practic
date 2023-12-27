package day7.interface_test;

public abstract class Animal {
    protected int speed;
    protected double distace;
    public Animal(int speed){
        this.speed = speed;
    }


    abstract void run(int hour);

    public double getDistace() {
        return distace;
    }
}
