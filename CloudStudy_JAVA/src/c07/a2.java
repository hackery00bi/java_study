package c07;

public class a2
{
	public static void main(String[] args)
	{
		// 입력값 받기
		int n = Integer.parseInt(args[0]);

		// 메소드를 통한, 결과 출력
		printNumbers(n);
	}

	// 1부터 N까지, 정수를 출력
	public static void printNumbers(int max)
	{
		// 출력 시작!
		System.out.println("출력을 시작합니다..");

		// 반복을 통한, 숫자 출력
		for (int i = 1; i <= max; i++)
		{
			System.out.printf("%d ", i);
		}

		// 끝!
		System.out.println("\n끝!!");
	}
}
