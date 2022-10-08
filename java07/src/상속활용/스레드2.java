package 상속활용;

public class 스레드2 extends Thread{
	@Override
	public void run() {
		String[] list = {"만두", "초밥", "파스타"};
		for (int i = 0; i < list.length; i++) {
			System.out.println("이미지>> " + list[i]);
			try {
				Thread.sleep(9000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
