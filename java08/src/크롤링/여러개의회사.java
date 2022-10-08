package 크롤링;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 여러개의회사 {

	public static void main(String[] args) {
		String[] code = {"035720", "005930", "035420"};
		String[] company = {"카카오", "삼성전자", "네이버"};
		
		for (int i = 0; i < company.length; i++) {
			try {
				Document doc = Jsoup.connect("https://finance.naver.com/item/main.naver?code=" + code[i]).get();
				System.out.println("--------------------");
				System.out.println("회사명: " + company[i]);

				// 전일가
				Elements list = doc.select("td.first").select(".blind");
				// System.out.println(list);
				Element tag = list.get(0); // 전일가
				System.out.println("전일가: " + tag.text());
				String yesterday = tag.text();

				// 현재가
				Elements list2 = doc.select("div.today").select(".blind");
				// System.out.println(list2);
				Element tag2 = list2.get(0);
				System.out.println("현재가: " + tag2.text());
				String today = tag2.text();

				//시가
				Elements list3 = doc.select("td.first").select(".blind");
				//System.out.println(list3);
				Element tag3 = list3.get(1);
				System.out.println("시가: " + tag3.text());
				String market_price = tag3.text();

			} catch (IOException e) {
				e.printStackTrace();
			} 
		}


	}

}
