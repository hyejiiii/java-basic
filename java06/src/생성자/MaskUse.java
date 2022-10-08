package 생성자;

public class MaskUse {

	public static void main(String[] args) {
//		Mask m = new Mask();
//		m.color = "흰색";
//		m.count = 1;
//		m.price = 1000;
		
		Mask m1 = new Mask("검정색", 2500, 2);
		System.out.println(m1.color);
		System.out.println(m1.price);
		System.out.println(m1.count);
		System.out.println(m1);

	}
	// 계좌처럼 파라메터없이 객체생성하고 싶고,
	//        파라메터있는 객체생성하고 싶은 경우
	// 기본생성자를 명시적으로 정의해주어야 한다

}
