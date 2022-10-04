package 배열응용;

public class String연습문제 {

	public static void main(String[] args) {
		String s = "011-245-1234";
		// String s2 = s.trim(); 공백제거
		String[] s2 = s.split("-");
		if (s2[0].equals("011")) {
			System.out.println("SK");
		} else if(s2[0].equals("019")) {
			System.out.println("LG");
		} else {
			System.out.println("Apple");
		}
		if(s2[1].length() >= 4) {
			System.out.println("최신폰");
		} else {
			System.out.println("올드폰");
		}
		if(s.length()>=10) {
			System.out.println("유효한 전화번호");
		} else {
			System.out.println("유효하지 않은 전화번호");
		}
	}

}
