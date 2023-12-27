package day7.morningQuiz2;

public class Main {
    public static void main(String[] args) {
        HappyBank happyBank = new HappyBank();
        UnhappyBank unhappyBank = new UnhappyBank();
        happyBank.doPersonalFinance();
        happyBank.doEnterpriseFinance();

        unhappyBank.doPrivateBanking();
        unhappyBank.doPersonalFinance();
        unhappyBank.doEnterpriseFinance();
    }
}
