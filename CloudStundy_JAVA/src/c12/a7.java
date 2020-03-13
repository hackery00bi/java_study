package c12;

public class a7
{
	public static void main(String[] args)
	{
		// 객체 생성
		Knight don = new Knight("돈키호테", 30);
		// 정보 출력
		don.printInfo();
		// 체력 증가: 기존 체력 + 30
		System.out.println("[체력 증가 +30]");
		don.setHp(60);
		// 결과 출력
		don.printInfo();
	}
}

class Knight
{
	// 필드
	private String name;
	private int hp;

	// 생성자
	public Knight(String n, int h)
	{
		// TODO Auto-generated constructor stub
		name = n;
		hp = h;
		System.out.printf("[객체 생성]\n");
	}

	// 게터
	public int getHp()
	{
		return hp;
	}

	// 세터
	public void setHp(int hp)
	{
		this.hp = hp;
	}

	public void printInfo()
	{
		// TODO Auto-generated method stub
		System.out.printf("\tKnight { name: %s, hp: %d }\n", name, hp);
	}
}