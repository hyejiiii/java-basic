package 크롤링;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 크롤링연습3 {

	public static void main(String[] args) {
		// 1. 사이트에 연결해서 html 문서를 다 가지고 오자
		try {
			Document doc = Jsoup.connect("https://finance.naver.com/item/main.naver?code=035720").get();

			Elements list = doc.select(".blind");
			System.out.println(list.size());
			for (int i = 0; i < list.size(); i++) {
				Element tag = list.get(i);
				System.out.println(i + ": " + tag.text());
			}
			Element tag = list.get(16);
			Element tag2 = list.get(19);
			Element tag3 = list.get(20);
			System.out.println("현재가는 " + tag.text());
			System.out.println("전일가는 " + tag2.text());
			System.out.println("고가는 " + tag3.text());

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
