package 배열기본;

import java.util.Random;

public class 배열랜덤값넣기 {

	public static void main(String[] args) {
		// 1000개 데이터 넣을 공간
		int[] lotto = new int[6];
		
		// 랜덤한 값 만들어주는 부품을 만들어라
		Random r = new Random();
		
		// 반복문으로 랜덤한 값 1000개 만들어서 저장공간에 넣어라
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = r.nextInt(45) + 1; // 0~31 -> 1~32
		}
		
		// 1000개 프린트
		for (int x : lotto) {
			System.out.print(x + " ");
		}
	}

}
