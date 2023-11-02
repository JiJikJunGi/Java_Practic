package JumpToJava;
import java.util.Arrays;
import java.util.ArrayList;

class Calculator {
    int value;

    Calculator() {
        this.value = 0;
    }

    void add(int val) {
        this.value += val;
    }

    boolean isOdd(int val) {
        if (val % 2 == 1) {
            return true;
        } else {
            return false;
        }
    }

    int avg(int[] data) {
        int total = 0;
        for (int num : data) {
            total += num;
        }
        return total / data.length;
    }

    int avg(ArrayList<Integer> data) {
        int total = 0;
        for (int num : data) {
            total += num;
        }
        return total / data.size();
    }

    int getValue(){
        return this.value;
    }

}
class UpgradeCalculator extends Calculator {
    void minus(int val) {
        this.value -= val;
    }
        }
    class MaxLimitCalculator extends Calculator {
        @Override
        int getValue() {
            if(this.value>=100){
                this.value = 100;
                return this.value;
            }else return this.value;
        }
    }
public class _5_Example {
    public static void main(String[] args) {
//        MaxLimitCalculator cal = new MaxLimitCalculator(); // 2. 100보다 큰값이 들어오면 100값을 출력
//        cal.add(50);
//        cal.add(30);
//        System.out.println(cal.getValue());

//        Calculator cal = new Calculator();  // 3. 홀수/짝수 판별하기
//        System.out.println(cal.isOdd(3));
//        System.out.println(cal.isOdd(4));

//        int[] data1 = {1, 3, 5, 7, 9}; //4. 메서드 오버로딩 하기
//        Calculator cal = new Calculator();
//        int result1 = cal.avg(data1);
//        System.out.println(result1);
//        ArrayList<Integer> data2 = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9));
//        int result2 = cal.avg(data2);
//        System.out.println(result2);

//        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 2, 3)); // 5.리스트와 객체 확인하기
//        ArrayList<Integer> b = a;
//        a.add(4);
//        System.out.println(b.size());

    }
}
