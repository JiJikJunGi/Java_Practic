//package JumpToJava;
//
//interface Predator{
// String getFood();
////
//// default void printFood(){ //디폴트 메서드
////     System.out.println("my food is %s\n", getFood());
//// }
// int LEG_COUNT = 4; // 스태틱메서드(인터페이스 상수)
//
//    static int speed(){
//        return LEG_COUNT * 30;
//    }
//}
//class Animal {
//    String name;
//
//    void setName(String name) {
//        this.name = name;
//    }
//}
//
//class Tiger extends Animal implements Predator {
//public String getFood(){
//    return "apple";
//}
//}
//class Lion extends Animal implements Predator{
//    public String getFood() {
//        return "banana";
//    }
//}
//class Zookeeper {
//void feed(Predator predator){
//    System.out.println("feed " + predator.getFood());
//}
//}
//public class _5_7_Interface {
//    public static void main(String[] args) {
//        Zookeeper zookeeper = new Zookeeper();
//        Tiger tiger= new Tiger();
//        Lion lion = new Lion();
//        zookeeper.feed(tiger);
//        zookeeper.feed(lion);
//
//    }
//}
