package acorn;

import java.util.ArrayList;

public class ExTest {
	public int add(int a, int b) {
		return a + b;

	}
	public int sub(int a, int b) {
		return a - b;

	}
	public int mul(int a, int b) {
		return a * b;

	}
	public int div(int a, int b) {
		return a / b;

	}
	

	public ArrayList<Integer> ayk(int a) {
		ArrayList<Integer> list = new ArrayList<>();
		
//		for(int i=0; i<a; i++) {
//			for(int j=0; j<a/2; j++) {
//				if(a==i*j) {
//					list.add(i);
//				}
//			}
//		}
		for	(int i = 1; i <= a; i++) {	
			if (a % i == 0) {
		    	list.add(i);
			}
		}
		
		
		return list;

	}
	
//	public static void main(String[] args) {
//		ExTest test = new ExTest();
//		int result = test.add(5, 4);
//		System.out.println(result);
//	}
}