package JumpToJava;
import java.util.Arrays;
import java.util.HashSet;

public class _3_9_set {
    public static void main(String[] args) {
//        HashSet<String> set = new HashSet<>(Arrays.asList("H","e","l","l","o"));
//        System.out.println(set); // [e, H, l, o] 순서가 없고 중복을 허용하지 않음

        //교집합, 차집합, 합집합 구하기
        HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1,2,3,4,5,6));
        HashSet<Integer> s2 = new HashSet<>(Arrays.asList(4,5,6,7,8,9));

//        HashSet<Integer> intersection = new HashSet<>(s1); // s1으로 intersection 생성(s1에 합쳐지지 않기 위함
//        intersection.retainAll(s2); // 교집합 수행
//        System.out.println(intersection); // [4,5,6]

//        HashSet<Integer> union = new HashSet<>(s1);
//        union.addAll(s2); // 합집합 수행
//        System.out.println(union); // [1,2,3,4,5,6,7,8,9]

//        HashSet<Integer> substract = new HashSet<>(s1);
//        substract.removeAll(s2); // 차집합 수행
//        System.out.println(substract); / [1,2,3]

        //add : 자료형에 값을 추가
//        HashSet<String> set = new HashSet<>();
//        set.add("Jump");
//        set.add("To");
//        set.add("Java");
//        System.out.println(set); //[Java, To, Jump]

//        HashSet<String> set = new HashSet<>();
//        set.add("Jump");
//        set.addAll(Arrays.asList("To","Java"));
//        System.out.println(set); //[Java, To, Jump]

        HashSet<String> set = new HashSet<>(Arrays.asList("Jump", "To", "Java"));
        set.remove("To");
        System.out.println(set); // [Java, Jump]

    }
}
