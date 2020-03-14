package cpracticeD;

public class a2
{
	public static void main(String[] args)
	{
		// 음식 객체 생성
		Food chicken = new Food("치킨", 18000);
		Food pizza = new Food("피자", 28000);
		Food sushi = new Food("초밥세트", 22000);

		// 객체 배열에 음식 담기
		Food[] foods = { chicken, pizza, sushi };

		// 모든 음식 정보 출력
		for(int i = 0; i < foods.length; i++)
		{
			System.out.println(foods[i].toString());
		}
	}
}

class Food
{
	/* 1. 필드를 추가하세요. */
	String name;
	int price;

	/* 2. 생성자를 추가하세요. */
	public Food(String n, int p)
	{
		// TODO Auto-generated constructor stub
		name = n;
		price = p;
	}

	/* 3. toString() 메소드를 추가하세요. */
	public String toString()
	{
		return String.format("Food { name: %s, price: %d원 }", this.name, this.price);
	}
}