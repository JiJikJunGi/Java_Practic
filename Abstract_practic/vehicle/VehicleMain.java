package day6.vehicle;

public class VehicleMain {
    public static void main(String[] args) {
        Car myCar = new Car();
        Bike myBike = new Bike();

        myCar.printBrand();
        myCar.printPrice();
        myCar.printType();
        myBike.printBrand();
        myBike.printPrice();
        myBike.printType();
    }
}
