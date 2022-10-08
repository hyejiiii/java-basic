package 생성자;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 음식주문프로그램 {
	static int count;
	static final int PRICE = 5000;
	static int 짬뽕count;
	static int 우동count;
	static int 짜장면count;
	
	
	private static JTextField t1;
	
	public static void main(String[] args) {
		JFrame f = new JFrame("음식점 주문 화면");
		f.getContentPane().setBackground(new Color(225, 245, 255));
		f.setSize(800,500);
		f.getContentPane().setLayout(null);
		f.setTitle("짬뽕: " + 짬뽕count + "개, 우동: " + 우동count + ", 짜장면: " + 짜장면count + "개");
		
		JLabel lblNewLabel = new JLabel("개수");
		lblNewLabel.setFont(new Font("마루 부리 굵은", Font.BOLD, 20));
		lblNewLabel.setBounds(522, 35, 70, 32);
		f.getContentPane().add(lblNewLabel);
		
		t1 = new JTextField();
		t1.setBackground(new Color(231, 231, 231));
		t1.setFont(new Font("마루 부리 가는", Font.PLAIN, 20));
		t1.setBounds(582, 35, 171, 29);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel center = new JLabel("");
		// 라벨 이미지를 변경하고 싶으면, 이미지 부품을 만들고, 라벨에 아이콘을 셋팅
		ImageIcon img = new ImageIcon("짜장면.jpg");
		center.setIcon(img); //주소
		center.setBounds(100, 98, 581, 291);
		f.getContentPane().add(center);
		
		JLabel result = new JLabel("결제금액");
		result.setFont(new Font("마루 부리 굵은", Font.BOLD, 30));
		result.setBounds(120, 400, 542, 53);
		f.getContentPane().add(result);
		
		JButton btnNewButton = new JButton("짬뽕");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//주문량 현재 카운트에 하나 플러스
				count++;
				짬뽕count++;
				//현재 주문량 표시
				t1.setText(count + "개");
				//센터라벨에 있는 이미지 변경
				//이미지 아이콘 부품을 만들어서 center라벨에 셋팅
				ImageIcon icon = new ImageIcon("짬뽕.jpg");
				center.setIcon(icon);
				//result라벨(결제금액) 변경
				result.setText("결제금액: " + count * PRICE + "원");
			}
		});
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("마루 부리 굵은", Font.PLAIN, 25));
		btnNewButton.setBackground(new Color(255, 104, 104));
		btnNewButton.setBounds(70, 30, 111, 47);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("우동");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++;
				우동count++;
				t1.setText(count + "개");
				//센터라벨에 있는 이미지 변경
				ImageIcon icon = new ImageIcon("우동.jpg");
				center.setIcon(icon);
				result.setText("결제금액: " + count * PRICE + "원");
			}
		});
		btnNewButton_1.setBackground(new Color(208, 208, 232));
		btnNewButton_1.setFont(new Font("마루 부리 굵은", Font.BOLD, 25));
		btnNewButton_1.setBounds(193, 30, 111, 47);
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("짜장");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++;
				짜장면count++;
				t1.setText(count + "개");
				//센터라벨에 있는 이미지 변경
				ImageIcon icon = new ImageIcon("짜장면.jpg");
				center.setIcon(icon);
				result.setText("결제금액: " + count * PRICE + "원");
			}
		});
		btnNewButton_2.setBackground(new Color(153, 77, 77));
		btnNewButton_2.setFont(new Font("마루 부리 굵은", Font.BOLD, 25));
		btnNewButton_2.setBounds(316, 30, 111, 47);
		f.getContentPane().add(btnNewButton_2);
		
		
		
		
		
		
		f.setVisible(true);
	}
}
