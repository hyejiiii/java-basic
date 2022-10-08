package 정적static;

public class 나의일지 {

	public static void main(String[] args) {
		// 변수는 선언된 위치를 포함한 괄호 안에서만 사용 가능
		// day1, 2, 3는 메서드 안에서만 쓸 수 있음
		// main 안에서만 쓸 수 있는 지역변수
		// 지역변수 <---> 전역변수
		// 지역변수는 자동초기화x
		// 지역변수는 프로그래머가 초기화시켜야 함
		Day day1 = new Day("코딩공부", 8, "우리집");
		System.out.println(day1);
		System.out.println(Day.count); //static! = 누적, 공유
		Day day2 = new Day("크로스핏", 2, "크로스핏토르");
		System.out.println(day2);
		System.out.println(Day.count);
		Day day3 = new Day("라이프아카데미", 6, "학교");
		System.out.println(day3);
		System.out.println(Day.count);
		
		System.out.println("전체 시간은 " + Day.totaltime + "시간");
		System.out.println("평균 시간은 " + Day.getAvg() + "시간");

	}

}
