package c15;

public class a2
{
	public static void main(String[] args)
	{
		// 객체 생성
		SmartPhone2 sp = new SmartPhone2("스마트폰");
		// 비프음 내기
		sp.beep();
		// 음악 재생하기
		sp.playMusic("상어송");
	}
}

interface Alarm
{
	public void beep(); // 비프음

	public void playMusic(String title); // 음악 재생
}

class SmartPhone2 implements Alarm
{
	private String name; // 모델명

	public SmartPhone2(String name)
	{
		this.name = name;
	}

	/* Alarm 인터페이스의 추상 메소드를 재정의하시오. */
	@Override
	public void beep()
	{
		// TODO Auto-generated method stub
		System.out.println("삐빕! 삐비비빕~!");
	}

	@Override
	public void playMusic(String title)
	{
		// TODO Auto-generated method stub
		System.out.printf("[%s]을 재생합니다..!", title);
	}
}