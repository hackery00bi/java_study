package c07;

public class a7
{
	public static void main(String[] args)
	{
		// 구구단 출력
		printGuGuDan();
	}

	public static void printGuGuDan()
	{
		/* 반복문을 사용하여 메소드를 완성하시오. */
		printDan(2); // 2단 출력
		printDan(3);
		printDan(4);
		printDan(5);
		printDan(6);
		printDan(7);
		printDan(8);
		printDan(9);
	}

	public static void printDan(int dan)
	{
		System.out.printf("%d단\n", dan);
		// dan x 1, dan x 2, ... , dan x 9
		for (int j = 1; j <= 9; j++)
		{
			System.out.printf("\t"); // 들여쓰기
			System.out.printf("%d x %d = %d\n", dan, j, dan * j);
		}
	}
}
