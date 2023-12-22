package day6;

public class Dog extends AbstractDog{
    @Override
    public void printSound() {
        System.out.println("멍멍");
    }

    @Override
    public void tailing() {
        super.tailing();
        System.out.println("살랑살랑");
    }
}
