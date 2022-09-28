package 반복문;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class 숫자비교반복 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count1 = 0;
		int count2 = 0;
		
		while (true) {
			System.out.print("숫자1: ");
			int n1 = sc.nextInt();
			
			System.out.print("숫자2: ");
			int n2 = sc.nextInt();
			
			
			if (n1 > n2) {
				int count11 = count1 ++;
				System.out.println("앞 숫자가 더 큽니다.");
			} else if (n2 == n1) {
				System.out.println("숫자가 동일함.");
			} else {
				int count22 = count2 ++;
				System.out.println("뒷 숫자가 더 큽니다.");
			}
			System.out.print("그만 둘까요? 종료(x) 계속(o)");
			String exit = sc.next();
			char exit2 = exit.charAt(0);
			 if (exit2 == 'x') {
				System.out.println("종료합니다.");
				System.out.println("앞 숫자가 더 큰 횟수는 " + count1);
				System.out.println("뒷 숫자가 더 큰 횟수는 " + count2);
				System.exit(0);
			} else {
				System.out.println("계속 진행합니다.");
			}
		}

	}

}
