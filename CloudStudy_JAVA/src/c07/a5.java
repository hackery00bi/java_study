package c07;

public class a5
{
	public static void main(String[] args)
	{
		printSum(1, 10);
	}

	public static void printSum(int start, int end)
	{
		// 변수 생성
		int sum = 0;

		// 반복 수행
		for (int i = start; i <= end; i++)
		{
			if (i % 3 == 0)
			{
				/* 1. 다음 반복으로 넘겨주세요. */
				continue;
			}

			System.out.printf("%d", i);
			sum += i;

			if (i == 10)
			{
				break;
			}
			System.out.printf(" + ");
		}

		// 결과 출력
		System.out.printf("\n=> %d", sum);
	}
}
