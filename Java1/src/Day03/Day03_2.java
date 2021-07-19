package Day03;

import java.util.Scanner;

public class Day03_2 {
	
	public static void main(String[] args) {
		
		// 0. 입력객체 선언
		Scanner a = new Scanner(System.in);
		
		//문제1 : 
			/*
				 * 		*급여 명세서 
				 * [ 조건 ] 입력받기 : 기본급 , 수당 
				 * [ 출력 ] 실수령액 = 기본급 + 수당 - 세금[ 기본급10% ]
				 * 
				 */		
		//1. 변수에 입력값 저장
//		System.out.print("기본금 입력 : "); int no = a.nextInt();
//		System.out.print("수당 입력 : "); int i = a.nextInt();
//		//2. 변수 계산
//		int 실수령액 = no + i - (int)(no*0.1);
//		System.out.println(" 실 수령액 : " + 실수령액);
		
		
//		문제5 :
//			 * 		* 지폐 갯수 세기
//			 * 	[조건] 입력받기 : 금액 
//			 * 	[출력] 금액에 해당하는 지폐수 세기
//			 * 	[출력 예] : 356789 =>
//			 * 			십만원 : 3장
//			 * 			만원 : 5장
//			 * 			천원 : 6장
//			 * 			백원 : 7개 
		
//		System.out.print("금액 입력 : "); int 금액 = a.nextInt();
//		// 1. 십만원권 세기
//		System.out.println("십만원권 : " + (금액/100000));
//		// 1. 금액에서 십만원권 빼기
//			금액 -= (금액/100000)*100000;
//		// 2. 만원권 세기
//		System.out.println("만원권 : " + (금액/10000));
//			금액 -= (금액/10000) * 10000;
//		// 3. 천원 세기
//		System.out.println("천원권 : " + (금액/1000));
//			금액 -= (금액/1000) * 1000;
//		// 4. 백원 세기
//		System.out.println("백원 : " + (금액/100));
//			금액 -= (금액/100) * 100;
		
		
		// 문제 3 하나의 졍수를 입력받아 7의 배수인지 출력
//		System.out.print("7배수 입력 : "); int x = a.nextInt();
//		System.out.println(x%7 == 0);
//									
//		// 문제 4 하나의 졍수를 입력받아 홀수 인지 확인
//		System.out.print("홀수 입력 : "); int y = a.nextInt(); 	
//		System.out.println(y%2 == 1);	
//			
//		// 문제 5 하나의 졍수를 입력받아 7의 배수이면서 짝수 인지 확인
//		System.out.print("7, 짝수 입력 : "); int z = a.nextInt(); 	
//		System.out.println((z%2 == 0) && (z%7 == 0) );	
//			
//		// 문제 6 두개의 졍수를 입력받아 더 큰지 출력
//		System.out.print("큰수 입력 : "); int q = a.nextInt();
//		System.out.print("큰수 입력 : "); int w = a.nextInt();
//		System.out.println(q > w);
		
//		문제7 : 반지름을 입력받아 원 넓이 출력하기 
//		// 원 넓이 공식 => 반지름 * 반지름 * 원주율[3.14]
//		System.out.print("반지름 입력 : "); float half = a.nextFloat();
//		System.out.println("넚이 : " + (half * half * 3.14));
		
//	문제8 : 두 실수를 입력받아 앞실수의 값이 뒤의 값의 몇% 인지 출력하기
//		// 예) 54.5   84.3 이면    64.285714%
		System.out.print("앞 입력 : "); float 앞 = a.nextFloat();
		System.out.print("뒤 입력 : "); float 뒤 = a.nextFloat();
		System.out.println("% : " + (앞 / 뒤)*100);
		
//	문제9 : 사다리꼴 넓이 구하기[윗변과 밑변 높이를 입력받아 출력하기]
//		//사다리꼴 계산식 = > (윗변 * 밑변) * 높이 / 2
//		System.out.print("위 입력 : "); float 위 = a.nextFloat();
//		System.out.print("아래 입력 : "); float 아래 = a.nextFloat();
//		System.out.print("높이 입력 : "); float 높이 = a.nextFloat();
//		System.out.println(위*아래*높이/2);
//		
//	문제10: 키를 정수를 입력받아 표준체중 출력하기
//		//표준체중 계산식 = > (키 - 100) * 0.9
		System.out.print("키 입력 : "); float 키 = a.nextFloat();
		double 표준체중 = (키 - 100) * 0.9;
		System.out.println("표준체중 : " + 표준체중);
		
//	문제11: 키와 몸무게를 입력받아 BMI 출력하기
//		//BMI 계산식 = > 몸무게 / ((키 / 100) * (키 / 100))
		System.out.print("키 입력 : "); float 키2 = a.nextFloat();
		System.out.print("몸무게 입력 : "); float 몸 = a.nextFloat();
		
		
//	문제12: inch 를 입력받아 cm 로 변환하기
//	문제13:  중간고사, 기말고사, 수행평가를 입력받아 반영비율별 계산하기
//		//소수 둘째 자리 까지 점수 출력하기
//		//중간고사 반영비율 => 30 %
//		//기말고사 반영비율 => 30 %
//		//수행평가 반영비율 => 40 %
//	문제14 :  연산 순서 나열 하고 x와 y값 예측하기
//	 	//int x = 10;
//		//int y = x-- + 5 + --x;
//		//printf(" x의 값 : %d , y의값 :  %d ", x, y)
		
		
		
		
		
		
		
		
		
	}

}
