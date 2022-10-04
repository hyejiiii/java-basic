package 배열기본;

public class 배열기초확인문제 {

	public static void main(String[] args) {
		int[] num = new int[5];
		System.out.println(num.length);
		
		num[0] = 100;
		num[4] = 500;
		num[2] = 200;
		
		for (int n : num) {
			System.out.println(n);
		}
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
	}

}
