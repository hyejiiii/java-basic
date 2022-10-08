package 형변환;

import java.util.ArrayList;

import javax.swing.JButton;

public class 참조형형변환 {

	public static void main(String[] args) {
		// 배열의 단점: 고정된 크기, 같은 타입만 모을 수 있음
		// ArrayList: 가변 크기, 다른 타입들도 넣을 수 있음
		ArrayList list =  new ArrayList();
		list.add("홍길동"); //object <-- string
		// 큰<---작(자동형변환, up casting, 업캐스팅)
		list.add(100);
		list.add(0.2);
		list.add(true);
		list.add(new JButton());
		System.out.println(list.size()); //개수
		
		String name = (String)list.get(0); // 홍길동
		//string(작) <-- object(큰)
		//강제형변환, down casting
		
		//int <-- integer <-- object
		//integer, double, boolean, character
		//기본형과 관련된 처리를 하기 위해서
		//부품으로 크게 만들어놨음
		//기본형+포장 => 포장클래스(wrapper 클래스)
		//기본형과 포장클래스간에는 자동변환이 가능
		//int ---> integer : boxing
		//int <--- integer : unboxing
		//autoboxing, autounboxing
		int age = (int)list.get(1);
		double eye = (double)list.get(2);
		Boolean food = (Boolean)list.get(3);
		JButton b = (JButton)list.get(4);
		

	}

}
