package c07;

public class a3
{
	public static void main(String[] args)
	{
		// 입력값 받기
		int n = Integer.parseInt(args[0]); // "5" => 5

		// 총합 계산
		int result = sum(n);

		// 결과 출력
		System.out.printf("정수의 총합(1~%d) => %d", n, result);
	}

	public static int sum(int max)
	{
		// 변수 생성
		int sum = 0;

		// 반복 계산: 1 + 2 + ... + max
		for (int i = 1; i <= max; i++)
		{
			sum += i;
		}
		// 결과 반환
		return sum;
	}
}
