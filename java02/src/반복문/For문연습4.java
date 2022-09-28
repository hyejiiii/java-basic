package 반복문;

import java.util.Iterator;

public class For문연습4 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 33; i <= 222; i++) {
			sum = sum + i;
		} //for1
		System.out.println(sum);
		System.out.println("--------------");
		int sum2 = 0;
		for (int i = 55; i <= 4500; i = i+2) {
			sum2 = sum2 + i;
		}
		System.out.println(sum2);
		System.out.println("--------------");
		int sum3 = 0;
		for (int i = 0; i <= 6000; i = i+5) {
			sum3 = sum3 + i;
		}
		System.out.println(sum3);
	}
}
