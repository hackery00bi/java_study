package c05;

public class a7
{
	public static void main(String[] args)
	{
		/* 1. 변수를 생성하시오. */
		int sam = 180;
		int num = 3;
		double sum = 0;
		/* 2. 메소드를 통한 칼로리를 계산하시오. */
		sum = cal_kcal(180, 3);
		/* 3. 결과를 출력하시오 */
		System.out.printf("삼겹살 %d인분: %.2f kcal", num, sum);
	}

	/* 4. 칼로리 계산을 위한 메소드를 작성하시오. */
	public static double cal_kcal(int sam, int num)
	{
		// TODO Auto-generated method stub
		double sam_kcal = 5.179;
		double sum = 0;
		
		sum = sam_kcal * (double)sam * (double)num;
		return sum;
	}
}
