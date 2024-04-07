package application;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * This class represents GFA test cases for a TwoDimRaggedArrayUtility object.
 */
public class TwoDimRaggedArrayUtilityTestStudent {
	private double[][] studentDataSet = { {22567.63, 36237.64, 42862.95, 54384.86  }, { 37944.37, 31843.86, 42657.70, 52873.49}, { 
		45924.51, 26574.65, 32653.46, 22563.87}, {89352.68, 52873.49, 12536.54, 45665.05}, {21543.66, 75324.57, 31843.86, 42657.70} };

	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test getRowTotal method
	 * Returns the total of all the elements of row 1.
	 * Row 0 refers to the first row in the two dimensional array
	 */
	@Test
	public void testGetRowTotal() {
		assertEquals(165319.42,TwoDimRaggedArrayUtility.getRowTotal(studentDataSet,1),.001);
	}
}
