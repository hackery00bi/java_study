package cpracticeA;

public class a01practice09
{
	public static void main(String[] args)
	{
		// 속도(m/s) = 거리(m) / 시간(s)
		double meter = 100;
		double sec = 18;

		// 속도(km/h) = 거리(km) / 시간(h)
		double sisok = (meter / 100) / (((sec * 10)/60)/60);

		// 결과 출력
		System.out.println(sisok + " km/h");
	}
}
