package Day04;

import java.util.Scanner;

public class day04_3 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("가위바위보!!");
		System.out.print("사람1 : "); String a = sc.next();
		System.out.print("사람2 : "); String b = sc.next();
		
		if(a.equals("가위") && b.equals("보")) System.out.println("사람1 승");
		if(a.equals("바위") && b.equals("가위")) System.out.println("사람1 승");
		if(a.equals("보") && b.equals("바위")) System.out.println("사람1 승");
		
		
		if(b.equals("가위") && a.equals("보")) System.out.println("사람2 승");
		if(b.equals("바위") && a.equals("가위")) System.out.println("사람2 승");
		if(b.equals("보") && a.equals("바위")) System.out.println("사람2 승");
		
		if(a.equals(b)) System.out.println("비김");
	}

}
