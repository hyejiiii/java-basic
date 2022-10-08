package 정적static;

public class 직원 {
	String name;
	int age;
	String gender;
	static int count;
	static int totalage;
	public 직원(String name, int age, String gender) {
		count ++;
		totalage += age;
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	public static double getAvg() {
		return totalage / (double)count;
	}
	@Override
	public String toString() {
		return "직원 [이름=" + name + ", 나이=" + age + ", 성별=" + gender + "]";
	}
	
	

}
