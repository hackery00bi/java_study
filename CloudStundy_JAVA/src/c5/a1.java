package c5;

public class a1
{
	public static void main(String[] args)
	{
		// 변수 생성
		int n = 3;

		// 메소드 호출을 통한 값 계산
		int x = cube(n);

		// 결과 출력
		System.out.printf("%d의 세제곱 => %d", n, x);
	}

	public static int cube(int num1)
	{
		// 변수 생성
		int result;

		/* 2. 세제곱을 계산하시요 */
		result = num1 * num1 * num1;

		// 값 반환
		return result;
	}
}
