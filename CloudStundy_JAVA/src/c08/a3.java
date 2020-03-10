package c08;

public class a3
{
	public static void main(String[] args)
	{
		// 변수 생성
		int[] runningMinutes = { 42, 66, 57, 54, 88 };
		int sum = 0;
		int i =0;
		
		/* 1. for 문을 사용하여 총합을 계산하시오. */
		for (i = 0; i < 5; i++)
			sum += runningMinutes[i];

		/* 2. 평균을 계산하시오. */
		double average = sum / runningMinutes.length;

		// 결과 출력
		System.out.printf("달리기 시간 총합: %d분\n", sum);
		System.out.printf("달리기 시간 평균: %.0f분\n", average);
	}
}
