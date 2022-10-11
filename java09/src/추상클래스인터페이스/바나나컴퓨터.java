package 추상클래스인터페이스;

public class 바나나컴퓨터 implements 컴퓨터 {

	@Override
	public void 그래픽카드를넣다() {
		System.out.println("RTX 3080 그래픽 카드를 넣다.");
	}

	@Override
	public void 전원버튼을넣다() {
		System.out.println("네모난 전원 버튼을 넣다.");
	}

	@Override
	public void 본체를만들다() {
		System.out.println("투명한 본체를 만들다.");
	}

}
