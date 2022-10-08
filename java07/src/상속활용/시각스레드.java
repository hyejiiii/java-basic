package 상속활용;

import java.util.Date;

public class 시각스레드 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 500; i++) {
			java.util.Date date = new java.util.Date();
			System.out.println("시각>> " + date);
			
			// cpu 1초 stop
			// 자바에서 cpu를 연결!!
			// 자바에서 외부자원을 연결할 때는 위험한 상황
			// 위험한 발생(에러가 발생해서 프로그램이 멈추는 상황)
			// ==> 대응책 코딩해주어야 함
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
