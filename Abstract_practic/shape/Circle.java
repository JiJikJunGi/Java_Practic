package day6.shape;

public class Circle extends Shape{
    public Circle(String color, double radius){
        super(color);
        System.out.println("Circle 클래스 생성자 호출");
        this.radius = radius;
    }
    private double radius;


    @Override
    double area() {                          // 원 넓이 구하기
        return radius * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "원 색상은 " + super.getColor() + "그리고 면적은 : " + this.area();
    }
}
