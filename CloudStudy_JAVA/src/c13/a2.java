package c13;

//자바 API를 불러옴
import java.lang.Math;
import java.util.Random;

public class a2
{
	public static void main(String[] args)
	{
		// 변수 생성 및 주사위 던지기
		int[] count = new int[13];

		for(int i = 0; i < 100; i++)
		{
			switch(DieA2.roll() + DieB2.roll())
			{
			case 0:
				count[0]++;
				break;
			case 1:
				count[1]++;
				break;
			case 2:
				count[2]++;
				break;
			case 3:
				count[3]++;
				break;
			case 4:
				count[4]++;
				break;
			case 5:
				count[5]++;
				break;
			case 6:
				count[6]++;
				break;
			case 7:
				count[7]++;
				break;
			case 8:
				count[8]++;
				break;
			case 9:
				count[9]++;
				break;
			case 10:
				count[10]++;
				break;
			case 11:
				count[11]++;
				break;
			case 12:
				count[12]++;
				break;
			}
		}
		// 결과 출력
		for(int i = 2; i <= 12; i++)
		{
			System.out.printf("%2d => ", i);
			for(int j = 0; j <= count[i]; j++)
			{
				System.out.printf("#");
			}
			System.out.println();
		}
	}
}

class DieA2
{
// 1 부터 6사이 정수를 반환 [참고] https://cloudstudying.kr/challenges/348
	public static int roll()
	{
		double r = Math.random() * 6; // 0.0 <= r < 6.0
		int randInt = (int)r; // 0, 1, 2, ..., 5
		return randInt + 1; // 1, 2, 3, ..., 6
	}
}

class DieB2
{
	public static int roll()
	{
		// 1 부터 6사이 정수를 반환 [참고] https://cloudstudying.kr/challenges/404
		Random rand = new Random();
		int randInt = rand.nextInt(6); // (0 ~ 5)
		return randInt + 1;
	}
}

class sum
{
	public void printSum(int j)
	{
		// TODO Auto-generated method stub
		// for(i = 0; i <)
	}
}