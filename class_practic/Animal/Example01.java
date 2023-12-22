package day6;

public class Example01 {
    public static void main(String[] args) {
        Animal myObj = new Animal() {
            @Override
            public void printSound() {
                System.out.println("야옹야옹~~");
            }
        };
        myObj.printSound();
    }
}
