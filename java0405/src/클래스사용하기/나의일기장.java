package 클래스사용하기;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 나의일기장 {
	private static JTextField t1;
	private static JTextField t2;

	public static void main(String[] args) {
		
		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(221, 221, 255));
		f.setSize(550, 750);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\user\\OneDrive\\바탕 화면\\diary.png"));
		lblNewLabel.setBounds(0, 0, 536, 299);
		f.getContentPane().add(lblNewLabel);
		
		JLabel id = new JLabel("아이디:");
		id.setFont(new Font("굴림", Font.BOLD, 20));
		id.setBounds(100, 330, 94, 38);
		f.getContentPane().add(id);
		
		JLabel pw = new JLabel("비밀번호:");
		pw.setFont(new Font("굴림", Font.BOLD, 20));
		pw.setHorizontalAlignment(SwingConstants.LEFT);
		pw.setBounds(100, 399, 94, 38);
		f.getContentPane().add(pw);
		
		t1 = new JTextField();
		t1.setBackground(new Color(255, 213, 234));
		t1.setBounds(206, 336, 205, 32);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setBackground(new Color(201, 201, 228));
		t2.setColumns(10);
		t2.setBounds(206, 405, 205, 32);
		f.getContentPane().add(t2);
		
		JButton del = new JButton("");
		del.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//t1, t2 글자 지워지는 것처럼 공백을 집어넣으세요.
				t1.setText("");
				t2.setText("");
			}
		});
		del.setIcon(new ImageIcon("C:\\Users\\user\\OneDrive\\바탕 화면\\del.jpg"));
		del.setBounds(327, 542, 197, 99);
		f.getContentPane().add(del);
		
		JButton login = new JButton("");
		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = t1.getText(); //id
				String s2 = t2.getText(); //pw
				
				//id = "root" pw = "1234" 이면 일기쓰는창을 띄우고
				//아니면, JOptionPane으로 "입력값이 달라서 로그인실패입니다."
				//일기쓰기화면창을 띄워라
				if(s1.equals("root") && s2.equals("1234")) {
					일기쓰는창 diary = new 일기쓰는창();
					diary.open();
				} else {
					JOptionPane.showMessageDialog(f, "입력값이 달라서 로그인 실패입니다.");
				}
			}
		});
		login.setIcon(new ImageIcon("C:\\Users\\user\\OneDrive\\바탕 화면\\login.jpg"));
		login.setBounds(12, 542, 314, 99);
		f.getContentPane().add(login);
		
		
		
		
		f.setVisible(true);
		

	}
}
