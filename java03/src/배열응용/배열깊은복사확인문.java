package 배열응용;

public class 배열깊은복사확인문 {

	public static void main(String[] args) {
		String[] c = {"국어", "영어", "수학", "컴퓨터", "회화"};
		int[] j1 = {44, 66, 22, 99, 100};
		int[] j2 = j1.clone();
		j2[0] = 22;
		j2[2] = 88;
		for (int x : j1) {
			System.out.println("1학기 성적: " + x);
		}
		System.out.println("-------------------");
		for (int x : j2) {
			System.out.println("2학기 성적: " + x);
		}
	}

}
