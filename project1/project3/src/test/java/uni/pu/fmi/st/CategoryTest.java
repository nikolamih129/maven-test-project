package uni.pu.fmi.st;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.experimental.categories.Category;

public class CategoryTest {
	@Category(SlowTests.class)
	@Test
	public void testSlowTest() {
		assertTrue(true);
		
		System.out.println("SlowTests");
	}
	@Category(FastTests.class)
	@Test
	public void testFastTest() {
		assertTrue(true);
		System.out.println("FastTests");
	}
	
	
	
}
