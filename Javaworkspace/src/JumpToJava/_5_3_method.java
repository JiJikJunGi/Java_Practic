package JumpToJava;

import jdk.nashorn.internal.ir.CallNode;

public class _5_3_method {
    //    int sum(int a, int b) { // a,b 는 매개 변수
//        return a+b;
//    }
//    public static void main(String[] args) {
//        int a = 3;
//        int b = 4;
//
//        _5_3_method sample = new _5_3_method();
//        int c = sample.sum(3, 4); // 3,4는 인수
//
//        System.out.println(c);
//     }
    String say() {
        return "Hi";
    }

    void sayNick(String nick) {
        if ("바보".equals(nick)) {
            return;
        }
        System.out.println("나의 별명은 " + nick + "입니다.");
    }

    void sum(int a, int b) {
        System.out.println(a + "과 " + b + "의 합은 " + (a + b) + "입니다.");
    }

    void varTest(int b) {
        b++;
        System.out.println(b);
    }

    public static void main(String[] args) {
         _5_3_method sample = new _5_3_method();
         String a = sample.say();
        System.out.println(a);
        sample.sum(3,4);
        sample.sayNick("바보"); // 리턴되어 출력되지 않는다.
        sample.sayNick("야호");
        int b = 3;
        sample.varTest(b);
    }
}
