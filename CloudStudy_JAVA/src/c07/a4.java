package c07;

public class a4
{
	public static void main(String[] args)
	{
		// 1부터 10까지 총합 출력 및 계산
		printSum(1, 10);
	}

	// start부터 end까지의 총합을 출력
	public static void printSum(int start, int end)
	{
		// 변수 생성
		int sum = 0;

		// 총합 계산
		for (int i = start; i <= end; i++)
		{
			System.out.printf("%d", i);
			sum += i;

			// end(마지막 숫자)인 경우,
			if (i == end)
			{
				/* 반복문을 탈출하세요. */
				break;
			}

			System.out.printf(" + ");
		}

		// 결과 출력
		System.out.printf("\n=> %d", sum);
	}
}
