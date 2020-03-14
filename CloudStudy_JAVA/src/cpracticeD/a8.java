package cpracticeD;

public class a8
{
	public static void main(String[] args)
	{
		// 두 싸움꾼 객체 생성
		Hero arthas = new Hero("아서스");
		Hero leona = new Hero("레오나");

		// 격투 시작
		Hero.battle(arthas, leona);
	}
}

class Hero
{
	// 필드
	String name;
	int hp;

	// 생성자
	public Hero(String str)
	{
		name = str;
		hp = 30;
	}

	// 메소드(인스턴스 메소드)
	public void punch(Hero enemy)
	{
		/* 1. 해당 메소드를 완성하세요. */
		int original_hp = 30;
		System.out.printf("[%s]의 펀치\n\t%s: %d/%d\n", this.name, enemy.name, enemy.hp - 10, original_hp);
		enemy.hp -= 10;
	}

	// 메소드(클래스 메소드)
	public static void battle(Hero a, Hero b)
	{
		/* 2. 해당 메소드를 완성하시오. */
		b.punch(a);
		a.punch(b);
		b.punch(a);
		a.punch(b);
		a.punch(b);
	}
}