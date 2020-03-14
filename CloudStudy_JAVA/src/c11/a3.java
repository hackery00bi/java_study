package c11;

public class a3
{
	public static void main(String[] args)
	{
		// 선수 객체 생성
		Player2 kim = new Player2("Kim", new int[] { 9, 8, 10 });
		Player2 lee = new Player2("Lee", new int[] { 10, 9, 10 });
		Player2 park = new Player2("Park", new int[] { 8, 10, 9 });

		Player2 xiao = new Player2("Xiao", new int[] { 10, 9, 10 });
		Player2 yu = new Player2("Yu", new int[] { 8, 9, 10 });
		Player2 xui = new Player2("Xui", new int[] { 8, 9, 9 });

		// 객체 배열 만들기
		Player2[] koreaPlayer2s = { kim, lee, park };

		Player2[] chinaPlayer2s = { xiao, yu, xui };

		// 팀 객체 생성
		Team korea = new Team("KOREA", koreaPlayer2s);

		Team china = new Team("CHINA", chinaPlayer2s);

		// 팀 점수 출력
		korea.printTeamPoints();
		china.printTeamPoints();
	}
}

// 팀 클래스
class Team
{
	// 필드
	String nation; // 나라
	Player2[] Player2s; // 선수들

	// 생성자
	Team(String str, Player2[] arr)
	{
		nation = str;
		Player2s = arr;
	}

	// 메소드
	void printTeamPoints()
	{
		int sum = 0;
		for(int i = 0; i < Player2s.length; i++)
		{
			sum += Player2s[i].totalPoints();
		}
		System.out.printf("%s -> %d points\n", nation, sum);
	}
}

// 선수 클래스
class Player2
{
	// 필드
	String name; // 이름
	int[] points; // 득점 현황

	// 생성자
	Player2(String str, int[] arr)
	{
		name = str;
		points = arr;
	}

	// 메소드
	int totalPoints()
	{
		int sum = 0;
		for(int i = 0; i < points.length; i++)
		{
			sum += points[i];
		}
		return sum;
	}
}