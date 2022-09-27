package 연습;

import javax.swing.JOptionPane;

public class Exam03 {

	public static void main(String[] args) {
		// 입력
		String com = JOptionPane.showInputDialog("통신사를 입력하세요.");
		String tel = JOptionPane.showInputDialog("전화번호를 입력하세요.");
		String name = JOptionPane.showInputDialog("가입자 이름을 입력하세요.");
		// 처리
		String str = name + "님은 " + com + "에 " + tel;
		// 출력
		JOptionPane.showMessageDialog(null, "다이얼로그로 " + str + "로 가입되셨습니다.");

	}

}
