package cpracticeB;

public class a01
{
	public static void main(String[] args)
	{
		// 변수 생성
		int a = 10000000;
		double r = 0.03;

		// 계산
		int s = (int) ((double)a * Math.pow((1+r),5));

		// 출력
		System.out.printf("만기 금액: %d 원", s);
	}
}
