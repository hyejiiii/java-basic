package 연습;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Calculator {
	private static JTextField t1;
	private static JTextField t2;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		
		
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("숫자 1");
		lblNewLabel.setFont(new Font("나눔고딕", Font.BOLD, 25));
		lblNewLabel.setBounds(44, 118, 85, 39);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("숫자 2");
		lblNewLabel_1.setFont(new Font("나눔고딕", Font.BOLD, 25));
		lblNewLabel_1.setBounds(44, 222, 85, 39);
		f.getContentPane().add(lblNewLabel_1);
		
		t1 = new JTextField();
		t1.setBackground(new Color(255, 191, 191));
		t1.setBounds(173, 123, 228, 39);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setBackground(new Color(255, 193, 193));
		t2.setColumns(10);
		t2.setBounds(173, 222, 228, 39);
		f.getContentPane().add(t2);
		
		JButton plus = new JButton("+");
		plus.addActionListener(new ActionListener() {
			// 버튼을 클릭했을 때 actionPerformed()함수를 사용하도록 규칙이 설정되어 있음
			public void actionPerformed(ActionEvent e) {
				// plus 버튼을 눌렀을 때 처리하고 싶은 내용
				JOptionPane.showMessageDialog(f, "플러스 버튼을 누르셨군요.");
				// 1. 두 수를 가지고 오세요.(String)
				String n1 = t1.getText();
				String n2 = t2.getText();				
				
				// 2. 숫자로 변경해서 정수변수에 넣어주세요.
				int n11 = Integer.parseInt(n1);
				int n22 = Integer.parseInt(n2);
						
				// 3. 결과 출력
				//JOptionPane.showMessageDialog(f, n11 + n22);
				f.setTitle("더한 결과는 " + (n11+n22));
				t1.setText("");
				t2.setText("");
				t1.setBackground(Color.blue);
				t1.setForeground(Color.red);
			}
		});
		plus.setForeground(new Color(255, 255, 255));
		plus.setBackground(new Color(255, 217, 217));
		plus.setFont(new Font("굴림", Font.BOLD, 25));
		plus.setBounds(32, 317, 85, 48);
		f.getContentPane().add(plus);
		
		JButton icon = new JButton("");
		icon.setBackground(new Color(255, 255, 255));
		icon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		icon.setIcon(new ImageIcon("C:\\Users\\user\\OneDrive\\바탕 화면\\6422026_1.jpg"));
		icon.setBounds(0, 0, 486, 88);
		f.getContentPane().add(icon);
		
		JButton minus = new JButton("-");
		minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "마이너스 버튼을 누르셨군요.");
				String n3 = t1.getText();
				String n4 = t2.getText();				
				
				int n33 = Integer.parseInt(n3);
				int n44 = Integer.parseInt(n4);
						
				//JOptionPane.showMessageDialog(f, n33 - n44);
				f.setTitle("뺀 결과는 " + (n33-n44));
				t1.setText("");
				t2.setText("");
			}
		});
		minus.setForeground(Color.WHITE);
		minus.setFont(new Font("굴림", Font.BOLD, 25));
		minus.setBackground(new Color(255, 217, 217));
		minus.setBounds(142, 317, 85, 48);
		f.getContentPane().add(minus);
		
		JButton mul = new JButton("*");
		mul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "곱하기 버튼을 누르셨군요.");
				String n5 = t1.getText();
				String n6 = t2.getText();				
				
				int n55 = Integer.parseInt(n5);
				int n66 = Integer.parseInt(n6);
						
				//JOptionPane.showMessageDialog(f, n55 * n66);
				f.setTitle("곱한 결과는 " + (n55+n66));
				t1.setText("");
				t2.setText("");
			}
		});
		mul.setForeground(Color.WHITE);
		mul.setFont(new Font("굴림", Font.BOLD, 25));
		mul.setBackground(new Color(255, 217, 217));
		mul.setBounds(259, 317, 85, 48);
		f.getContentPane().add(mul);
		
		JButton div = new JButton("/");
		div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "나누기 버튼을 누르셨군요.");
				String n7 = t1.getText();
				String n8 = t2.getText();				
				
				int n77 = Integer.parseInt(n7);
				int n88 = Integer.parseInt(n8);
						
				//JOptionPane.showMessageDialog(f, n77 / n88);
				f.setTitle("나눈 결과는 " + (n77+n88));
				t1.setText("");
				t2.setText("");
			}
		});
		div.setForeground(Color.WHITE);
		div.setFont(new Font("굴림", Font.BOLD, 25));
		div.setBackground(new Color(255, 217, 217));
		div.setBounds(368, 317, 85, 48);
		f.getContentPane().add(div);
		
		
		f.setVisible(true);

	}

}
