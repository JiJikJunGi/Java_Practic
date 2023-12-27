package day7.interface_4;

public class Bus implements Vehicle{
    @Override
    public void run() {
        System.out.println("버스 달린다!");
    }
    public void checkFare(){
        System.out.println("승차요금을 확인해 주세요");
    }
}
