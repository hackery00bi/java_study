package c01practice;

public class a01practice08
{
	public static void main(String[] args)
	{
		/* 1. 변수 생성 */
		int totalSec = 7582;
		/* 2. 변환 */
		int min = 7582 / 60;
		int r_min = min % 60;
		int sec = 7582 % 60;
		int hour = min / 60;
		/* 3. 출력 */
		System.out.printf("%d시간 %d분 %d초", hour, r_min, sec);
	}
}
