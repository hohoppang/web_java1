package Day03;

import java.util.Scanner;

public class Day03_2 {
	
	public static void main(String[] args) {
		
		// 0. �Է°�ü ����
		Scanner a = new Scanner(System.in);
		
		//����1 : 
			/*
				 * 		*�޿� ���� 
				 * [ ���� ] �Է¹ޱ� : �⺻�� , ���� 
				 * [ ��� ] �Ǽ��ɾ� = �⺻�� + ���� - ����[ �⺻��10% ]
				 * 
				 */		
		//1. ������ �Է°� ����
//		System.out.print("�⺻�� �Է� : "); int no = a.nextInt();
//		System.out.print("���� �Է� : "); int i = a.nextInt();
//		//2. ���� ���
//		int �Ǽ��ɾ� = no + i - (int)(no*0.1);
//		System.out.println(" �� ���ɾ� : " + �Ǽ��ɾ�);
		
		
//		����5 :
//			 * 		* ���� ���� ����
//			 * 	[����] �Է¹ޱ� : �ݾ� 
//			 * 	[���] �ݾ׿� �ش��ϴ� ����� ����
//			 * 	[��� ��] : 356789 =>
//			 * 			�ʸ��� : 3��
//			 * 			���� : 5��
//			 * 			õ�� : 6��
//			 * 			��� : 7�� 
		
//		System.out.print("�ݾ� �Է� : "); int �ݾ� = a.nextInt();
//		// 1. �ʸ����� ����
//		System.out.println("�ʸ����� : " + (�ݾ�/100000));
//		// 1. �ݾ׿��� �ʸ����� ����
//			�ݾ� -= (�ݾ�/100000)*100000;
//		// 2. ������ ����
//		System.out.println("������ : " + (�ݾ�/10000));
//			�ݾ� -= (�ݾ�/10000) * 10000;
//		// 3. õ�� ����
//		System.out.println("õ���� : " + (�ݾ�/1000));
//			�ݾ� -= (�ݾ�/1000) * 1000;
//		// 4. ��� ����
//		System.out.println("��� : " + (�ݾ�/100));
//			�ݾ� -= (�ݾ�/100) * 100;
		
		
		// ���� 3 �ϳ��� ������ �Է¹޾� 7�� ������� ���
//		System.out.print("7��� �Է� : "); int x = a.nextInt();
//		System.out.println(x%7 == 0);
//									
//		// ���� 4 �ϳ��� ������ �Է¹޾� Ȧ�� ���� Ȯ��
//		System.out.print("Ȧ�� �Է� : "); int y = a.nextInt(); 	
//		System.out.println(y%2 == 1);	
//			
//		// ���� 5 �ϳ��� ������ �Է¹޾� 7�� ����̸鼭 ¦�� ���� Ȯ��
//		System.out.print("7, ¦�� �Է� : "); int z = a.nextInt(); 	
//		System.out.println((z%2 == 0) && (z%7 == 0) );	
//			
//		// ���� 6 �ΰ��� ������ �Է¹޾� �� ū�� ���
//		System.out.print("ū�� �Է� : "); int q = a.nextInt();
//		System.out.print("ū�� �Է� : "); int w = a.nextInt();
//		System.out.println(q > w);
		
//		����7 : �������� �Է¹޾� �� ���� ����ϱ� 
//		// �� ���� ���� => ������ * ������ * ������[3.14]
//		System.out.print("������ �Է� : "); float half = a.nextFloat();
//		System.out.println("���� : " + (half * half * 3.14));
		
//	����8 : �� �Ǽ��� �Է¹޾� �սǼ��� ���� ���� ���� ��% ���� ����ϱ�
//		// ��) 54.5   84.3 �̸�    64.285714%
		System.out.print("�� �Է� : "); float �� = a.nextFloat();
		System.out.print("�� �Է� : "); float �� = a.nextFloat();
		System.out.println("% : " + (�� / ��)*100);
		
//	����9 : ��ٸ��� ���� ���ϱ�[������ �غ� ���̸� �Է¹޾� ����ϱ�]
//		//��ٸ��� ���� = > (���� * �غ�) * ���� / 2
//		System.out.print("�� �Է� : "); float �� = a.nextFloat();
//		System.out.print("�Ʒ� �Է� : "); float �Ʒ� = a.nextFloat();
//		System.out.print("���� �Է� : "); float ���� = a.nextFloat();
//		System.out.println(��*�Ʒ�*����/2);
//		
//	����10: Ű�� ������ �Է¹޾� ǥ��ü�� ����ϱ�
//		//ǥ��ü�� ���� = > (Ű - 100) * 0.9
		System.out.print("Ű �Է� : "); float Ű = a.nextFloat();
		double ǥ��ü�� = (Ű - 100) * 0.9;
		System.out.println("ǥ��ü�� : " + ǥ��ü��);
		
//	����11: Ű�� �����Ը� �Է¹޾� BMI ����ϱ�
//		//BMI ���� = > ������ / ((Ű / 100) * (Ű / 100))
		System.out.print("Ű �Է� : "); float Ű2 = a.nextFloat();
		System.out.print("������ �Է� : "); float �� = a.nextFloat();
		
		
//	����12: inch �� �Է¹޾� cm �� ��ȯ�ϱ�
//	����13:  �߰����, �⸻���, �����򰡸� �Է¹޾� �ݿ������� ����ϱ�
//		//�Ҽ� ��° �ڸ� ���� ���� ����ϱ�
//		//�߰���� �ݿ����� => 30 %
//		//�⸻��� �ݿ����� => 30 %
//		//������ �ݿ����� => 40 %
//	����14 :  ���� ���� ���� �ϰ� x�� y�� �����ϱ�
//	 	//int x = 10;
//		//int y = x-- + 5 + --x;
//		//printf(" x�� �� : %d , y�ǰ� :  %d ", x, y)
		
		
		
		
		
		
		
		
		
	}

}
