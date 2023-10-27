package chap_01;

public class _Quiz_01 {
    public static void main(String[] args) {

        String busNo = "상암08"; // 버스번호 : 1234, 상암08
        int minute = 3; // 남은 시간 : 3,5
        double distance = 1.2; // 남은 거리 : 1.2, 0.8

        //결과 출력
        System.out.println( busNo + "번 버스");
        System.out.println("약 " + minute + "분 후 도착");
        System.out.println("남은 거리 " + distance + "km");
    }
}
