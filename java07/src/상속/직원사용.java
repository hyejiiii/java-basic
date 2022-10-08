package 상속;

public class 직원사용 {

	public static void main(String[] args) {
		매니저 m1 = new 매니저();
		m1.name = "나매니저";
		m1.address = "부산광역시 남구";
		m1.salary = 3000000;
		m1.rrn = 1234;
		m1.bonus = 500000;
		System.out.println(m1);
		m1.test();
		

	}

}
