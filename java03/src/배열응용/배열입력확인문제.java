package 배열응용;

import javax.swing.JOptionPane;

public class 배열입력확인문제 {

	public static void main(String[] args) {
		// 우선순위에 따라 입력!
		// 작년과 올해 가고 싶은 곳과 우선순위가 동일한 곳은 몇 곳?
		// 같은 위치에 있는 장소끼리만 비교하자
		String[] s1 = new String[3];
		String[] s2 = new String[3];
		
		for (int i = 0; i < s2.length; i++) {
			s1[i] = JOptionPane.showInputDialog("작년에 가고 싶었던 곳");
		    s2[i] = JOptionPane.showInputDialog("올해 가고 싶었던 곳");
		}
		for (int i = 0; i < s2.length; i++) {
			System.out.println(s1[i] + " " + s2[i]);
		}
		int count = 0;
		for (int i = 0; i < s2.length; i++) {
			if(s1[i].equals(s2[i])) {
				count++;
				System.out.println("같은 위치는 " + 1);
			} 
		}
		System.out.println("같은 위치의 개수는 " + count);
	}

}
