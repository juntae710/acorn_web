package day2;

import java.util.ArrayList;

public class Myutils {
public String getDivisor(int su) {
	int su_half = su/2;
	
	System.out.println( su);
	System.out.println( su_half);		
	ArrayList<Integer> nums = new ArrayList<>();
	
	for( int i=1 ; i<=su_half ; i++) {
		 if( su % i  ==0) {
			 nums.add(i);
		 }
	}		
	nums.add(su);
	String divisors = nums.toString();
	
	return divisors;	
	
}


}
