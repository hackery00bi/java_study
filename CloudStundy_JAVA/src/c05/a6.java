package c05;

public class a6
{
	public static void main(String[] args)
	{
		drawRectangle();
	}

	public static void drawRectangle()
	{
		/* 직사각형이 그려지도록 해당 메소드를 구현하세요. */
		drawLine();
		drawEdge();
		drawLine();
	}

	// 직선을 그리는 메소드
	public static void drawLine()
	{
		System.out.println("* * * * * *");
	}

	// 양 끝점을 그리는 메소드
	public static void drawEdge()
	{
		System.out.println("*         *");
	}
}
