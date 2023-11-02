package chap_02;

public class _01_Operator1 {
    public static void main(String[] args) {
        // 산술 연산자

        // 일반 연산
        System.out.println(4 + 2); // 6
        System.out.println(4 - 2); // 2
        System.out.println(4 * 2); // 8
        System.out.println(4 / 2); // 2
        System.out.println(5 % 2); // 1(나머지)

        //우선 순위에 따른 연산
        System.out.println(2 + 2 * 2 ); // 6

        // 변수를 이용한 연산
        int a = 20;
        int b = 10;
        int c = a + b;
        System.out.println(c); // 30
        c = a - b;
        System.out.println(c);

        c = a * b;
        System.out.println(c);

        c = a / b;
        System.out.println(c);

        c= a % b;
        System.out.println(c);

        // 증감 연산 ++, --
        int val;
        val = 10;
        System.out.println(val);

        val += 1; //val + 1
        System.out.println(val);
        System.out.println(val++); // 연산 후 1 증가
        System.out.println(++val); // 1 증가 후 연산

        // 응용(은행 대기번호 표)
        int waiting = 0;
        System.out.println("대기인원 : " + waiting++);
        System.out.println("대기인원 : " + waiting++);
        System.out.println("대기인원 : " + waiting++);

    }
}
