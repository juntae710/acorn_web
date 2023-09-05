package cartPrj;

import java.util.Random;

public class ItemService {
	public String getItem(String code) {
		//
		
		Random r = new Random();
		String[] goodsList = {"바지","티셔츠","신발"};
		int index = r.nextInt(3);
		return goodsList[index];
	}
}
