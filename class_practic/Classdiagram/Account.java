package day6.Abstract_practic.Classdiagram;

public class Account {
    private int balance;   // 잔액
    private String name;
    private String accountNumber;
    private  String password;
    Account(){}

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    Account(String name, String accountNumber, String password){
        this.name = name;
        this.accountNumber = accountNumber;
        this.password = password;
        if(name.equals("문상현") && accountNumber.equals("512") && password.equals("1234")){
            System.out.println("인증 완료. 계좌에 연결되었습니다.");
        }else{
            System.out.println("아이디 또는 패스워드를 다시 확인해 주십시오");
            System.exit(0);
        }
    }
    public String deposit(int money){
     this.balance += money;
        return "당신이 예금한 금액은 " + money+ "이고 잔액은 " + balance +"입니다.";
    }

}
