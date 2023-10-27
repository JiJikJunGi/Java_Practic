package chap_01;

public class _03_Variables {
    public static void main(String[] args) {
        String name;
        name = "지직전기";
        int hour = 15;

        System.out.println(name + "님, 배송이 시작됩니다. " + hour + "시에 방문 예정입니다.");
        System.out.println(name + "님, 배송이 완료되었습니다.");

        double score = 90.5;
        char grade = 'A';
        name = "강백호";
        System.out.println(name + "님의 평균 점수는 " + score + "점 입니다. 그리고 학점 등급은 " + grade + "입니다.");

        boolean pass = true;
        System.out.println("이번 시험에 합격했을까요? " + pass);

        double d = 3.14159268245;
        float f = 3.1415682145F;
        System.out.println(d);
        System.out.println(f);

        long l = 100000000000000l;
        l = 100_000_000_000_000l;
        System.out.println(l);
        }
    }
