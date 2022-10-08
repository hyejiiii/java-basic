package 상속활용;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.util.Calendar;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class 스레드그래픽 extends JFrame {
	// 클래스 전체에서 접근해서 사용하려면,
	// 선언을 클래스 아래에 해서 전역변수로 만들어주어라!
	JLabel count, image, day; //전역변수로 만들어줌
	카운터스레드2 count2 = new 카운터스레드2();
	시각스레드2 day2 = new 시각스레드2();
	이미지스레드2 image2 = new 이미지스레드2();
	static 스레드그래픽 f;
	
	public 스레드그래픽() {
		getContentPane().setBackground(Color.GREEN);
		setSize(800,300);
		count = new JLabel("카운터");
		image = new JLabel("");
		day = new JLabel("시각");
		Font font = new Font("나눔고딕", Font.BOLD, 30);
		count.setFont(font);
		day.setFont(font);
		
		add(count, BorderLayout.WEST);
		add(image, BorderLayout.EAST);
		add(day, BorderLayout.SOUTH);
		setVisible(true);
		count2.start();
		day2.start();
		image2.start();
		
	}

	public static void main(String[] args) {
		// main이 static이기 때문에 static 없는 생성자 메서드를 활용하자
		f = new 스레드그래픽();
	}

	public class 시각스레드2 extends Thread {
		@Override
		public void run() {
			for (int i = 0; i < 500; i++) {
				java.util.Date date = new java.util.Date();
				//System.out.println("시각>> " + date);
				day.setText("시각>> " + date);

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

	public class 이미지스레드2 extends Thread {

		@Override // 표시 @ == annotation
		public void run() {
			String[] list = { "1.png", "2.png", "3.png", "4.png", "5.png" };
			for (int i = 0; i < list.length; i++) {
				//System.out.println("이미지>> " + list[i]);
				//image.setText("이미지>> " + list[i]);
				ImageIcon icon = new ImageIcon(list[i]);
				image.setIcon(icon);
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	public class 카운터스레드2 extends Thread {

		@Override // 표시 @ == annotation
		public void run() {
			for (int i = 10; i >= 0; i--) {
				//System.out.println("카운트>> " + i);
				count.setText("카운트 >> " + i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if (i == 0) {
					JOptionPane.showMessageDialog(f, "사용시간이 다 되었습니다. 퇴실 부탁드립니다.");
					image2.stop();
					day2.stop();
					
					// int hour = Calendar.HOUR;
				}
			}
		}
	}

}
