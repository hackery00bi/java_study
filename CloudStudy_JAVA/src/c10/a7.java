package c10;

public class a7
{
	public static void main(String[] args)
	{
		// 객체 생성
		Star_hero raynor = new Star_hero("레이너", 80, 0);
		Star_hero morales = new Star_hero("모랄레스", 60, 60);
		// 마린의 스팀팩!
		raynor.stimpack();
		// 메딕의 힐!
		morales.heal(raynor);
	}
}

class Star_hero
{
	String name;
	int hp;
	int mp;

	Star_hero(String n, int h, int m)
	{
		name = n;
		hp = h;
		mp = m;
	}

	void stimpack()
	{
		System.out.printf("[%s]의 스팀팩! HP: %d -> %d\n", this.name, this.hp, this.hp - 10);
		this.hp -= 10;
	}

	void heal(Star_hero target)
	{
		System.out.printf("[%s]의 치유! => [%s] HP(%d -> %d)\n", this.name, target.name, target.hp, target.hp + 10);
		target.hp += 10;
	}

}