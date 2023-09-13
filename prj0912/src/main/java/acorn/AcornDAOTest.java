package acorn;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AcornDAOTest {
	AcornDAO dao =new AcornDAO();
	@Test
	void testSelectAll() {
		//assertTrue(dao.selectAll() != null); 
		assertTrue(dao.selectAll().size() >=1); 
		
		//fail("Not yet implemented");
	}
	@Test
	void testSelectAll2() {
		// String[]  query = { "dy", "yj"};
	 	 assertTrue(  dao.selectAll2(  new String[] {"dy", "yj"} ).size() ==2) ;
	 	 
	 	 //[] strs = {"one","two","thre"};
	 	 //String[] str2 = new String[]{"one","two","thre"};
	}

}
