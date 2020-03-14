package c09;

/* CatTest 클래스 */
public class a2
{
	public static void main(String[] args)
	{
		// Cat 객체 생성
		Cat c = new Cat();

		/* 1. 객체의 필드 값을 변경하시오. */

		// Dog 객체 필드값 출력
		System.out.printf("이름: %s\n", c.name);
		System.out.printf("품종: %s\n", c.breeds);
		System.out.printf("나이: %s\n", c.age);
	}
}

/* Cat 클래스 */
class Cat
{
	String name = "네로"; // 이름
	String breeds = "페르시안"; // 품종
	int age = 3; // 나이

	void claw()
	{
		System.out.println("할퀴기!!");
	}

	void meow()
	{
		System.out.println("야옹~");
	}
}