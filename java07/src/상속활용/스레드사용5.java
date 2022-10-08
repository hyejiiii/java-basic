package 상속활용;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class 스레드사용5 extends JFrame {
	JLabel count, image;
	스레드11 count2 = new 스레드11();
	스레드22 image2 = new 스레드22();
	static 스레드사용5 f;

	public 스레드사용5() {
		setSize(700, 500);
		getContentPane().setBackground(Color.yellow);
		count = new JLabel("카운터");
		image = new JLabel("");
		Font font = new Font("나눔고딕", Font.BOLD, 30);
		count.setFont(font);
		add(count, BorderLayout.NORTH);
		add(image, BorderLayout.CENTER);
		setVisible(true);
		count2.start();
		image2.start();
	}

	public static void main(String[] args) {
		f = new 스레드사용5();

	}

	public class 스레드22 extends Thread {
		@Override
		public void run() {
			String[] list = {"만두.jpg", "초밥.jpg", "파스타.jpg"};
			for (int i = 0; i < list.length; i++) {
				ImageIcon icon = new ImageIcon(list[i]);
				image.setIcon(icon);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
	public class 스레드11 extends Thread {
		@Override
		public void run() {
			for (int i = 20; i >= 0; i--) {
				count.setText("점심시간까지 남은 시간 >> " + i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				if (i == 0) {
					JOptionPane.showMessageDialog(f, "점심 먹으러 가자");
					image2.stop();
				}
			}
		}
	}


}
