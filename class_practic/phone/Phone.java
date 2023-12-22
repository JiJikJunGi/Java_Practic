package day6.Abstract_practic.phone;

public class Phone {

    private String mms;

    public void sendMessage(String to, String message){
        this.mms = message;
        System.out.println(message);
    }
}
