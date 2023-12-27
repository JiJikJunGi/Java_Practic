package day7.interface_1;

public interface RemoteControl {
    //1 .상수필드
    public static final int MAX_VOLUME = 30;    //상수 : public static final 컴파일과정에서 붙게된다.
    public static  final int MIN_VOLUME = 0;
    //2. 추상메소드 abstract , {}바디가 없는 메소드(메소드 선언부만 작성)
    void turnOn();  //전원 켬
    void turnOff(); //전원 끔
    void setVolume(int volume); //볼륨 셋팅


}

