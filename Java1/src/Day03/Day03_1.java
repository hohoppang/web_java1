package Day03;

public class Day03_1 {  // c  s
	
	public static void main(String[] args) {  // m s
		
		// 연산자
		//1. 산술연산자 [ + - * / % ]
			//예1)
			int 정수1 = 10; int 정수2 = 20;
			System.out.println("더하기 : " + 정수1+정수2); // + 연결연산자
			System.out.println("더하기 : " + (정수1+정수2)); // + 산술연산자
			System.out.println("빼기 : " + (정수1-정수2));
			System.out.println("곱하기 : " + (정수1*정수2));
			System.out.println("나누기 : " + (정수1/정수2));
			System.out.println("나머지 : " + (정수1%정수2));
			
		//2. 비교연산자 [ >=이상 <=이하 >
			// 결과 => true / false
			//예2) 
			System.out.println("이상 :" + (정수1>=정수2));
			System.out.println("이하 :" + (정수1<=정수2));
			System.out.println("초과 :" + (정수1>정수2));
			System.out.println("미만 :" + (정수1<정수2));
			System.out.println("같다 :" + (정수1==정수2));
			System.out.println("다르다 :" + (정수1!=정수2));
			
		//3. 논리[관계]연산자 비교연산자 2개이상일떄 [ and : && or : || not : ! ]
			int 정수3 = 30; int 정수4 = 40;
			System.out.println("and : " + (정수1>=정수2 && 정수4>=정수3));
			System.out.println("or : " + (정수1>=정수2 || 정수4>=정수3));
			System.out.println("not : " + !(정수1>=정수2 || 정수4>=정수3));
			
		//4. 대입연산자 [ 오른쪽데이터가 왼쪽으로 데이터 넣기 ]
			// = 대입 +=	-=	*=	/=	%=
			정수1 = 정수1 + 1;
			정수1 += 1;
			System.out.println("정수1 값은 : " + 정수1);
			
		//5. 증감연산자 [ 1씩 증가 혹은 1씩 감소 ]
			// ++변수 : 선위증가 	변수++ : 후위증가
			// --변수 : 선위감소	변수-- : 후위감소
			정수1 += 1;
			정수1++;
			System.out.println("정수1 값은 : " + 정수1);
			System.out.println("선위증가 : " + (++정수1));
			System.out.println("후위증가 : " + (정수1++));
			System.out.println("확인 : " + 정수1);
			System.out.println();
			System.out.println("선위감소 : " + (--정수1));
			System.out.println("후위감소 : " + (정수1--));
			System.out.println("확인 : " + 정수1);
		
	}  // m e

}  // c  e
