package 조건문;

import java.util.Date;

public class SwitchCase테스트2 {

	public static void main(String[] args) {
		// 빨간 밑줄 클릭하고, f2 ==> fix 도움말
		Date  date = new Date();
		int month = date.getMonth() + 1;
		int day = date.getDay(); // 요일
		// 0이 일요일, 1이 월요일, 6이 토요일
		switch (day) {
		case 0: case 6:
			System.out.println("놀자.");
			break;

		default: //else, 1~5
			System.out.println("자바 공부하러 가자.");
			break;
		}
		
		switch (month) {
		case 9: case 10: case 11:
			System.out.println("가을");
			break;

		default:
			break;
		}
		
	}

}
