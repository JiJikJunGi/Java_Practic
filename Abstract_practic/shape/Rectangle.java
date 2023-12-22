package day6.shape;

public class Rectangle extends Shape{

    private double radius1;
    private double radius2;
    public Rectangle(String color, double radius1, double radius2){
        super(color);
        System.out.println("Rectangle 클래스 생성자 호출");
        this.radius1 = radius1;
        this.radius2 = radius2;
    }


    @Override
    double area() {
        return radius1 * radius2;
    }

    @Override
    public String toString() {
        return "사각형 색상은 "+ super.getColor() + "그리고 면적은 " + this.area();
    }
}
