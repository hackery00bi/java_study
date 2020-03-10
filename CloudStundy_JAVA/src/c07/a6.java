package c07;

public class a6
{
	public static void main(String[] args)
	{
		// 입력값 받기
		int r = Integer.parseInt(args[0]);
		int c = Integer.parseInt(args[1]);

		// 매트릭스 출력
		printMatrix(r, c);
	}

	public static void printMatrix(int rowMax, int columnMax)
	{
		for (int i = 0; i < rowMax; i++)
		{
			for (int j = 0; j < columnMax; j++)
			{
				System.out.printf("* ");
			}
			System.out.println();
		}
	}
}
