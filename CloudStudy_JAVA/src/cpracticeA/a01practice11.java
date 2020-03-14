package cpracticeA;

public class a01practice11
{
	public static void main(String[] args)
	{
		/* 1. 변수 생성 */
		double jan = 81.36;
		double feb = jan + 0.71;
		double mar = feb - 0.43;
		double avg = 0;
		/* 2. 계산 */
		avg = (jan + feb + mar) / 3;
		/* 3. 출력 */
		System.out.println(avg + "kg");
	}
}
