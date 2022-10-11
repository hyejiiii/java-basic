package 인터페이스;

public class 액션처리클래스 implements MyAction {

	@Override
	public void click() {
		System.out.println("클릭하면 인터넷으로 연결");

	}

	@Override
	public void dbclick() {
		System.out.println("더블클릭하면 화면을 닫음");

	}

}
