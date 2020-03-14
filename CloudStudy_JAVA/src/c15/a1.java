package c15;

public class a1
{
	public static void main(String[] args)
	{
		// 객체 생성
		SmartPhone sp = new SmartPhone("아이폰", "010-0000-0000");

		// 전화 걸기
		sp.call("010-1234-5678");

		// 전화벨이 울림
		sp.ring();
	}
}

interface Phone
{
	// targetNumber로 전화를 걸거야! 어떻게? 그건 아직 몰라!
	public void call(String targetNumber);

	// 전화벨이 울릴거야! 어떻게? 그건 아직 몰라!
	public void ring();
}

class SmartPhone implements Phone
{
	protected String name;
	protected String phoneNumber;

	public SmartPhone(String name, String phoneNumber)
	{
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	/* Phone 인터페이스의 모든 프로토타입 메소드를 구현하시오. */
	@Override
	public void call(String targetNumber)
	{
		// TODO Auto-generated method stub
		System.out.printf("%s로 전화를 겁니다!\n", targetNumber);
	}

	@Override
	public void ring()
	{
		// TODO Auto-generated method stub
		System.out.println("전화벨이 울립니다~");
	}
}