package Day04;

import java.util.Scanner;

public class day04_3 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("����������!!");
		System.out.print("���1 : "); String a = sc.next();
		System.out.print("���2 : "); String b = sc.next();
		
		if(a.equals("����") && b.equals("��")) System.out.println("���1 ��");
		if(a.equals("����") && b.equals("����")) System.out.println("���1 ��");
		if(a.equals("��") && b.equals("����")) System.out.println("���1 ��");
		
		
		if(b.equals("����") && a.equals("��")) System.out.println("���2 ��");
		if(b.equals("����") && a.equals("����")) System.out.println("���2 ��");
		if(b.equals("��") && a.equals("����")) System.out.println("���2 ��");
		
		if(a.equals(b)) System.out.println("���");
	}

}
