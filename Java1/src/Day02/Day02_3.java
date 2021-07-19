package Day02;

import java.net.MulticastSocket;
import java.util.Scanner;

public class Day02_3 {
	
	public static void main(String[] args) {
		
		
		// 1. 입력객체 [ 키보드로부터 입력값 가져오는 역활 ]
		// Scanner a = new Scanner(System.in);
			// 클래스의 첫글자 => 대문자 입력
		
		// 2. 입력객체에서 입력받은 값을 변수에 저장
//		System.out.print("학생1의 이름입력 : "); String 학생1 = a.next();
//		System.out.print("학생1의 1교시 : "); int 학생1_1교시 = a.nextInt();
//		System.out.print("학생1의 2교시 : "); int 학생1_2교시 = a.nextInt();
//		System.out.print("학생1의 3교시 : "); int 학생1_3교시 = a.nextInt();
//		
//		System.out.print("학생2의 이름입력 : "); String 학생2 = a.next();
//		System.out.print("학생2의 1교시 : "); int 학생2_1교시 = a.nextInt();
//		System.out.print("학생2의 2교시 : "); int 학생2_2교시 = a.nextInt();
//		System.out.print("학생2의 3교시 : "); int 학생2_3교시 = a.nextInt();
//		// 출력
//		System.out.println("\n====== 출석부 print=====\n");
//		System.out.println("학생명\t1교시\t2교시\3교시");
//		System.out.println(학생1+"\t"+학생1_1교시+"\t"+학생1_2교시+"\t"+학생1_3교시);
//		System.out.println(학생2+"\t"+학생2_1교시+"\t"+학생2_2교시+"\t"+학생2_3교시);		
	
		// 문제3
//		Scanner a = new Scanner(System.in);
//		System.out.print("가입할 아이디 : "); String id = a.next();
//		System.out.print("가입할 비밀번호 : "); Short pw = a.nextShort();
//		System.out.print("가입할 성명 : "); String na = a.next();
//		System.out.print("가입할 이메일 : "); String em = a.next();
//		
//		System.out.println(">>>>>>> 회원가입 완료 아래 정뵤를 확인해주세요>>>>>>");
//		System.out.println("아이디\t비밀번호\t성명\t이메일");
//		System.out.println(id+"\t"+pw+"\t"+na+"\t"+em);
		
//		Scanner a = new Scanner(System.in);
//		System.out.print("학생1 이름"); String na1 = a.next();
//		System.out.print("학생1 국어"); int na1_lang = a.nextInt();
//		System.out.print("학생1 영어"); int na1_eng = a.nextInt();
//		System.out.print("학생1 수학"); int na1_math = a.nextInt();
//		
//		System.out.print("학생2 이름"); String na2 = a.next();
//		System.out.print("학생2 국어"); int na2_lang = a.nextInt();
//		System.out.print("학생2 영어"); int na2_eng = a.nextInt();
//		System.out.print("학생2 수학"); int na2_math = a.nextInt();
//		
//		System.out.println("========== 점수표 =========");
//		System.out.println("학생명\t국어\t엉어\t수학");
//		System.out.println(na1+"\t"+na1_lang+"\t"+na1_eng+"\t"+na1_math);
//		System.out.println(na2+"\t"+na2_lang+"\t"+na2_eng+"\t"+na2_math);
//		System.out.println("=========================");
//		
		Scanner num = new Scanner(System.in);
//		System.out.print("a : "); int a = num.nextInt();
//		System.out.print("b : "); int b = num.nextInt();
//		System.out.println("a + b : " + (a + b));
//		
		System.out.print("a : "); double a = num.nextInt();
		System.out.print("b : "); double b = num.nextInt();
		System.out.print("c : "); double c = num.nextInt();
//		System.out.println("a + b : " + (a + b));
//		System.out.println("a - b : " + (a - b));
//		System.out.println("a * b : " + (a * b));
//		System.out.println("a / b : " + (a / b));
//		System.out.println("a % b : " + (a % b));
		System.out.println((a+b)%c);
		System.out.println(((a%c)+(b%c)%c));
		System.out.println((a*c)%c);
		System.out.println(((a%c)*(b%c))%c);
		
		
	}

}
