package 인터페이스;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 버튼이벤트처리 implements ActionListener {
	static TextArea area;
	static JButton b1, b2;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500, 600);
		f.setLayout(new FlowLayout());

		b1 = new JButton("나를 눌러요.");
		b2 = new JButton("나도 눌러요.");

		버튼이벤트처리 act3 = new 버튼이벤트처리();

		b1.addActionListener(act3);
		b2.addActionListener(act3);

		f.add(b1); // 업캐스팅(자동형변환)
		f.add(b2); // 업캐스팅(자동형변환)

		Font font = new Font("나눔고딕", Font.BOLD, 50);
		b1.setFont(font);
		b2.setFont(font);

		area = new TextArea(6, 13);
		area.setFont(font);
		f.add(area);
		area.setBackground(Color.pink);

		f.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1) {
			area.append("b1클릭함." + "\n");
			System.out.println("b1 클릭함.");
		} else {
			area.append("b2클릭함." + "\n");
			System.out.println("b2 클릭함.");
		}

	}

}
