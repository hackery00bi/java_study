package c07;

public class a1
{
	public static void main(String[] args)
	{
		// 입력값 받기
		int startNum = Integer.parseInt(args[0]);

		// 카운트 다운 출력
		countDown(startNum);
	}

	public static void countDown(int num)
	{
		System.out.println("카운트 다운을 시작합니다..");

		while (num >= 0)
		{
			System.out.printf("%d..\n", num);
			num--;
		}

		System.out.println("발사!!");
	}
}
