package c08;

public class a2
{
	public static void main(String[] args)
	{
		// 배열 생성
		int[] sales = new int[5];

		// 배열 값 초기화
		sales[0] = 52; // 월
		sales[1] = 50; // 화
		sales[2] = 55; // 수
		sales[3] = 42; // 목
		sales[4] = 38; // 금

		// 배열 합 계산
		int sum = sales[0] + sales[1] + sales[2] + sales[3] + sales[4];

		// 출력
		System.out.printf("총 판매량: %d잔\n", sum);
	}
}
