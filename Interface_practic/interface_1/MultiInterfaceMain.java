package day7.interface_1;

public class MultiInterfaceMain {
    public static void main(String[] args) {
        RemoteControl remoteControl;
        Serchable serchable;
        remoteControl = new SmartTV();
        remoteControl.turnOn();
        remoteControl.turnOff();
        remoteControl.setVolume(20);

        serchable = new SmartTV();
        serchable.search("http://naver.com");
    }
}
