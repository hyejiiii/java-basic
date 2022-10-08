package 정적static;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Counter {
	static int count;

	public static void main(String[] args) {
		JFrame f = new JFrame("나의 카운터 프로그램");
		f.setSize(300, 300);
		f.getContentPane().setLayout(null);
		
		JLabel j1 = new JLabel("0");
		j1.setForeground(new Color(255, 0, 0));
		j1.setHorizontalAlignment(SwingConstants.CENTER);
		j1.setFont(new Font("굴림", Font.BOLD, 70));
		j1.setBounds(52, 67, 176, 153);
		f.getContentPane().add(j1);
		
		JButton b1 = new JButton("1 더하기");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int count = Integer.parseInt(j1.getText());
				count++;
				j1.setText(String.valueOf(count));
			}
		});
		b1.setBackground(new Color(128, 255, 128));
		b1.setFont(new Font("굴림", Font.BOLD, 10));
		b1.setBounds(12, 10, 82, 23);
		f.getContentPane().add(b1);
		
		JButton b2 = new JButton("0으로 초기화");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int count = Integer.parseInt(j1.getText());
				count = 0;
				j1.setText(String.valueOf(count));
			}
		});
		b2.setBackground(new Color(128, 255, 255));
		b2.setFont(new Font("굴림", Font.BOLD, 10));
		b2.setBounds(99, 10, 95, 23);
		f.getContentPane().add(b2);
		
		JButton b3 = new JButton("1 빼기");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int count = Integer.parseInt(j1.getText());
				count--;
				j1.setText(String.valueOf(count));
				
			}
		});
		b3.setBackground(new Color(128, 255, 128));
		b3.setFont(new Font("굴림", Font.BOLD, 10));
		b3.setBounds(200, 10, 82, 23);
		f.getContentPane().add(b3);
		
		
		
		
		
		
		
		f.setVisible(true);

	}
}
