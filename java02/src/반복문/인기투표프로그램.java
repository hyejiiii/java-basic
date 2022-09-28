package 반복문;

import java.util.Scanner;

public class 인기투표프로그램 {

	public static void main(String[] args) {
		int iu = 0;
		int you = 0;
		int bts = 0;
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("입력 (1) 아이유, (2) 유재석, (3) 방탄 >> ");
			int choice = sc.nextInt();
			if (choice == 1) {
				int count1 = iu++;
			} else if (choice == 2) {
				int count2 = you++;
			} else if (choice == 3) {
				int count3 = bts++;
			} else {
				System.out.println("없는 번호입니다.");
			} 
			System.out.print("그만 둘까요? 종료(1) 계속(2)");
			int exit = sc.nextInt();
			if (exit == 1) {
				System.out.println("종료합니다.");
				System.out.println("아이유 득표 수는 " + iu);
				System.out.println("유재석 득표 수는 " + you);
				System.out.println("방탄 득표 수는 " + bts);
				System.exit(0);
			} else {
				System.out.println("계속 진행합니다.");
			}
		}

	}

}
