package JumpToJava;

public class _4_Example {
    public static void main(String[] args) {
        // 1. 조건문의 참과 거짓 판단하기
//        String a = "write once, run anywhere";
//        if (a.contains("wife")) {
//            System.out.println("wife");
//        } else if (a.contains("once") && !a.contains("run")) {
//            System.out.println("once");
//        } else if (a.contains("everywhere")) {
//            System.out.println("everywhere");
//        } else if (a.contains("anywhere")) {
//            System.out.println("anywhere");
//        } else {
//            System.out.println("none");
//        }

        //2. while 문을 사용해 1~ 1000까지의 자연수 3의 배수의 합을 구해보자
//        int result = 0;
//        int i = 1;
//        while (i <= 1000) {
//            if (i % 3 == 0) {
//                result += i;
//            }
//                i += 1;
//        }
//        System.out.println(result);

        //3.while문과 for 문을 사용하여 *을 표시하는 프로그램을 작성해보자
//        int i=0;
//        while (true){
//            i += 1;
//            if(i>5) {
//                break;
//            }
//            for(int j=0; j<i; j++){
//                System.out.print("*");
//            }
//            System.out.println("");
//        }

        //4. for문을 사용해 1~100까지 숫자를 출력해보자
//        for(int i=1; i<=100; i++) {
//            System.out.println(i);
//        }

        //5. A학급에 총 10명의 학생이 있다. for each문을 사용하여 A학급의 평균점수를 구해보자
        // 70, 60, 55, 75, 95, 90, 80, 80, 85, 100

        int marks[] = {70, 60, 55, 75, 95, 90, 80, 80, 85, 100};
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        float average = (float) total / marks.length;
        System.out.println(average);
    }
}
