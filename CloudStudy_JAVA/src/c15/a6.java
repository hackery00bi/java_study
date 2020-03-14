package c15;

import java.util.ArrayList;

public class a6
{
	public static void main(String[] args)
	{
		// 객체 생성
		Food jokbal = new Food("족발", 19800);
		Electronics airpod = new Electronics("에어팟", 199000);
		Clothing shirt = new Clothing("셔츠", 49900);

		ArrayList<Orderable> list = new ArrayList<Orderable>();
		list.add(jokbal);
		list.add(airpod);
		list.add(shirt);

		int sum = 0;

		// 총합 계산
		for(int i = 0; i < list.size(); i++)
		{
			Orderable f = list.get(i);
			sum += f.discountedPrice();
		}
		// 결과 출력
		System.out.printf("총합: %d원", sum);
	}
}

interface Orderable
{
	public int discountedPrice();
}

class Food implements Orderable
{
	private String name;
	private int price;

	public Food(String name, int price)
	{
		this.name = name;
		this.price = price;
	}

	/* 1. 오버라이딩을 통해, 음식 할인율을 적용하세요. */
	@Override
	public int discountedPrice()
	{
		int discountedPrice = (int)((double)price * 0.9);
		return discountedPrice;
	}
}

class Electronics implements Orderable
{
	private String name;
	private int price;

	public Electronics(String name, int price)
	{
		this.name = name;
		this.price = price;
	}

	/* 2. 오버라이딩을 통해, 전자기기 할인율을 적용하세요. */
	@Override
	public int discountedPrice()
	{
		// TODO Auto-generated method stub
		int discountedPrice = (int)((double)price * 0.8);
		return discountedPrice;
	}
}

class Clothing implements Orderable
{
	private String name;
	private int price;

	public Clothing(String name, int price)
	{
		this.name = name;
		this.price = price;
	}

	/* 3. 오버라이딩을 통해, 의류 할인율을 적용하세요. */
	@Override
	public int discountedPrice()
	{
		// TODO Auto-generated method stub
		int discountedPrice = (int)((double)price * 0.7);
		return discountedPrice;
	}
}