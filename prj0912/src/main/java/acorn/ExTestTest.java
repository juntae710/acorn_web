package acorn;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

class ExTestTest {
ExTest t = new ExTest();
	@Test
	void testAdd() {
		//fail("Not yet implemented");
		assertEquals(5, t.add(3, 2));
	}

	@Test
	void testSub() {
		assertEquals(5, t.sub(10, 5));
	}

	@Test
	void testMul() {
		assertEquals(5, t.mul(5,1));
	}

	@Test
	void testDiv() {
		assertEquals(5, t.div(10, 2));
	}

	@Test
	void testAyk() {
		
		ArrayList<Integer> arr=new ArrayList<>();
		arr.add(1);
		arr.add(2);
		arr.add(4);
		arr.add(8);
		 int[] arr2 = {1,2,4,8};
			assertEquals(arr, t.ayk(8));
			
			
		 ArrayList<Integer> arrayList = new ArrayList<>();
	        arrayList.add(1);
	        arrayList.add(2);
	        arrayList.add(3); 
	         

	        // Integer 형 배열로 변환
	        Integer[] intArray = arrayList.toArray(new Integer[arrayList.size()]);

	        // 변환된 배열 출력
	        System.out.println("배열 내용: " + Arrays.toString(intArray));
	
		 
	}

}
