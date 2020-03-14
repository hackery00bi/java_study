package c09;

public class a7
{
	public static void main(String[] args)
	{
		/* 객체 생성 */
		Square s = new Square();
		/* 필드 초기화(값 변경) */
		s.lenght = 4;
		/* 결과 출력 */
		System.out.printf("한 변의 길이가 %d인 정사각형의 넓이: %d", s.lenght, s.area());
	}
}

/* 정사각형 클래스 구현 */
class Square
{
	int s;
	int lenght;

	int area()
	{
		this.s = lenght * lenght;
		return this.s;
	}
}
