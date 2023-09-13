package prj_0913;

import java.util.HashSet;

import org.eclipse.jdt.internal.compiler.util.HashtableOfObjectToIntArray;

public class SetEx {
public static void main(String[] args) {
	HashSet<String> fruits  = new HashSet<>();
	
	fruits.add("사과");
	fruits.add("사과");
	fruits.add("사과");
	fruits.add("바나나");
	fruits.add("오랜지");
	
	 for(String fruit: fruits) {
		 System.out.println(fruit);
	 }
}
}
