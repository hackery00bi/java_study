package c3;

public class a010307
{
	public static void main(String[] args)
	{
		/* 1. 문자열을 실수로 변환하세요. */
		double input_f = Double.parseDouble(args[0]);
		double input_c;
		/* 2. 화씨온도를 섭씨로 변환하세요. */
		input_c = (input_f - 32.0) / 1.8;
		/* 3. 결과를 출력하세요. */
		System.out.println("화씨 " + input_f + "도는 섭씨로 " + input_c + "도 입니다!");
	}
}
