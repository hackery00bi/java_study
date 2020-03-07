package cpracticeB;

public class a03
{
	public static void main(String[] args)
	{
		/* 1. 칼로리 계산을 위해 메소드를 호출하시오. */
		int walks = 5000;
		double howkcal = 0.02;
		/* 3. 결과를 출력하시오. */
		System.out.printf("소모 칼로리: %.1f kcal", cal_kcal(5000, 0.02));
	}

	/* 2. 칼로리 계산 메소드를 정의하시오. */
	public static double cal_kcal(int walks, double howkcal)
	{
		double total_kcal = (double) walks * howkcal;
		return total_kcal;
	}
}
