package cpracticeE;

import java.util.ArrayList;

public class a5
{
	public static void main(String[] args)
	{
		/* 1. 메뉴 객체를 생성하세요. */
		Menu gimbab = new Menu("김밥", 2000, 57);
		Menu donggas = new Menu("돈까스", 6000, 29);
		Menu nengmian = new Menu("냉면", 5000, 34);
		/* 2. 스토어 객체에 메뉴를 추가하세요. */
		Store s = new Store();
		s.add(gimbab);
		s.add(donggas);
		s.add(nengmian);
		/* 3. 하루 총 매출을 계산하세요. */
		System.out.printf("총 매출: %d원\n", s.totalSales());
	}
}

class Store
{
	private ArrayList<Menu> list;

	public Store()
	{
		this.list = new ArrayList<Menu>();
	}

	public void add(Menu menu)
	{
		list.add(menu);
	}

	/* 4. 총 매출액 계산 메소드를 만드세요. */
	public int totalSales()
	{
		int sum = 0;
		for(int i = 0; i < list.size(); i++)
		{
			Menu m = list.get(i);
			for(int j = 0; j < m.getCount(); j++)
			{
				sum += m.getPrice();
			}
		}
		return sum;
	}
}

class Menu
{
	private String name; // 메뉴명
	private int price; // 가격
	private int count; // 하루 판매량

	public Menu(String name, int price, int count)
	{
		this.name = name;
		this.price = price;
		this.count = count;
	}

	/* 5. price의 게터를 만드세요. */
	public int getPrice()
	{
		return price;
	}

	/* 6. count의 게터를 만드세요. */
	public int getCount()
	{
		return count;
	}
}