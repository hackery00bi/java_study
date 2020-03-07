package c5;

public class a4
{
	public static void main(String[] args)
	{
		// 메소드로부터 값을 반환
		int x = rollDie();

		// 결과 출력
		System.out.printf("주사위의 눈: %d", x);
	}

	// 1~6 사이의 임의의 정수를 반환
	public static int rollDie()
	{
		double num = 0;
		int tmp = 0;
		/* 해당 메소드를 완성하시오. */
		while (true)
		{
			num = 10 * Math.random();
			tmp = (int) num;
			if (tmp <= 6)
			{
				break;
			}
		}
		return tmp;
	}
}
