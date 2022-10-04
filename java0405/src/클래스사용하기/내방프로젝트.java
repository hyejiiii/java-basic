package 클래스사용하기;

import 클래스만들기.전화기;
import 클래스만들기.강아지;

public class 내방프로젝트 {

	public static void main(String[] args) {
		//전화기 한 대 넣어보세요
		전화기 p1 = new 전화기();
		System.out.println(p1);
		p1.size = 11;
		p1.speaker = "바나나사";
		
		System.out.println(p1.size);
		System.out.println(p1.speaker);
		p1.통화하다();
		p1.사진을찍다();
		
		//전화기 한 대 추가
		전화기 p2 = new 전화기();
		System.out.println(p2);
		p2.size = 12;
		p2.speaker = "메론사";
		
		System.out.println(p1.size);
		System.out.println(p1.speaker);
		p1.통화하다();
		p1.사진을찍다();
		
		//강아지 한 마리
		강아지 d1 = new 강아지();
		System.out.println(d1);
		d1.color = "white";
		d1.tail = "long";
		
		System.out.println(d1.color);
		System.out.println(d1.tail);
		d1.밥을먹다();
		d1.산책하다();
		
	}

}
