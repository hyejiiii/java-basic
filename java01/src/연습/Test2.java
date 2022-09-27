package 연습;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Test2 {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;
	private static JTextField t4;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(191, 255, 191));
		
		
		f.setSize(500, 600);
		f.getContentPane().setLayout(null);
		
		JLabel food = new JLabel("먹고 싶은 음식");
		food.setHorizontalAlignment(SwingConstants.RIGHT);
		food.setFont(new Font("나눔고딕", Font.BOLD, 20));
		food.setBounds(30, 29, 134, 30);
		f.getContentPane().add(food);
		
		t1 = new JTextField();
		t1.setBackground(new Color(255, 255, 189));
		t1.setFont(new Font("나눔고딕", Font.PLAIN, 20));
		t1.setBounds(176, 28, 240, 37);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		JButton btnNewButton = new JButton("어디로 갈까?");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = t1.getText();
				if (s1.equals("아메리카노") || s1.equals("아이스 아메리카노") || s1.equals("밀크티")) {
					JOptionPane.showMessageDialog(f, "카페를 가세요.");
				} else {
					JOptionPane.showMessageDialog(f, "물 마시세요.");
				}
			}
		});
		btnNewButton.setFont(new Font("나눔고딕", Font.BOLD, 20));
		btnNewButton.setBounds(57, 85, 363, 37);
		f.getContentPane().add(btnNewButton);
		
		JLabel age = new JLabel("당신의 나이는");
		age.setHorizontalAlignment(SwingConstants.RIGHT);
		age.setFont(new Font("나눔고딕", Font.BOLD, 20));
		age.setBounds(30, 143, 134, 30);
		f.getContentPane().add(age);
		
		t2 = new JTextField();
		t2.setFont(new Font("나눔고딕", Font.PLAIN, 20));
		t2.setColumns(10);
		t2.setBackground(new Color(184, 245, 254));
		t2.setBounds(176, 140, 240, 37);
		f.getContentPane().add(t2);
		
		JButton btnNewButton2 = new JButton("나의 내년 나이는?");
		btnNewButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n1 = t2.getText();
				int n11 = Integer.parseInt(n1);
				f.setTitle("내년 나이는 " + (n11 + 1));
			}
		});
		btnNewButton2.setFont(new Font("나눔고딕", Font.BOLD, 20));
		btnNewButton2.setBounds(57, 195, 363, 37);
		f.getContentPane().add(btnNewButton2);
		
		JLabel kor = new JLabel("국어 점수");
		kor.setHorizontalAlignment(SwingConstants.RIGHT);
		kor.setFont(new Font("나눔고딕", Font.BOLD, 20));
		kor.setBounds(30, 260, 134, 30);
		f.getContentPane().add(kor);
		
		t3 = new JTextField();
		t3.setFont(new Font("나눔고딕", Font.PLAIN, 20));
		t3.setColumns(10);
		t3.setBackground(new Color(204, 204, 255));
		t3.setBounds(176, 260, 240, 37);
		f.getContentPane().add(t3);
		
		JLabel math = new JLabel("수학 점수");
		math.setHorizontalAlignment(SwingConstants.RIGHT);
		math.setFont(new Font("나눔고딕", Font.BOLD, 20));
		math.setBounds(30, 325, 134, 30);
		f.getContentPane().add(math);
		
		t4 = new JTextField();
		t4.setFont(new Font("나눔고딕", Font.PLAIN, 20));
		t4.setColumns(10);
		t4.setBackground(new Color(204, 204, 255));
		t4.setBounds(176, 322, 240, 37);
		f.getContentPane().add(t4);
		
		JButton btnNewButton3 = new JButton("두 점수의 평균은?");
		btnNewButton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n2 = t3.getText();
				String n3 = t4.getText();	
				
				int n22 = Integer.parseInt(n2);
				int n33 = Integer.parseInt(n3);
				int add = n22 + n33;
				double av = add/2.0;
				f.setTitle("두 과목의 점수 평균은 " + av);
			}
		});
		btnNewButton3.setFont(new Font("나눔고딕", Font.BOLD, 20));
		btnNewButton3.setBounds(57, 389, 363, 37);
		f.getContentPane().add(btnNewButton3);
		
		
		
		f.setVisible(true);

	}

}
