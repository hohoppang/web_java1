package Day03;

import java.util.Scanner;

public class ���� {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//		System.out.print("inch �Է� : "); double inch = sc.nextDouble();
//		System.out.println((inch*2.54) + "cm");
//		
//		//����14 :  ���� ���� ���� �ϰ� x�� y�� �����ϱ�
//	 	int x = 10;
//		int y = x-- + 5 + --x;
//		System.out.printf(" x�� �� : %d , y�ǰ� :  %d ", x, y);
//		
		System.out.print("1�� �� �� : "); int a = sc.nextInt();
		System.out.print("2�� �� �� : "); int b = sc.nextInt();
		System.out.print("3�� �� �� : "); int c = sc.nextInt();
		System.out.print("4�� �� �� : "); int d = sc.nextInt();
		
		int up = a;
		if (a < b) up = b;
		if (b < c) up = c;
		if (c < d) up = d;
		System.out.println(up);
		
		
		
		
		
	}

}
