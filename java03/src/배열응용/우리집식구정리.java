package 배열응용;

public class 우리집식구정리 {

	public static void main(String[] args) {
		System.out.println("우리집 식구 정리");
		System.out.println("---------------------");
		System.out.println("이름\t나이\t키");
		System.out.println("---------------------");
		
		String[] family = {"아버지", "어머니", "형", "나", "동생"};
		int[] age = {100, 88, 33, 24, 10};
		double[] height = {177.5, 152.2, 190.3, 167.7, 155.3};
		
		// 나에 대한 정보만 프린트
		System.out.println(family[3] + " " + age[3] + " " + height + " ");
		
		for (int i = 0; i < height.length; i++) {
			System.out.println(family[i] + "\t" + age[i] + "\t" + height[i]);
		}
		
		
		
	}

}
