package c13;

import java.util.Collections;
import java.util.Arrays;
import java.util.ArrayList;

public class a7
{
	public static void main(String[] args)
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		// 45개의 공을 만든다
		for(int i = 1; i <= 45; i++)
		{
			list.add(i);
		}
		// 섞는다
		Collections.shuffle(list);

		// 뽑는다
		int[] arr = new int[6];
		for(int i = 0; i < 6; i++)
		{
			arr[i] = list.get(i);
		}
		String result = Arrays.toString(arr);
		System.out.printf("자동 생성 번호: %s\n", result);

		// 결과 출력
	}
}