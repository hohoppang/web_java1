package Day02;

import java.net.MulticastSocket;
import java.util.Scanner;

public class Day02_3 {
	
	public static void main(String[] args) {
		
		
		// 1. �Է°�ü [ Ű����κ��� �Է°� �������� ��Ȱ ]
		// Scanner a = new Scanner(System.in);
			// Ŭ������ ù���� => �빮�� �Է�
		
		// 2. �Է°�ü���� �Է¹��� ���� ������ ����
//		System.out.print("�л�1�� �̸��Է� : "); String �л�1 = a.next();
//		System.out.print("�л�1�� 1���� : "); int �л�1_1���� = a.nextInt();
//		System.out.print("�л�1�� 2���� : "); int �л�1_2���� = a.nextInt();
//		System.out.print("�л�1�� 3���� : "); int �л�1_3���� = a.nextInt();
//		
//		System.out.print("�л�2�� �̸��Է� : "); String �л�2 = a.next();
//		System.out.print("�л�2�� 1���� : "); int �л�2_1���� = a.nextInt();
//		System.out.print("�л�2�� 2���� : "); int �л�2_2���� = a.nextInt();
//		System.out.print("�л�2�� 3���� : "); int �л�2_3���� = a.nextInt();
//		// ���
//		System.out.println("\n====== �⼮�� print=====\n");
//		System.out.println("�л���\t1����\t2����\3����");
//		System.out.println(�л�1+"\t"+�л�1_1����+"\t"+�л�1_2����+"\t"+�л�1_3����);
//		System.out.println(�л�2+"\t"+�л�2_1����+"\t"+�л�2_2����+"\t"+�л�2_3����);		
	
		// ����3
//		Scanner a = new Scanner(System.in);
//		System.out.print("������ ���̵� : "); String id = a.next();
//		System.out.print("������ ��й�ȣ : "); Short pw = a.nextShort();
//		System.out.print("������ ���� : "); String na = a.next();
//		System.out.print("������ �̸��� : "); String em = a.next();
//		
//		System.out.println(">>>>>>> ȸ������ �Ϸ� �Ʒ� ���̸� Ȯ�����ּ���>>>>>>");
//		System.out.println("���̵�\t��й�ȣ\t����\t�̸���");
//		System.out.println(id+"\t"+pw+"\t"+na+"\t"+em);
		
//		Scanner a = new Scanner(System.in);
//		System.out.print("�л�1 �̸�"); String na1 = a.next();
//		System.out.print("�л�1 ����"); int na1_lang = a.nextInt();
//		System.out.print("�л�1 ����"); int na1_eng = a.nextInt();
//		System.out.print("�л�1 ����"); int na1_math = a.nextInt();
//		
//		System.out.print("�л�2 �̸�"); String na2 = a.next();
//		System.out.print("�л�2 ����"); int na2_lang = a.nextInt();
//		System.out.print("�л�2 ����"); int na2_eng = a.nextInt();
//		System.out.print("�л�2 ����"); int na2_math = a.nextInt();
//		
//		System.out.println("========== ����ǥ =========");
//		System.out.println("�л���\t����\t����\t����");
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
