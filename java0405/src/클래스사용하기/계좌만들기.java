package 클래스사용하기;

import 클래스만들기.계좌;

public class 계좌만들기 {

	public static void main(String[] args) {
		계좌 me = new 계좌();
		me.이름 = "정혜지";
		me.계좌이름 = "청년적금";
		me.금액 = 50000000;
		계좌 dad = new 계좌();
		dad.이름 = "아빠";
		dad.계좌이름 = "적금";
		dad.금액 = 500000000;
		계좌 mam = new 계좌();
		mam.이름 = "엄마";
		mam.계좌이름 = "주택청약";
		mam.금액 = 50000000;
		
		me.입금하다();
		me.출금하다();
		me.계좌정보();
		dad.계좌정보();
		mam.계좌정보();
		

	}

}
