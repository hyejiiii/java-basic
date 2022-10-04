package 배열기본;

import java.util.Scanner;

public class 배열정리문제2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];
		num[0] = 10;
		num[1] = 20;
		num[2] = 30;
		num[3] = 40;
		num[4] = 50;
		System.out.println(num[0] + num[2]);
		
		String[] s = new String[3];
		s[0] = "자바";
		s[1] = "스프링";
		s[2] = "JSP";
		System.out.println(s[0] + "보다는 " + s[1]);
		
	
	}

}
