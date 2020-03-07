package c6;

public class a6
{
	public static void main(String[] args)
	{
		/* 1. 입력값 받기 */
		int input_year = Integer.parseInt(args[0]);
		boolean yoon;
		/* 2. 윤년 여부 계산 */
		yoon = check_yoon(input_year);
		/* 4. 결과 출력 */
		System.out.println(input_year + "년은 윤년입니까? " + yoon);
	}
	
	/* 3. 윤년 여부를 반환하는 메소드 */
	public static boolean check_yoon(int input_year)
	{
		// TODO Auto-generated method stub
		boolean yoon;
		int chk;
		
		if(input_year % 4 == 0)
		{
			yoon = true;
			chk = input_year / 4;
			if(chk % 100 == 0)
				yoon = false;
				if(chk % 1000 ==0)
					yoon = true;
		}
		else
		{
			yoon = false;
		}
		return yoon;
	}
}
