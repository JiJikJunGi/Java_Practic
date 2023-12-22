package day6.Abstract_practic.notebook;

public class MyNotebook {
    private Wifi wifi;
    MyNotebook(Wifi wifi){
        this.wifi = wifi;
    }

    public void accountWifi(){
        String accountID = "admin";
        String accountPW = "12345678";
        String accountNAME = "투썸플레이스";
        this.wifi.account(accountID,accountPW,accountNAME);
    }
}
