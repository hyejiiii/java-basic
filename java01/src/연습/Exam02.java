package 연습;

import javax.swing.JOptionPane;

public class Exam02 {

	public static void main(String[] args) {
		//double height = 199.9;
		String height = "199.9";
		double height2 = Double.parseDouble(height);
		double height3 = (height2 - 100)*0.9;
		JOptionPane.showMessageDialog(null, "적정 몸무게는 " + height3);
		
		

	}

}
