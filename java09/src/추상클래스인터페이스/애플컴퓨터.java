package 추상클래스인터페이스;

public class 애플컴퓨터 implements 컴퓨터 {

	@Override
	public void 그래픽카드를넣다() {
		System.out.println("RTX 3090 그래픽카드를 넣다.");

	}

	@Override
	public void 전원버튼을넣다() {
		System.out.println("동그란 전원버튼을 넣다.");
	}

	@Override
	public void 본체를만들다() {
		System.out.println("검정색 본체를 만들다.");
	}

}
