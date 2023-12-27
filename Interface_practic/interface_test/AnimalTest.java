package day7.interface_test;

public class AnimalTest {
    public static void main(String[] args) {
        Dog dog = new Dog(8);
        Chiken chiken = new Chiken(3);
        Chiken cheatable = new Chiken(5);
        if(cheatable instanceof Cheatable){
            cheatable.fly();
        }
        for(int i=1; i<=3; i++){
            System.out.println(i + "시간후");
            dog.run(i);
            System.out.println("개의 이동거리 : " +dog.getDistace());
            chiken.run(i);
            System.out.println("닭의 이동거리 : " +chiken.getDistace());
            cheatable.run(i);
            System.out.println("날으는 닭의 이동거리 : " +cheatable.getDistace());
        }
    }
}
