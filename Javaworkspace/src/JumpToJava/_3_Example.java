package JumpToJava;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import static java.util.Comparator.reverseOrder;
import java.util.HashSet;

public class _3_Example {
    enum CoffeeType {
        AMERICANO,
        ICE_AMERICANO,
        CAFELATTE

    };
    static void printCoffeePrice(CoffeeType type){
        HashMap<CoffeeType,Integer> priceMap = new HashMap<>();
        priceMap.put(CoffeeType.AMERICANO,3000);
        priceMap.put(CoffeeType.ICE_AMERICANO,4000);
        priceMap.put(CoffeeType.CAFELATTE,5000);
        int price = priceMap.get(type);
        System.out.println(String.format("가격은 %d원 입니다",price));
    }
    public static void main(String[] args) {
        //홍길동 씨의 전 과목 평균 점수를 구해라
//        int a = 80;
//        int b = 75;
//        int c = 55;
//        System.out.println((float)(a+b+c)/3);

        //자연수 13이 홀수인지 짝수인지 판별할 수 있는 방법을 생각해보고 프로그램을 만들어보자
//        int a = 13;
//        boolean b = a % 2 == 1;
//        if(b){
//            System.out.println("홀수");}
//            else{
//            System.out.println("짝수");
//        }

        //주민등록번호 나누기
//        String pin ="881120-1068234";
//        String yyyymmdd = pin.substring(0,6);
//        String num = pin.substring(7);
//        System.out.println(yyyymmdd);
//        System.out.println(num);

        //원하는 숫자 추출하기(주민번호 중에 성별을 나타내는 숫자 추출)
//        String pin = " 881120-1068234";
//        System.out.println(pin.charAt(8));

        //a:b:c:d를 a#b#c#d 로 바꾸기(replaceAll)
//        String a = "a:b:c:d";
//        String b = a.replaceAll(":","#");
//        System.out.println(b);

        //다음 리스트를 내림차순으로 바꾸기
//        ArrayList<Integer>myList = new ArrayList<>(Arrays.asList(1,3,5,4,2));
//        myList.sort(Comparator.reverseOrder());
//        System.out.println(myList);

        //[Life, is, too, short]리스트를 하나의 문자열로 만들어보자
//        ArrayList<String>myList = new ArrayList<>(Arrays.asList("Life","is","too","short"));
//        String result = String.join(" ",myList);
//        System.out.println(result);

        //같은 grade 맵에서 B에 해당되는 값을 삭제해보자
//        HashMap<String, Integer> grade = new HashMap<>();
//        grade.put("A",90);
//        grade.put("B",80);
//        grade.put("C",70);
//        int result = grade.remove("B");
//        System.out.println(result);
//        System.out.println(grade);

        // numbers 리스트에서 중복된 숫자를 제거해보자.
//        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 1, 1, 2, 2, 3, 3));
//        HashSet<Integer> temp = new HashSet<>(numbers);
//        ArrayList<Integer> result = new ArrayList<>(temp);
//        System.out.println(result);

        //커피의 종류를 입력하면 가격을 알려주는 프로그램이다. 이 코드에서 1,2,3과 같은 매직넘버를 제거하여 프로그램을 개선해보자.
        printCoffeePrice(CoffeeType.AMERICANO);
    }
}
