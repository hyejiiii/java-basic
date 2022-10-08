package 컬렉션;

import java.util.HashMap;

public class HashMap확인문제 {

	public static void main(String[] args) {
		HashMap 고객 = new HashMap();
		고객.put(100, "김데이");
		고객.put(200, "김사전");
		고객.put(300, "김구조");
		고객.put(400, "김자료");
		System.out.println(고객);
		고객.remove(200);
		고객.replace(300, "김충성");
		System.out.println(고객);
		

	}

}
