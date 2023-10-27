package chap_01;

public class _05_VariableNaming {
    public static void main(String[] args) {
        // 변수 이름 짓는 법
        // 1. 저장한 값에 어울리는 이름
        // 2. 밑줄(_), 문자(abc), 숫자(123) 사용가능(공백 사용 불가)
        // 3. 밑줄 또는 문자로 시작 가능
        // 4. 한 단어 또는 2개 이상 단어의 연속
        // 5. 변수는 소문자로 시작, 각 단어의 시작 글자는 대문자로(첫 단어는 제외)
        // 6. 예약어는 사용 불가(public, static, void, int, double, float, ...)

        // 다른 나라 입국을 위한 입국신고서
        String nationality = "대한민국"; // 국적
        String firstName = "길동"; // 이름
        String lastName = "홍"; // 성
        String dateOfBirth = "2001-12-31"; // 생년월일
        String residentialAddress = "파라다이스 호텔"; // 체류지
        String purposeOfVisit = "관광"; // 목적
        String flightNumber = "KE801"; // 항공편
        String _flightNumber = "KE801";
        String flight_Number_02 = "KE801";

        int accompany = 2; // 동반 가족 수
        int lengthOfStay = 5; // 체류 기간

        String item1 ="시계";
        String item2 ="가방";
//        String 3item ="전자제품"; // 이건 안됨

         // 절대 변하지 않는 상수는 대문자로
        final String CODE = "KR";
    }
}
