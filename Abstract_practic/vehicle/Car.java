package day6.vehicle;

public class Car extends Fourwheeler{
    @Override
    public void printPrice() {
        super.printPrice();
        System.out.println(50000000);
    }
    public void printType(){
        System.out.println("이것은 자동차입니다.");
    }
    public void printBrand(){
        System.out.println("BMW");
    }
}
