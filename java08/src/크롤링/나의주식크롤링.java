package 크롤링;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 나의주식크롤링 {
	private static JTextField t1;
	static JTextField textField;
	static JTextArea textArea;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(227, 247, 253));
		f.setSize(350, 600);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CODE:");
		lblNewLabel.setForeground(new Color(117, 157, 174));
		lblNewLabel.setFont(new Font("나눔고딕 ExtraBold", Font.BOLD, 20));
		lblNewLabel.setBounds(138, 194, 102, 42);
		f.getContentPane().add(lblNewLabel);
		
		t1 = new JTextField();
		t1.setBackground(new Color(255, 255, 255));
		t1.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 20));
		t1.setBounds(57, 234, 229, 27);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		textArea = new JTextArea();
		textArea.setFont(new Font("나눔고딕 ExtraBold", Font.BOLD, 25));
		textArea.setBounds(44, 320, 256, 216);
		f.getContentPane().add(textArea);
		
		JButton b1 = new JButton("카카오");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				크롤링연습4 크롤링 = new 크롤링연습4();
				String result = 크롤링.naver("035720");
				textArea.setText(result);
			}
		});
		b1.setForeground(new Color(102, 51, 51));
		b1.setBackground(new Color(255, 255, 94));
		b1.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 20));
		b1.setBounds(57, 10, 229, 42);
		f.getContentPane().add(b1);
		
		JButton b2 = new JButton("삼성전자");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//코드를 주면서, 크롤링해달라고 하자
				//크롤링연습4의 naver(code)호출!
				크롤링연습4 크롤링 = new 크롤링연습4();
				String result = 크롤링.naver("005930");
				textArea.setText(result);
			}
		});
		b2.setForeground(new Color(255, 255, 255));
		b2.setBackground(new Color(0, 128, 255));
		b2.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 20));
		b2.setBounds(57, 74, 229, 42);
		f.getContentPane().add(b2);
		
		JButton b3 = new JButton("네이버");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				크롤링연습4 크롤링 = new 크롤링연습4();
				String result = 크롤링.naver("035420");
				textArea.setText(result);
			}
		});
		b3.setForeground(new Color(242, 242, 242));
		b3.setBackground(new Color(128, 255, 0));
		b3.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 20));
		b3.setBounds(57, 142, 229, 42);
		f.getContentPane().add(b3);
		
		JButton b4 = new JButton("크롤링 시작!");
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 입력한 code를 가지고 와라!
				String code = t1.getText();
				크롤링연습4 크롤링 = new 크롤링연습4();
				크롤링.naver(code);
				String result = 크롤링.naver(code);
				textArea.setText(result);
			}
		});
		b4.setBackground(new Color(136, 226, 253));
		b4.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 19));
		b4.setBounds(102, 271, 138, 39);
		f.getContentPane().add(b4);
		
		
		
		
		
		
		
		
		f.setVisible(true);

	}
}
