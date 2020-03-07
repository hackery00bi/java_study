package c4;

public class a7
{
	public static void main(String[] args)
	{
		/* 1. 입력값 받기 */
		int r = Integer.parseInt(args[0]);
		double pi = Math.PI;
		double s = 0;
		/* 2. 원의 넓이 계산 */
		s = pi * (double) r * (double) r;
		/* 3. 결과 출력 */
		System.out.printf("반지름이 %d인 원의 넓이 => %.3f", r, s);
	}
}
