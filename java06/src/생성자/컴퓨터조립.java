package 생성자;

public class 컴퓨터조립 {

	public static void main(String[] args) {
		컴퓨터 com1 = new 컴퓨터(10000, "APPLE", 30);
		컴퓨터 com2 = new 컴퓨터(20000, "BANANA", 50);
//		System.out.println(com1.가격);
//		System.out.println(com1.제조회사);
//		System.out.println(com1.모니터크기);
//		System.out.println(com2.가격);
//		System.out.println(com2.제조회사);
//		System.out.println(com2.모니터크기);
		// com1은 주소가 들어있음
		// 컴퓨터 클래스에 toString()을 메서드를 생성해주면
		// 주소를 프린트할 때 toString() 메서드가 자동 호출되어
		// return한 스트링을 주소 대신에 프린트해준다
		System.out.println(com1);

	}

}
