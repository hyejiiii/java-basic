package 반복문;

import java.util.Random;

import javax.swing.JOptionPane;

public class 정답맞추기 {

	public static void main(String[] args) {
		Random r = new Random(); 
		int target = r.nextInt(100); //0~99
		int count = 0; //int는 보통 0으로 초기화시켜줌.
		int no = 0;
		// 누적시켜주는 변수의 선언은 반복문 안에 넣지 않음
		while (true) { // 무한루프
			String data = JOptionPane.showInputDialog("생각한 숫자 입력");
			count = count + 1; //count++ (증감연산자, 1씩증가/감소)
			int data2 = Integer.parseInt(data); // 88
			if (data2 == target) {
				System.out.println("정답입니다.!! 축하합니다.!!");
				// 무한루프 반드시 끝내는 처리를 해야함
                //break; // while의 break
				System.out.println("정답은 " + target);
				System.out.println("전체 시도횟수는 " + count);
				System.out.println("틀린 횟수는 " + no);
				System.exit(0); //정답맞추기 게임 프로그램을 종료
			} else {
				System.out.println("정답이 아닙니다.!!");
				int no2 = no++;
				//입력한 값이 정답보다 큰지, 작은지를 알려주세요.
				if (data2>target) {
					System.out.println("너무 커요.");
				} else {
					System.out.println("너무 작아요.");
				}
			}
		} // while
		//JOptionPane.showMessageDialog(null, "다음에 또 방문해주세요.");
	}

}
