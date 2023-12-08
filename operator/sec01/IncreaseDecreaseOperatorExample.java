package operator.sec01;

public class IncreaseDecreaseOperatorExample {
	public static void main(String[] args) {
		int x = 10;
		boolean result = (x == 20);
		System.out.println(result);
		result = (x != 20);
		System.out.println(result);
		result = (x > 20);
		System.out.println(result);
		result = (0 < x && x< 20);
		System.out.println(result);
		result =  (x < 0 || x > 200);
		System.out.println(result);

	}
}