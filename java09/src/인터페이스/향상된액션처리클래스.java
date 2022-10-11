package 인터페이스;

public class 향상된액션처리클래스 implements MyAction {

	@Override
	public void click() {
		System.out.println("보안이 강화된 상태로 인터넷으로 처리...구현");

	}

	@Override
	public void dbclick() {
		System.out.println("화면에 경고 메시지를 띄운 후, 화면을 닫는 처리...구현");

	}

}
