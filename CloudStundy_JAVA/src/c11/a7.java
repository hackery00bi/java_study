package c11;

public class a7
{
	public static void main(String[] args)
	{
		// 객체 생성
		Point p1 = new Point(0, 0);
		Point p2 = new Point(3, 4);

		// 거리 계산
		double dist = Point.distance(p1, p2);

		// 결과 출력
		System.out.printf("두 점 A%s, B%s 사이의 거리: %.2f", p1.toStr(), p2.toStr(), dist);
	}
}

class Point
{
	/* 1. 필드를 만드시오. */
	int x = 0;
	int y = 0;

	/* 2. 생성자를 정의하시오. */
	public Point(int x, int y)
	{
		// TODO Auto-generated constructor stub
		this.x = x;
		this.y = y;
	}

	/* 3. 객체 정보를 문자열로 반환하는 인스턴스 메소드를 만드시오. */
	public String toStr()
	{
		// TODO Auto-generated method stub
		String str = "(" + x + ", " + y + ")";
		return str;
	}

	/* 4. 두 점 사이의 거리를 반환하는 클래스 메소드를 만드시오. */
	static public double distance(Point p1, Point p2)
	{
		double dist = 0;
		dist = Math.sqrt(Math.pow((p1.x - p2.x), 2) + Math.pow((p1.y - p2.y), 2));

		return dist;
	}
}