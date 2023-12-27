package day7.interface_programmus;

public class Taxi implements Meter{
    public void start(){
        System.out.println("택시가 출발합니다.");
    }

    @Override
    public void afterMidnight() {
        Meter.super.afterMidnight();
    }

    public int stop(int distance){
        int fare = distance * 2;
        System.out.println("택시가 도착했습니다. 요금은 "+fare+"입니다.");
        return fare;
    }
}