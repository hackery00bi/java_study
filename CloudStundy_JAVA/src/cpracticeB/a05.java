package cpracticeB;

public class a05
{
	public static void main(String[] args)
	{
		double dollar = dice() + dice() + dice();
		double won = exchange(dollar);
		System.out.printf("획득 금액: $%.2f (%.0f원)", dollar, won);
	}

	public static int dice()
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

	public static double exchange(double dollar)
	{
		/* 입력받은 달러를 환전하여 반환 하시오 */
		double exchange = dollar * 1082.25108;
		return exchange;
	}
}
