package JumpToJava;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
public class _3_7_List {
    public static void main(String[] args) {
        //ArrayList : 배열과 비슷하나 배열은 크기가 정해져있는것과 달리 리스트는 변한다.
        //add : 요소값을 추가
        //get : 특정 인덱스의 값을 추출
        //size : 요소의 개수를 리턴
        //contains : 리스트 안에 해당 항목이 있는지 판별에 그 결과를 boolean으로 리턴
        //remove(객체, 인덱스) : 해당하는 항목을 삭제한뒤 결과를 리턴(T/F, 해당 항목)
//        ArrayList pitches = new ArrayList();
//        pitches.add("138");
//        pitches.add("129");
//        pitches.add("142");
//        System.out.println(pitches.get(1)); // 129
//        System.out.println(pitches.size()); // 3
//        System.out.println(pitches.contains("142")); // true
//        System.out.println(pitches.remove("129")); // true
//        System.out.println(pitches.remove(0)); // 138

        //제네릭스 : 자료형을 강제로 바꿀 때 생기는 캐스팅 오류를 줄임
//        ArrayList<String> pitches = new ArrayList<>();
//        pitches.add("138");
//        pitches.add("129");
//        String one = pitches.get(0); // 형변환이 필요없다.
//        String two = pitches.get(1); // 형변환이 필요없다.
//        System.out.println(pitches); // [138,129]

//        String[] data = {"138", "129", "142"};
//        ArrayList<String> pitches = new ArrayList<>(Arrays.asList(data));
//        System.out.println(pitches); // [138,129,142]
//
//        ArrayList<String> pitches = new ArrayList<>(Arrays.asList("138", "129", "142"));
//        System.out.println(pitches); // [138,129,142]

//        ArrayList<String> pitches = new ArrayList<>(Arrays.asList("138", "129", "142"));
//        String result ="";
//        for (int i = 0; i <pitches.size(); i++){
//            result += pitches.get(i);
//            result += ",";}
//        result = result.substring(0, result.length() -1);
//        System.out.println(result); // 138, 129, 142

//        ArrayList<String> pitches = new ArrayList<>(Arrays.asList("138", "129", "142"));
//        String result = String.join(",",pitches);
//        System.out.println(result); // 138, 129, 142(join 활용)

//        ArrayList<String> pitches = new ArrayList<>(Arrays.asList("138", "129", "142"));
//        pitches.sort(Comparator.naturalOrder());
//        System.out.println(pitches); // 리스트 정렬하기(오름차순:naturalOrder, 내림차순: reverseOrder)




        }

    }
