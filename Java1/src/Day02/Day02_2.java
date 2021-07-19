package Day02;

import java.util.Scanner;
	// import : 다른파일에 있는 라이브러리[클래스] 가져오기
	// import 패키지명.클래스

public class Day02_2 {

	//입력받기
	public static void main(String[] args) {
		
		//1. Scanner 클래스 : 입력관련 클래스
		Scanner 입력객체 = new Scanner(System.in);
			//1. Scanner : 입력관련된 메소드 제공
				//2. 객체이름 : 객체의 이름[ 임의의값 ]
					// 3. new : 객체의 메모리 할당 연산자
						//4. Scanner() : 클래스의 생성자
		System.out.println("정수 입력 :" );
		//1. 변수 생성
		int 입력정수 ; 
		// 2. 변수에 입력값 저장
		입력정수 = 입력객체.nextInt();
		// 3. 변수 출력
		System.out.println("현재입력한 정수 : " + 입력정수);
		
		System.out.println("문자열 입력 : ");
		String 문자열 = 입력객체.next();
		System.out.println("현재 입력한 문자열을 :" + 문자열);
		입력객체.nextLine();
		System.out.println(" 공백포함 입력 : ");
		String 문자열2 = 입력객체.nextLine();
		System.out.println("현재 입력한 문자열을 :" + 문자열2);
		
		
	}
}
