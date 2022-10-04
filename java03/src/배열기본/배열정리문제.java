package 배열기본;

import java.util.Scanner;

public class 배열정리문제 {

	public static void main(String[] args) {
		// 키보드로 입력하는 부품
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[5]; // {0, 0, 0, 0, 0}
		
		for (int i = 0; i < 5; i++) {
			System.out.print("숫자입력>> ");
			num[i] = sc.nextInt(); // 외부입력은 모두 string //nextInt(): String -> Int
		}
		int sum = 0;
		for (int x : num) {
			//System.out.println(x);
			sum = sum + x;
		}
		System.out.println(sum);
		System.out.println(sum/5.0);
		//System.out.println("저장된 데이터는 " + data);
	}

}
