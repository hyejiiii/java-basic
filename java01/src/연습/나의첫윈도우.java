package 연습;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;

public class 나의첫윈도우 {
	private static JTextField textField;

	public static void main(String[] args) {
		// 1. jframe 부품을 새로 만들어주자
		JFrame f = new JFrame();
		
		// 2. 새로 만든 부품의 크기를 결정
		f.setSize(500, 500);
		
		textField = new JTextField();
		f.getContentPane().add(textField, BorderLayout.SOUTH);
		textField.setColumns(10);
		
		JTextArea textArea = new JTextArea();
		f.getContentPane().add(textArea, BorderLayout.CENTER);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\user\\OneDrive\\바탕 화면\\R.gif"));
		f.getContentPane().add(btnNewButton, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("포챠코");
		lblNewLabel.setFont(new Font("나눔고딕", Font.BOLD, 50));
		f.getContentPane().add(lblNewLabel, BorderLayout.WEST);
		
		// 3. 새로 만든 부품을 "보여주세요" 설정
		f.setVisible(true);
	}

}
