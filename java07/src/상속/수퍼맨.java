package 상속;

public class 수퍼맨 extends 맨{
	//멤버변수3개
	//멤버메서드 3개 ---> 4개
	public void 날아다니다() {
		System.out.println("하늘을 날다.");
	}

	@Override
	public String toString() {
		return "수퍼맨 [size=" + size + ", gender=" + gender + ", name=" + name + "]";
	}
	
}
