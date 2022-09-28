package 조건문;

public class IfElse조건문2 {

	public static void main(String[] args) {
		int score = 88;
		// 변수 선언할 때 변수가 생성
		// result 안에는 쓰레기값이 들어있음
		// 연산자도 안되고 출력도 안됨
		String result = ""; // 초기화
		// 변수를 선언할 때는 초기값을 넣어주세요
		// 조건이 맞으면 내용을 처리하고 break!를 건다
		// 아래의 조건을 실행하지 않는다

		if (score >= 90) {
			result = "A학점";
		} else if (score >= 85 && score < 90) {
			result = "B+학점";
		} else if (score >= 80 && score < 85) {
			result = "B-학점";
		} else if (score >= 70) {
			result = "C학점";
		} else {
			result = "D학점";
		}

		System.out.println("당신의 학점은 " + result);

	}

}
