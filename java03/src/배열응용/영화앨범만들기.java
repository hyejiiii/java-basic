package 배열응용;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class 영화앨범만들기 {

	// 전체영역에서 특정한 변수를 사용하려면
	// 클래스 아래에서 선언해야 함
	static int start = 2; // 전역변수

	public static void main(String[] args) {
		// 영화제목
		String[] title = { "정직한 후보2", "공조2", "짱구는 못말려", "탑건2", "알라딘" };
		// 포스터파일
		String[] img = { "정직한 후보2.jpg", "공조2.jpg", "짱구는 못말려.jpg", "탑건2.jpg", "알라딘.jpg" };
		// 평점
		double[] score = { 7.85, 8.03, 9.44, 9.6, 9.42 };

		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(255, 255, 128));
		f.setSize(500, 500);

		JLabel top = new JLabel("짱구는 못말려");
		top.setBackground(new Color(255, 255, 128));
		top.setHorizontalAlignment(SwingConstants.CENTER);
		top.setFont(new Font("굴림", Font.BOLD, 40));
		f.getContentPane().add(top, BorderLayout.NORTH);

		JLabel center = new JLabel("");
		ImageIcon icon = new ImageIcon(img[2]);
		center.setIcon(icon);
		f.getContentPane().add(center, BorderLayout.CENTER);

		JLabel bottom = new JLabel("9.44");
		bottom.setBackground(new Color(255, 255, 128));
		bottom.setFont(new Font("굴림", Font.BOLD, 40));
		bottom.setHorizontalAlignment(SwingConstants.CENTER);
		f.getContentPane().add(bottom, BorderLayout.SOUTH);

		JButton btnNewButton = new JButton("<<");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (start > 0) {
					start = start - 1; // 1 = 2-1
					top.setText(title[start]); // title[1]
					bottom.setText(score[start] + "점");

					// 변경된 이미지 부품 다시 만들어야 함
					// 가운데 라벨에 변경된 이미지 부품을 넣으세요
					ImageIcon icon = new ImageIcon(img[start]);
					center.setIcon(icon);
				} else {
					JOptionPane.showMessageDialog(f, "여기가 오른쪽 끝입니다.");
				}
			}
		});
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 20));
		btnNewButton.setBackground(new Color(128, 255, 128));
		f.getContentPane().add(btnNewButton, BorderLayout.WEST);

		JButton btnNewButton_1 = new JButton(">>");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (start < 4) {
				start++;
				top.setText(title[start]);
				bottom.setText(score[start] + "점");
				ImageIcon icon = new ImageIcon(img[start]);
				center.setIcon(icon);
			} else {
				JOptionPane.showMessageDialog(f,"오른쪽 끝입니다.");
			}
			}
		});
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 20));
		btnNewButton_1.setBackground(new Color(128, 255, 128));
		f.getContentPane().add(btnNewButton_1, BorderLayout.EAST);
		f.setVisible(true);

	}
		}
