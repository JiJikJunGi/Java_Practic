//package JumpToJava;
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
//    Dog(){
//    }
//    void sleep() {
//        System.out.println(this.name + "zzz");
//    }
//}
//class HouseDog extends Dog {
//    HouseDog(String name){
//        this.setName(name);
//    }
//    HouseDog(int type){ // 생성자 오버로딩
//        if(type == 1) {
//            this.setName("yosick");
//        } else if (type == 2) {
//            this.setName("bulldog");
//        }
//    }
//    void sleep() { // 메서드 오버라이딩 : 부모클래스의 메서드를 자식클래스가 동일한 형태로 또다시 구현하는 행위
//        System.out.println(this.name + "zzz in house");
//    }
//
//    void sleep(int hour){ //메서드 오버로딩 : 입력 항목이 다른 경우 동일한 이름의 메서드를 만드는 행위
//        System.out.println(this.name + "zzz in house for " + hour + "hours");
//    }
//}
//
//public class _5_6_constructor {
//    public static void main(String[] args) {
//        HouseDog happy = new HouseDog("happy");
//        HouseDog yosick = new HouseDog(1);
//        System.out.println(happy.name);
//        System.out.println(yosick.name);
//
//    }
//}
