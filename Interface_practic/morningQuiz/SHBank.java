package day7.morningQuiz;

public class SHBank implements Bank{
    @Override
    public void withDraw(int price) {
        System.out.println("SH은행만의 인출로직..." + price + "을 인출한다.");
    }

    @Override
    public void deposit(int price) {
        System.out.println("SH은행만의 입금로직..." + price + "을 입금한다.");
        System.out.println("SH은행은 별도의 후행처리 작업을 따로한다.");
    }

    @Override
    public String findDormancyAccount(String custId) {
        return Bank.super.findDormancyAccount(custId);
    }
}
