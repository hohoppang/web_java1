package Day02;

import java.util.Scanner;
	// import : �ٸ����Ͽ� �ִ� ���̺귯��[Ŭ����] ��������
	// import ��Ű����.Ŭ����

public class Day02_2 {

	//�Է¹ޱ�
	public static void main(String[] args) {
		
		//1. Scanner Ŭ���� : �Է°��� Ŭ����
		Scanner �Է°�ü = new Scanner(System.in);
			//1. Scanner : �Է°��õ� �޼ҵ� ����
				//2. ��ü�̸� : ��ü�� �̸�[ �����ǰ� ]
					// 3. new : ��ü�� �޸� �Ҵ� ������
						//4. Scanner() : Ŭ������ ������
		System.out.println("���� �Է� :" );
		//1. ���� ����
		int �Է����� ; 
		// 2. ������ �Է°� ����
		�Է����� = �Է°�ü.nextInt();
		// 3. ���� ���
		System.out.println("�����Է��� ���� : " + �Է�����);
		
		System.out.println("���ڿ� �Է� : ");
		String ���ڿ� = �Է°�ü.next();
		System.out.println("���� �Է��� ���ڿ��� :" + ���ڿ�);
		�Է°�ü.nextLine();
		System.out.println(" �������� �Է� : ");
		String ���ڿ�2 = �Է°�ü.nextLine();
		System.out.println("���� �Է��� ���ڿ��� :" + ���ڿ�2);
		
		
	}
}
