package chap_02;

public class _04_Operator4 {
    public static void main(String[] args) {
        // 논리 연산자(&&, ||, ^,
        boolean 김치찌개 = true;
        boolean 계란말이 = false;
        boolean 제육볶음 = true;

        System.out.println(김치찌개 || 계란말이 || 제육볶음); // or
        System.out.println(김치찌개 && 계란말이 && 제육볶음); // and

        // 논리 부정 연산자
        System.out.println(!true);
        System.out.println(!false);
        System.out.println(!(5 == 5));
        System.out.println(!(5==3));
    }
}
