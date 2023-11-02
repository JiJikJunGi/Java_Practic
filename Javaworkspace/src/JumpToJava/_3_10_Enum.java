package JumpToJava;
public class _3_10_Enum {
    //enum 사용 시 장점 : 매직넘버를 사용할 때보다 코드가 명확하다, 잘못된 값을 사용해 생길 수 있는 오류를 막을 수 있다.
    enum CoffeeType {
        AMERICANO,
        ICE_AMERICANO,
        CAFE_LATTE};
    public static void main(String[] args) {
        System.out.println(CoffeeType.AMERICANO);
        System.out.println(CoffeeType.ICE_AMERICANO);
        System.out.println(CoffeeType.CAFE_LATTE);

        }
    }
