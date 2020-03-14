package c15;

public class a7
{
	public static void main(String[] args)
	{
		// 객체 생성
		Dog d = new Dog();
		Baby b = new Baby();
		Tiger t = new Tiger();
		Robot r = new Robot();
		// 인터페이스 배열 생성
		Sounding[] s = new Sounding[4];

		s[0] = d;
		s[1] = b;
		s[2] = t;
		s[3] = r;
		// 소리내기
		for(int i = 0; i < s.length; i++)
		{
			s[i].sound();
		}
	}
}

/* 인터페이스 및 클래스를 작성하시오. */
interface Sounding
{
	void sound();
}

class Dog implements Sounding
{
	@Override
	public void sound()
	{
		// TODO Auto-generated method stub
		System.out.println("Dog: 멍멍!");
	}
}

class Baby implements Sounding
{
	@Override
	public void sound()
	{
		// TODO Auto-generated method stub
		System.out.println("Baby: 응애!");
	}
}

class Tiger implements Sounding
{
	@Override
	public void sound()
	{
		// TODO Auto-generated method stub
		System.out.println("Tiger: 어흥!");
	}
}

class Robot implements Sounding
{
	@Override
	public void sound()
	{
		// TODO Auto-generated method stub
		System.out.println("Robot: 삐빕!");
	}
}