package 생성자;

public class Mask {
	// 멤버변수(역할), 전역변수(범위), 인스턴스변수(객체생성후실제)
	String color;
	int price;
	int count;
	// 멤버변수는 전역변수, 전역변수는 자동초기화 된다
	// 객체생성후, 멤버변수값을 나중에 넣어도 상관없는 경우
	// 생성자 만들어주지 않아도 된다
	
	// 객체생성시, 멤버변수값을 바로 넣는 경우
	// 넣을 데이터를 파라메터로 해서 생성자를 반드시 만들어준다
	public Mask(String color, int price, int count) {
		super();
		this.color = color;
		this.price = price;
		this.count = count;
	}

	@Override
	public String toString() {
		return "Mask [color=" + color + ", price=" + price + ", count=" + count + "]";
	}

	// 생성자 하나도 없는 경우
	// 자동으로 입력값없는 생성자를 만들어준다
	// 묵시적으로 생성자가 만들어짐
	// 기본생성자(default constructor)
	
	
}
