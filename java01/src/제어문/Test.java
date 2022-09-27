package 제어문;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class Test {

	public static void main(String[] args) {

			JFrame f = new JFrame();
			f.setSize(588, 542);
			
			JButton btnNewButton = new JButton("북쪽");
			btnNewButton.setForeground(new Color(255, 0, 0));
			btnNewButton.setBackground(new Color(255, 128, 64));
			btnNewButton.setFont(new Font("굴림", Font.BOLD, 35));
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				}
			});
			f.getContentPane().add(btnNewButton, BorderLayout.NORTH);
			
			JButton btnNewButton_1 = new JButton("서쪽");
			btnNewButton_1.setForeground(new Color(64, 128, 128));
			btnNewButton_1.setBackground(new Color(255, 128, 128));
			btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 35));
			f.getContentPane().add(btnNewButton_1, BorderLayout.WEST);
			
			JButton btnNewButton_2 = new JButton("가운데");
			btnNewButton_2.setForeground(new Color(128, 0, 255));
			btnNewButton_2.setBackground(new Color(128, 255, 0));
			btnNewButton_2.setFont(new Font("굴림", Font.BOLD, 35));
			f.getContentPane().add(btnNewButton_2, BorderLayout.CENTER);
			
			JButton btnNewButton_3 = new JButton("동쪽");
			btnNewButton_3.setForeground(new Color(0, 128, 255));
			btnNewButton_3.setBackground(new Color(255, 128, 192));
			btnNewButton_3.setFont(new Font("굴림", Font.BOLD, 35));
			f.getContentPane().add(btnNewButton_3, BorderLayout.EAST);
			
			JButton btnNewButton_4 = new JButton("남쪽");
			btnNewButton_4.setForeground(new Color(128, 128, 192));
			btnNewButton_4.setBackground(new Color(255, 128, 64));
			btnNewButton_4.setFont(new Font("굴림", Font.BOLD, 35));
			f.getContentPane().add(btnNewButton_4, BorderLayout.SOUTH);
			f.setVisible(true);

	}

}
