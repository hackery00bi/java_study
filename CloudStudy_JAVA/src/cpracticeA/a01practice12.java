package cpracticeA;

public class a01practice12
{
	public static void main(String[] args)
	{
		/* 1. 변수 생성 */
		int num = 374;
		int hundredDigit = num / 100;
		int tenDigit = (num - (hundredDigit * 100)) / 10;
		int oneDigit = (num - (hundredDigit * 100) - (tenDigit * 10)) % 10;
		int sum = 0;
		/* 2. 계산 */
		sum = oneDigit + tenDigit + hundredDigit;
		/* 3. 출력 */
		System.out.println("총합: " + sum);
	}
}
