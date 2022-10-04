package 클래스사용하기;

import 클래스만들기.계산기;

public class 내가게 {

	public static void main(String[] args) {
		// 자바는 "입력값이 다르면", 메서드 이름 동일해도 된다
		계산기 cal = new 계산기();
		int result = cal.add(200, 100);
		double result2 = cal.add(100, 22.2);
		double result3 = cal.add(11.1, 22.2);
		String result4 = cal.add("ok", 100);
		int result5 = cal.multi(3000, 4);
		cal.div(result5, 4);
		
		// 메서드를 호출하고, 처리값을 main이 받아와서
		// 아래코드 받아온 값을 이용해야 하는 경우, return해야함
		
		System.out.println("더한 값 1은 " + result);
		System.out.println("더한 값 2는 " + result2);
		System.out.println("더한 값 3은 " + result3);
		System.out.println("더한 값 4는 " + result4);
		System.out.println("곱한 값 5는 " + result5);
		
		
	}

}
