package 정적static;

public class Day {
	// 객체 생성시, 힙영역에 복사될 변수들
	// 변수들에 해당 실제값이 들어감(실제변수, 인스턴스변수)
	String doing;
	int time;
	String location;
	static int count; // 전역변수는 자동초기화
	static int totaltime;
	//static int avg;
	// 객체 생성시, 3개 데이터 반드시 넣어서 객체생성하세요!
	public Day(String doing, int time, String location) {
		//super(); // 써도 되고 안써도 됨
		count++;
		//totaltime = totaltime + time;
		totaltime += time; 
		//avg = totaltime/count;
		this.doing = doing;
		this.time = time;
		this.location = location;
	}
	
	// 일반메서드는 객체생성후, "주소로 접근"해서 호출해야한다!!
	// 일반메서드는 객체생성후, 호출(사용)할 수 있다
	// 평균을 객체생성과 상관없이 아무때나 구하고 싶다!!
	// 객체생성과 상관없이 기능을 정의하고 싶으면 static으로 만들어라!
	public static double getAvg() {
		// static 메서드 안에 들어가는 전역변수는
		// 객체생성하지 않아도 접근가능해야 하므로
		// static 변수만 가능!!
		return totaltime / (double)count;
	}
	// 객체 생성후, 생성된 객체의 주소가 아니라,
	// 그 주소가 가리키는 인스턴스 변수의 값들을 가지고 string으로 만들어주세요
	@Override
	public String toString() {
		return "나의 하루 [하는 일=" + doing + ", 한 시간=" + time + ", 위치=" + location + "]";
	}
	
	
	

}
