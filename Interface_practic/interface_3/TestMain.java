package day7.interface_3;

public class TestMain {
    public static void main(String[] args) {
        TestB b = new TestB();      // 클래스 bcde를 객체로 생성
        TestC c = new TestC();
        TestD d = new TestD();
        TestE e = new TestE();

        TestA a;                     // 인터페이스 변수 선언
        a = b;                       // 부모클래스인 bc는 물론 자식클래스인 de도 a인터페이스를 구현(자동타입변환==promotion)
        a = c;
        a = d;
        a = e;

        // a는 bcde 메소드 전부 사용가능
    }
}
