package 순차문;

import java.util.Scanner;

public class 콘솔입력문제2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나의 이름은? ");
		String name = sc.next();
		
		System.out.print("나이 입력 >> ");
		int age = sc.nextInt();
		int age2 = age + 1;
		
		System.out.print("키를 입력 >> ");
		double height = sc.nextDouble();
		
		System.out.print("몸무게를 입력 >> ");
		double weight = sc.nextDouble();
		
		System.out.print("저녁을 먹었는지 입력(true/false) >> ");
		Boolean dinner = sc.nextBoolean();
		
		sc.nextLine();
		System.out.print("올해의 목표는 >> ");
		String goal = sc.nextLine(); //한줄
		
		System.out.println("-----------------");
		System.out.println("나의 이름은 " + name);
		System.out.println("내년 나이는 " + age2);
		System.out.println("나의 내년 키는? " + (height + 10));
		System.out.println("나의 내년 몸무게는? " + (weight-10));
		System.out.println("나는 저녁을 " + dinner + "했습니다.");
		System.out.println("나의 좌우명은 " + goal + "입니다.");
		
	

	}
}
