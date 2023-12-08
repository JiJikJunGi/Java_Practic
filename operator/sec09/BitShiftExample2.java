package operator.sec09;

public class BitShiftExample2 {
	public static void main(String[] args) {
		int value = 772; //[00000000] [00000000] [00000011] [00000100]

		//우측으로 3byte(24bit) 이동하고 끝 1바이트만 읽음: [00000000]
		
		System.out.println("첫 번째 바이트 부호 없는 값: " + int1);

		//우측으로 2byte(16bit) 이동하고 끝 1바이트만 읽음: [00000000]
		
		System.out.println("두 번째 바이트 부호 없는 값: " + int2);

		//우측으로 1byte(8bit) 이동하고 끝 1바이트만 읽음: [00000011]
		
		System.out.println("세 번째 바이트 부호 없는 값: " + int3);

		//끝 1바이트만 읽음: [00000100]
		
		System.out.println("네 번째 바이트 부호 없는 값: " + int4);
	}
}