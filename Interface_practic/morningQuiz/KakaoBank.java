package day7.morningQuiz;

public class KakaoBank implements Bank{
    @Override
    public void withDraw(int price) {
        System.out.println("Kakao은행만의 인출로직..." + price + "을 인출한다.");

    }

    @Override
    public void deposit(int price) {
        System.out.println("Kakao은행만의 입금로직..." + price + "을 입금한다.");
    }

    @Override
    public String findDormancyAccount(String custId) {
        return Bank.super.findDormancyAccount(custId);
    }
}
