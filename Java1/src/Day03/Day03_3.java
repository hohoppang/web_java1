package Day03;

import java.util.Scanner;


public class Day03_3 {

	public static void main(String[] args) {
		
		// ��ǻ��[0,1] : ����
		// ��� : if[�� ����] , switch [����������]
			// ���� : ����Ǽ� �� ���� �ڵ� ó��
			// if : true, false �� ���� ����
		
		//��1) true�� ����
//		if( 3 > 1) System.out.println("3��ũ��.1");
//		
//		//��2) false �̸� ����x
//		if( 3 > 5) System.out.println("3��ũ��.2");
//		
//		//��3)
//		if( 3 > 5) System.out.println("3��ũ��");
//		else System.out.println("3�� �۴�");
//		
//		//��4)
//		if( 3 > 2 ) {
//			System.out.println("true");
//			System.out.println("3 up");
//		}
//		else {
//			System.out.println("no");
//			System.out.println("2 up");
//		}
//		
//		//��5)  ���� ����
//		if( 3 > 5 ) System.out.println("3 up1");
//		else if( 3 > 4) System.out.println("3 up2");
//		else if (3 > 3) System.out.println("3 up3");
//		else if (3 > 2) System.out.println("3 up4");
//		else System.out.println("no");
//		
//		//��6 �ϳ��� ������ �Է¹޾� 80�� �̻��̸� �հ���� �ƴϸ� Ż��
		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("���� �Է� : "); int ���� = sc.nextInt();
//		if(���� >= 80) System.out.println("�հ�");
//		else System.out.println("Ż��");
//		
//		//��7) �ϳ��� ���� 90 a 80 b 70 c Ż��
//		System.out.print("���� �Է� ::"); int s = sc.nextInt();
//		
//		if(s >= 90) System.out.println("a");
//		else if (s >= 80) System.out.println("b");
//		else if (s >= 70) System.out.println("c");
//		else System.out.println("����");
		
		//����1 2���� ������ �Է¹޾� �� ū�� ���
//		System.out.print("�� �Է� : "); int a = sc.nextInt();
//		System.out.print("�� �Է� : "); int b = sc.nextInt();
//		if (a > b) System.out.println("a" + a);
//		else if (a < b) System.out.println("b" +  b);
//		else System.out.println("same");
//		
//		//����2 3���� ������ �Է¹޾� �� ū�� ���
//		System.out.print("�� �Է� : "); int x = sc.nextInt();
//		System.out.print("�� �Է� : "); int y = sc.nextInt();
//		System.out.print("�� �Է� : "); int z = sc.nextInt();
		
		//����3 4���� ������ �Է¹޾� �� ū�� ��
		System.out.print("x�� �Է� : "); int x = sc.nextInt();
		System.out.print("y�� �Է� : "); int y = sc.nextInt();
		System.out.print("z�� �Է� : "); int z = sc.nextInt();
		System.out.print("a�� �Է� : "); int a = sc.nextInt();
		int c = x;
		if (c < y) c = y;
		if (c < z) c = z;
		if (c < a) c = a;
		System.out.println("�밡����" + c);
				
//		if(x > y && x > z && x > a ) System.out.println("x" + x);
//		else if (y > x && y > z && y > a) System.out.println("y");
//		else if (z > x && z > y && z > a) System.out.println("z");
//		else System.out.println("a");
//		
		
		
		
		
		
		
		
	}
}
