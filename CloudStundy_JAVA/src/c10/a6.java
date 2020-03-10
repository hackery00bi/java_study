package c10;

public class a6
{
	public static void main(String[] args)
	{
		// 객체 생성
		Hero2 thor = new Hero2("토르", 150); // thor -> {"토르", 150}
		Hero2 thanos = new Hero2("타노스", 160); // thanos -> {"타노스", 160}

		// 토르의 펀치 -> 타노스
		thor.punch(thanos);

		/* 2.코드를 추가하여 펀치를 주고 받으세요. */
		thanos.punch(thor);
		thanos.punch(thor);
	}
}

class Hero2
{
	// 필드
	String name;
	int hp;

	// 생성자
	Hero2(String s, int i)
	{
		name = s;
		hp = i;
	}

	// 메소드
	void punch(Hero2 enemy)
	{
		// 때린 주체 객체
		System.out.printf("[%s]의 펀치!! ", this.name);

		/* 1. 맞은 객체에 대한 정보를 출력하세요. */
		System.out.printf("%s의 HP: %d -> %d\n", enemy.name, enemy.hp, enemy.hp - 10);
		enemy.hp -= 10;
	}
}