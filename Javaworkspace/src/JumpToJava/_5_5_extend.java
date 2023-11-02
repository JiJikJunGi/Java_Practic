package JumpToJava;
//class Animal{
//    String name;
//
//
//    void setName(String name) {
//        this.name = name;
//    }
//}
//
//class Dog extends Animal{
//    void sleep() {
//        System.out.println(this.name + "zzz");
//    }
//}
//class HouseDog extends Dog {
//    void sleep() { // 메서드 오버라이딩 : 부모클래스의 메서드를 자식클래스가 동일한 형태로 또다시 구현하는 행위
//        System.out.println(this.name + "zzz in house");
//    }
//
//    void sleep(int hour){ //메서드 오버로딩 : 입력 항목이 다른 경우 동일한 이름의 메서드를 만드는 행위
//        System.out.println(this.name + "zzz in house for " + hour + "hours");
//    }
//}
//
////  class C extends Dog, HouseDog {} // 다중 상속 : 클래스가 하나 이상의 클래스를 상속받는것(자바는 다중상속을 지원하지 않는다. / 인터페이스는 예외)
//
//public class _5_5_extend {
//    public static void main(String[] args) {
////        Dog dog = new Dog();
////        dog.setName("poppy");
////        System.out.println(dog.name);
////        dog.sleep();
//        HouseDog houseDog = new HouseDog();
//        houseDog.setName("happy");
//        houseDog.sleep(); // 오버라이딩
//        houseDog.sleep(17); // 오버로딩
//    }
//}
