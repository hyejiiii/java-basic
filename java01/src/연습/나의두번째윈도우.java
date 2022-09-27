package 연습;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class 나의두번째윈도우 {
	private static JTextField textField;
	private static JTextField textField_1;
	private static JTextField textField_2;

	public static void main(String[] args) {
        JFrame f = new JFrame();
		
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("이름");
		lblNewLabel.setFont(new Font("나눔고딕", Font.BOLD, 20));
		lblNewLabel.setBounds(12, 38, 69, 38);
		f.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(103, 38, 333, 32);
		f.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("전화번호");
		lblNewLabel_1.setFont(new Font("나눔고딕", Font.BOLD, 20));
		lblNewLabel_1.setBounds(12, 96, 77, 46);
		f.getContentPane().add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(103, 107, 333, 32);
		f.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("주소");
		lblNewLabel_2.setFont(new Font("나눔고딕", Font.BOLD, 20));
		lblNewLabel_2.setBounds(12, 172, 69, 32);
		f.getContentPane().add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(103, 176, 333, 32);
		f.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("확인");
		btnNewButton.setFont(new Font("나눔고딕", Font.BOLD, 20));
		btnNewButton.setBounds(52, 307, 148, 56);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("취소");
		btnNewButton_1.setBounds(288, 310, 148, 56);
		f.getContentPane().add(btnNewButton_1);
		
		f.setVisible(true);


	}
}
