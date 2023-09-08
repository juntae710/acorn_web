package ct_0907;

public class Lv0_Babbing {

	public static void main(String[] args) {
		String[] babbling = { "ayaye", "uuuma", "ye", "yemawoo", "ayaa"};
		String[] 발음가능한배열 = { "aya", "ye", "woo", "ma" };

		String 가능발음 = "";
		int cnt = 0;

	
		for (int i = 0; i < babbling.length; i++) {
			
			int resultlen = 0;
			for (int j = 0; j < 발음가능한배열.length; j++) {
				가능발음 = 발음가능한배열[j];
				if (babbling[i].contains(가능발음)) {
					resultlen += 가능발음.length(); // 3 + 3
				}
			}
			
			if (babbling[i].length() == resultlen) {
				cnt++;
			}
		}

		System.out.println(cnt);

	}
	
	
	

}
