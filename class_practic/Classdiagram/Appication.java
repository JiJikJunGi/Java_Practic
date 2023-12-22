package day6.Abstract_practic.Classdiagram;

public class Appication {
    public static void main(String[] args) {

        Account account1 = new Account("문상현","512","12345");
        System.out.println(account1.deposit(1000000000));
        System.out.println(account1.deposit(1000000));
        System.out.println(account1.deposit(1000));

    }
}
