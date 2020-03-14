package cpracticeD;

public class a1
{
	public static void main(String[] args)
	{
		// 객체 생성
		Cylinder c = new Cylinder();

		// 속성 값 입력
		c.radius = 4;
		c.height = 5;

		// 출력
		System.out.printf("원기둥의 부피: %.2f\n", c.getVolume());
		System.out.printf("원기둥의 겉넓이: %.2f\n", c.getArea());
	}
}

class Cylinder
{
	/* 필드와 메소드를 구현하시오. */
	double radius;
	double height;
	double pi = Math.PI;

	public double getVolume()
	{
		// TODO Auto-generated method stub
		double volume;

		volume = radius * radius * pi * height;
		return volume;
	}

	public double getArea()
	{
		double area;
		
		area = 2 * pi * radius * height + pi * radius * radius * 2;
		
		return area;
	}
}