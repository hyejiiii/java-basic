package 배열기본;

import java.util.Iterator;

public class 배열다양한타입문제 {

	public static void main(String[] args) {
		String[] tour = {"도쿄", "하와이", "방콕", "뉴욕", "런던"};
		char[] color = {'p', 'g', 's', 'y', 'v'};
		double[] height = {178.5, 179.1, 175.3, 178.7, 181.8};
		
		// for-each, 자동으로 인덱스를 하나씩 옮겨가면서
		// 반복적으로 꺼내와서 임시변수에 넣어준다
		for (String x : tour) {
			System.out.println(x + " ");
		}
		for (char y : color) {
			System.out.println(y + " ");
		}
		for (double z : height) {
			System.out.println(z);
		}
		System.out.println();
		//for
		for (int i = 0; i < tour.length; i++) {
			System.out.print(tour[i] + " ");
		}
		for (int i = 0; i < color.length; i++) {
			System.out.print(color[i] + " ");
		}
		for (int i = 0; i < height.length; i++) {
			System.out.print(height[i] + " ");
		}
	}
	

}
