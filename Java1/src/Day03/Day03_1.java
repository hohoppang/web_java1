package Day03;

public class Day03_1 {  // c  s
	
	public static void main(String[] args) {  // m s
		
		// ������
		//1. ��������� [ + - * / % ]
			//��1)
			int ����1 = 10; int ����2 = 20;
			System.out.println("���ϱ� : " + ����1+����2); // + ���Ῥ����
			System.out.println("���ϱ� : " + (����1+����2)); // + ���������
			System.out.println("���� : " + (����1-����2));
			System.out.println("���ϱ� : " + (����1*����2));
			System.out.println("������ : " + (����1/����2));
			System.out.println("������ : " + (����1%����2));
			
		//2. �񱳿����� [ >=�̻� <=���� >
			// ��� => true / false
			//��2) 
			System.out.println("�̻� :" + (����1>=����2));
			System.out.println("���� :" + (����1<=����2));
			System.out.println("�ʰ� :" + (����1>����2));
			System.out.println("�̸� :" + (����1<����2));
			System.out.println("���� :" + (����1==����2));
			System.out.println("�ٸ��� :" + (����1!=����2));
			
		//3. ��[����]������ �񱳿����� 2���̻��ϋ� [ and : && or : || not : ! ]
			int ����3 = 30; int ����4 = 40;
			System.out.println("and : " + (����1>=����2 && ����4>=����3));
			System.out.println("or : " + (����1>=����2 || ����4>=����3));
			System.out.println("not : " + !(����1>=����2 || ����4>=����3));
			
		//4. ���Կ����� [ �����ʵ����Ͱ� �������� ������ �ֱ� ]
			// = ���� +=	-=	*=	/=	%=
			����1 = ����1 + 1;
			����1 += 1;
			System.out.println("����1 ���� : " + ����1);
			
		//5. ���������� [ 1�� ���� Ȥ�� 1�� ���� ]
			// ++���� : �������� 	����++ : ��������
			// --���� : ��������	����-- : ��������
			����1 += 1;
			����1++;
			System.out.println("����1 ���� : " + ����1);
			System.out.println("�������� : " + (++����1));
			System.out.println("�������� : " + (����1++));
			System.out.println("Ȯ�� : " + ����1);
			System.out.println();
			System.out.println("�������� : " + (--����1));
			System.out.println("�������� : " + (����1--));
			System.out.println("Ȯ�� : " + ����1);
		
	}  // m e

}  // c  e
