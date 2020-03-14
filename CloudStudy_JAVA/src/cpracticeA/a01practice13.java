package cpracticeA;

public class a01practice13
{
	public static void main(String[] args)
	{
		// 변수 생성
		double time = 5.0; // 이동 시간
		double gravity = -9.81; // 중력 가속도
		double initialVelocity = 0.0; // 초기 속도
		double initialPosition = 1000.0; // 초기 위치

		/* 1. 물리 공식을 코드화 하시오. */
		double finalPosition = (0.5 * gravity * time * time) + (initialVelocity * time) + initialPosition;

		// 결과 출력
		System.out.printf("%.2f초 후 위치: %.2fm\n", time, finalPosition);
	}
}
