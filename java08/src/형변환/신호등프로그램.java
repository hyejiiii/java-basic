package 형변환;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextField;

public class 신호등프로그램 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.black);
		f.setSize(618, 692);
		f.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton b1 = new JButton("빨간신호");
		JButton b2 = new JButton("노란신호");
		JButton b3 = new JButton("파란신호");
		f.add(b1);
		f.add(b2);
		f.add(b3);
		
		b1.setFont(new Font("굴림", Font.BOLD, 20));
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JLabel img = new JLabel();
				ImageIcon icon = new ImageIcon("빨.jpg");
				img.setIcon(icon);
				f.getContentPane().add(img);
				f.setVisible(true);
			}
		});
		b1.setBackground(new Color(255, 0, 0));
		b1.setBounds(49, 21, 156, 48);
		f.getContentPane().add(b1);
		
		b2.setFont(new Font("굴림", Font.BOLD, 20));
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JLabel img = new JLabel();
				ImageIcon icon = new ImageIcon("노.jpg");
				img.setIcon(icon);
				f.getContentPane().add(img);
				f.setVisible(true);
			}
		});
		b2.setBackground(new Color(255, 255, 0));
		b2.setBounds(217, 21, 156, 48);
		f.getContentPane().add(b2);
		
		b3.setFont(new Font("굴림", Font.BOLD, 20));
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JLabel img = new JLabel();
				ImageIcon icon = new ImageIcon("초.jpg");
				img.setIcon(icon);
				f.getContentPane().add(img);
				f.setVisible(true);
			}
		});
		b3.setBackground(new Color(0, 128, 255));
		b3.setBounds(385, 21, 156, 48);
		f.getContentPane().add(b3);
		
		
		f.setVisible(true);
	}
}