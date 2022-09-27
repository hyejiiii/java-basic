package 연산자;

public class 연산자확인문제 {

	public static void main(String[] args) {
		//1번
		// 설정암호
		char pw = 'p';
		// 입력암호
		char pw2 = 'q';
		
		if (pw == pw2) {
			System.out.println("PASS!");
		} else {
			System.out.println("재입력!");
		}
		//2번
		double change = 2.2;
		if (2 < change) {
			System.out.println("다이어트 성공!");
		} else {
			System.out.println("다이어트 실패!");
		}
		
		//3번
		if ( pw == pw2 && 2 < change) {
			System.out.println("오늘은 성공!");
		} else {
			System.out.println("내일 다시 도전!");
		}
		
		//4번
		int pe = 66;
		int math = 77;
		int eng = 88;
		int kor = 99;
		int add = pe+math+eng+kor;
		double av = add/4;
		// 둘 중 하나를 실수로 만들어라 !
		// 무조건 결과는 실수 !!
		double av2 = add/4.0;
		System.out.println("점수의 평균은 " + av2);
		
		//5번
		final double pi = 3.14;
		double r = 2.2;
		
		System.out.println("원의 면적은 " + pi * (r * r));
	}

}
