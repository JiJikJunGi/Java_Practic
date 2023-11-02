package JumpToJava;

abstract class Predator extends Animal {
    abstract String getFood();
    //
// default void printFood(){ //디폴트 메서드
//     System.out.println("my food is %s\n", getFood());
// }
    static int LEG_COUNT = 4; // 스태틱메서드(인터페이스 상수)
    static int speed(){
        return LEG_COUNT * 30;
    }

}
interface Barkable{
    void bark();
}

//interface BarkablePredator extends Predator, Barkable{ // 인터페이스는 다중상속을 지원한다.
//}
class Animal {
    String name;

    void setName(String name) {
        this.name = name;
    }
}

class Tiger extends Predator implements Barkable {
    public String getFood(){
        return "apple";
    }
    public void bark(){
        System.out.println("어흥");
    }
}
class Lion extends Predator implements Barkable{
    public String getFood() {
        return "banana";
    }
    public void bark(){
        System.out.println("으르렁");
    }
}
class Zookeeper {
    void feed(Predator predator){
        System.out.println("feed " + predator.getFood());
    }
}
class Bouncer {
    void barkAnimal (Barkable animal){
        animal.bark();
    }
}
public class _5_9_abstractClass {
    public static void main(String[] args) {
        Tiger tiger= new Tiger();
        Lion lion = new Lion();

        Bouncer bouncer = new Bouncer();
        bouncer.barkAnimal(tiger);
        bouncer.barkAnimal(lion);


    }
}
