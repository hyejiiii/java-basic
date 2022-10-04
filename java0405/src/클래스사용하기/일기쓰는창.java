package 클래스사용하기;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.awt.event.ActionEvent;

public class 일기쓰는창 {
	//멤버변수
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;
	
	//멤버메서드
	public void open() {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(255, 187, 187));
		f.setSize(550, 750);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("오늘의 날짜");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel.setBounds(80, 166, 116, 36);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("오늘의 제목");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel_1.setBounds(80, 245, 116, 36);
		f.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("오늘의 내용");
		lblNewLabel_1_1.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(80, 354, 116, 36);
		f.getContentPane().add(lblNewLabel_1_1);
		
		t1 = new JTextField();
		t1.setFont(new Font("굴림", Font.PLAIN, 20));
		t1.setBackground(new Color(255, 255, 200));
		t1.setBounds(239, 171, 229, 31);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setFont(new Font("굴림", Font.PLAIN, 20));
		t2.setBackground(new Color(255, 255, 210));
		t2.setColumns(10);
		t2.setBounds(239, 250, 229, 31);
		f.getContentPane().add(t2);
		
		t3 = new JTextField();
		t3.setBackground(new Color(255, 255, 191));
		t3.setBounds(239, 323, 229, 250);
		f.getContentPane().add(t3);
		t3.setColumns(10);
		
		JButton btnNewButton = new JButton("파일에 일기 저장");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = t1.getText();
				String s2 = t2.getText();
				String s3 = t3.getText();

				//자바 프로그램 밖에 있는 자원들(네트워크, db프로그램, 파일, etc)을 연결할 때는
				//프로그램이 실행되지 못하는 위험한 상황으로 인식해서
				//반드시 위험한 상황이 발생하면 어떻게 처리할지 명시해줘야 함
				try {
					//file.txt와 자바프로그램간 스트림(강물, 연결통로)를 만들어라!
					FileWriter file = new FileWriter(s1 +".txt");
					//스트림을 통해서 데이터를 보내라.
					file.write(s1 + "\n");
					file.write(s2 + "\n");
					file.write(s3 + "\n");
					//스트림이 닫힐 때 데이터를 다 보냈다고 인식함
					file.close();
				} catch (Exception e1) {
					System.out.println("파일에 저장 중 에러발생함!");
				}

			}
		});
		btnNewButton.setBackground(new Color(174, 255, 174));
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 20));
		btnNewButton.setBounds(143, 631, 257, 31);
		f.getContentPane().add(btnNewButton);
		
		
		
		
		f.setVisible(true);

	}

}
