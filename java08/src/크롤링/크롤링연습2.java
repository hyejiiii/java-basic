package 크롤링;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 크롤링연습2 {

	public static void main(String[] args) {
		// 1. 사이트에 연결해서 html 문서를 다 가지고 오자
		try {
			Document doc = Jsoup.connect("https://finance.naver.com/item/main.naver?code=005930").get();
			// System.out.println(doc);
			// Elements는 ArrayList의 자식
			//Elements list = doc.select(".code"); // class가 code
			//System.out.println(list.size());
			//Element tag = list.get(0); // element는 태그를 나타냄
			//System.out.println(tag.text()); // <a>메일</a> 중에서 메일만 추출
			
			Elements list = doc.select(".blind");
			// Elements list = doc.select("태그명");
			// Elements list = doc.select(".클래스명");
			// Elements list = doc.select("태그명.클래스명");
			System.out.println(list.size());
			System.out.println(list);
			for (int i = 0; i < list.size(); i++) {
				Element tag = list.get(i);
				System.out.println(i + ": " + tag.text());
			}
			Element tag = list.get(16);
			System.out.println("현재가는 " + tag.text());
			//전일가, 고가
			Element tag2 = list.get(19);
			Element tag3 = list.get(20);
			System.out.println("전일가는 " + tag2.text());
			System.out.println("고가는 " + tag3.text());
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
