package 조건문;

import java.util.Scanner;

public class 조건문연습문제 {

	public static void main(String[] args) {

		String pw = "pass";
		if (pw.equals("pass")) {
			System.out.println("들어오세요");
		} else {
			System.out.println("나가세요.");
		}

	    String food = "회";
		
		switch (food) {
		case "짜장면":
			System.out.println("중국집으로 가요.");
			break;
		case "라면":
			System.out.println("분식집으로 가요.");
			break;
		case "회":
			System.out.println("횟집으로 가요.");
			break;
		default:
			System.out.println("그냥 안먹어요.");
			break;
		}

	}

}
