package ct_0907;

public class Lv1_baby {
	public static void main(String[] args) {
		int answer = 0;
		String[] babbling = { "ayaye", "uuu", "yeye", "yemawoo", "ayaayaa" };
		for (int i = 0; i < babbling.length; i++) {
			String b = babbling[i];
			b = b.replaceFirst("aya", "1");
			b = b.replaceFirst("ye", "1");
			b = b.replaceFirst("woo", "1");
			b = b.replaceFirst("ma", "1"); 
			b = b.replace("1", "");

			if (b == "") {
				answer++;	
			}
		}

	}
}
