package 상속활용;

public class 스레드사용3 {

	public static void main(String[] args) {
		// 초, 1000밀리초
		배열스레드 t1 = new 배열스레드();
		시각스레드 t2 = new 시각스레드();
		카운터스레드 t3 = new 카운터스레드();
		
		// CPU에 동시에 처리되도록 등록!
		t1.start();
		t2.start();
		t3.start();

	}

}
