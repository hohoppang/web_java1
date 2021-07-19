package Day03;

import java.util.Scanner;


public class Day03_3 {

	public static void main(String[] args) {
		
		// 컴퓨터[0,1] : 기계어
		// 제어문 : if[논리 제어] , switch [데이터제어]
			// 목적 : 경우의수 에 따른 코드 처리
			// if : true, false 만 제어 가능
		
		//예1) true면 실행
//		if( 3 > 1) System.out.println("3이크다.1");
//		
//		//예2) false 이면 실행x
//		if( 3 > 5) System.out.println("3이크다.2");
//		
//		//예3)
//		if( 3 > 5) System.out.println("3이크다");
//		else System.out.println("3이 작다");
//		
//		//예4)
//		if( 3 > 2 ) {
//			System.out.println("true");
//			System.out.println("3 up");
//		}
//		else {
//			System.out.println("no");
//			System.out.println("2 up");
//		}
//		
//		//예5)  다중 조건
//		if( 3 > 5 ) System.out.println("3 up1");
//		else if( 3 > 4) System.out.println("3 up2");
//		else if (3 > 3) System.out.println("3 up3");
//		else if (3 > 2) System.out.println("3 up4");
//		else System.out.println("no");
//		
//		//예6 하나의 점수를 입력받아 80점 이상이면 합격출력 아니면 탈락
		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("점수 입력 : "); int 점수 = sc.nextInt();
//		if(점수 >= 80) System.out.println("합격");
//		else System.out.println("탈락");
//		
//		//예7) 하나의 점수 90 a 80 b 70 c 탈락
//		System.out.print("점수 입력 ::"); int s = sc.nextInt();
//		
//		if(s >= 90) System.out.println("a");
//		else if (s >= 80) System.out.println("b");
//		else if (s >= 70) System.out.println("c");
//		else System.out.println("나가");
		
		//문제1 2개의 정수를 입력받아 더 큰수 출력
//		System.out.print("수 입력 : "); int a = sc.nextInt();
//		System.out.print("수 입력 : "); int b = sc.nextInt();
//		if (a > b) System.out.println("a" + a);
//		else if (a < b) System.out.println("b" +  b);
//		else System.out.println("same");
//		
//		//문제2 3개의 정수를 입력받아 더 큰수 출력
//		System.out.print("수 입력 : "); int x = sc.nextInt();
//		System.out.print("수 입력 : "); int y = sc.nextInt();
//		System.out.print("수 입력 : "); int z = sc.nextInt();
		
		//문제3 4개의 정수를 입력받아 더 큰수 출
		System.out.print("x수 입력 : "); int x = sc.nextInt();
		System.out.print("y수 입력 : "); int y = sc.nextInt();
		System.out.print("z수 입력 : "); int z = sc.nextInt();
		System.out.print("a수 입력 : "); int a = sc.nextInt();
		int c = x;
		if (c < y) c = y;
		if (c < z) c = z;
		if (c < a) c = a;
		System.out.println("대가리는" + c);
				
//		if(x > y && x > z && x > a ) System.out.println("x" + x);
//		else if (y > x && y > z && y > a) System.out.println("y");
//		else if (z > x && z > y && z > a) System.out.println("z");
//		else System.out.println("a");
//		
		
		
		
		
		
		
		
	}
}
