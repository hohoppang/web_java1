package Day04;

import java.util.Scanner;

public class 연습2 {  // c s

	public static void main(String[] args) {  // m  s
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("연도 : "); int a = sc.nextInt();
//		if (a % 4 == 0) {
//			if (a % 400 == 0) System.out.println("1");
//			else if (a % 100 == 0) System.out.println("0"); 
//			else System.out.println("1");
//		}
//		else System.out.println("0");
		
		System.out.print("숫자 입력 : "); int a = sc.nextInt(); 
		System.out.print("숫자 입력 : "); int b = sc.nextInt();
		
		if(a > 0 && b > 0) System.out.println("1");
		if(a > 0 && b < 0) System.out.println("4");
		if(a < 0 && b > 0) System.out.println("2");
		if(a < 0 && b < 0) System.out.println("3");
	}  // m e
	
}  // c e
