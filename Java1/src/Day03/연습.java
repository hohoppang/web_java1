package Day03;

import java.util.Scanner;

public class 연습 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//		System.out.print("inch 입력 : "); double inch = sc.nextDouble();
//		System.out.println((inch*2.54) + "cm");
//		
//		//문제14 :  연산 순서 나열 하고 x와 y값 예측하기
//	 	int x = 10;
//		int y = x-- + 5 + --x;
//		System.out.printf(" x의 값 : %d , y의값 :  %d ", x, y);
//		
		System.out.print("1번 쨰 수 : "); int a = sc.nextInt();
		System.out.print("2번 쨰 수 : "); int b = sc.nextInt();
		System.out.print("3번 쨰 수 : "); int c = sc.nextInt();
		System.out.print("4번 쨰 수 : "); int d = sc.nextInt();
		
		int up = a;
		if (a < b) up = b;
		if (b < c) up = c;
		if (c < d) up = d;
		System.out.println(up);
		
		
		
		
		
	}

}
