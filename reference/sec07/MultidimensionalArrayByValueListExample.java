package reference.sec07;

public class MultidimensionalArrayByValueListExample {
	public static void main(String[] args) {
		//정수형 2차원 배열 scores 생성후 { 80, 90, 96 },{ 76, 88 } 초기화
		

		//배열의 길이
		

		//첫 번째 반의 세 번째 학생의 점수 읽기
		
			
		//두 번째 반의 두 번째 학생의 점수 읽기
		
			
		//첫 번째 반의 평균 점수 구하기
		
		//두 번째 반의 평균 점수 구하기
		
		
		//전체 학생의 평균 점수 구하기
				//반의 수만큼 반복
						//반의 학생 수 합산
				//해당 반의 학생 수만큼 반복
								//학생 점수 합산
			
		double totalAvg = (double) totalSum / totalStudent;
		System.out.println("전체 학생의 평균 점수: " + totalAvg);
	}
}