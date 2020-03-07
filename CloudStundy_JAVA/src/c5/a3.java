package c5;

public class a3
{
	public static void main(String[] args)
	{
		int a = (int)square(3.0);
		int b = cube(2);
		System.out.printf("a = %d, b = %d\n", a, b);
	}

	public static double square(double n)
	{
		return n * n;
	}

	public static int cube(int n)
	{
		return n * n * n;
	}
}
