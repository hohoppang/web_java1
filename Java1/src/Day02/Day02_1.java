package Day02;

public class Day02_1 { // c s
	
	// 주석
		// 1. 한줄주석 //
		// 2. 여러줄 주석 /* */
	
	// 자동완성 ctrl
	
	// main 메소드
		// 코드를 읽어주는 역활 [ 스레드 포함 ]
	
	// 출력
		// system.out.println();
	
	// 2진주 : 0, 1  [ 표현 단위 한계 ]
	// 10진수[사람[ : 0 ~ 9
	// 8진수 : 0 ~ 7
	// 16진수 : 0 ~ 9 a b c d e f

	public static void main(String[] args) {  // m s
		
		// 변수 : 데이터 저장하는 상자
			// 사람 : 1. 상자크기 2. 상자이름 3. 상자에 들어가는 값
			// 컴퓨터 : [ 메모리 = 저장장치(자원) ]
				// 1. 메모리 주소 [ 변수 식별 ] = 16진수
				// 2. 메모리 크기 [
		
		//1. 변수 선언 과 초기값
		int 변수1 = 10;
		// 2. 자료형
			boolean 논리변수 = true;
			System.out.println("논리변수 값은 : " + 논리변수);
			// boolean 논리변수2 = 10;  // 상자의 크기가 작기 떄문에 오류
		char 문자변수 = 'a';
		System.out.println("문자변수 값은 :" + 문자변수);
		char 문자변수2 = 97;
		System.out.println("문자변수2 의 값은 : " + 문자변수2);
		char 문자변수3 = 98;
		System.out.println(문자변수3);
		byte 바이트변수1 = 100;
		System.out.println(바이트변수1);
		byte 바이트변수2 = 'd';
		System.out.println(바이트변수2);
		short 숏변수1 = 100;
		System.out.println(숏변수1);
		short 숏변수2 = 'a';
		System.out.println(숏변수2);
		int 인트변수 = 100;
		System.out.println(인트변수);
		int 인트변수2 ='a';
		System.out.println(인트변수2);
		int 인트변수3 = 10000000;
		System.out.println(인트변수3);
		System.out.println("java 정수타입 기본단위 :" + (10));
		long 롱변수1 = 10000000000L;
		System.out.println(롱변수1);
		float 실수변수 = 10.51111111111f;
		System.out.println(실수변수);
		double 실수변수2 = 10.5111111111111111111111;
		System.out.println(실수변수2);
		char[] 문자열1 = new char[10];
		문자열1[0] = '안';
		문자열1[1] = '녕';
		문자열1[2] = '하';
		
		String 문자열2 = "안녕하";
		// 기본자료형에는 문자열이 없음 => char
		
		
	}  // m e
	
	
	
	
}  // c e
