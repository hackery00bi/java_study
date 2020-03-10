package c08;

public class a5
{
	public static void main(String[] args)
	{
		// 배열 생성
		String[] names = { "Kim", "Lee", "Park", "Choi" };

		// 배열요소 출력
		for(int i = -1; i <= names.length; i++)
		{
			if(i < 0)
				System.out.printf("names[%d] => 에러!! 인덱스는 음수가 될 수 없음.\n", i);
			else if(i >= names.length)
			{
				System.out.printf("names[%d] => 에러!! 배열 인덱스를 벗어남.\n", i);
			}
			else
			{
				System.out.printf("names[%d] => %s\n", i, names[i]);
			}
		}
	}
}
