package application;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * This class represents GFA test cases for a HolidayBonus object.
 * 
 * @author Farnaz Eivazi
 * @version 7/13/2022
 * 
 */
public class HolidayBonusTestStudent {

	private double[][] studentDataSet = { {22567.63, 36237.64, 42862.95, 54384.86  }, { 37944.37, 31843.86, 42657.70, 52873.49}, { 
		45924.51, 26574.65, 32653.46, 22563.87}, {89352.68, 52873.49, 12536.54, 45665.05}, {21543.66, 75324.57, 31843.86, 42657.70} };

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCalculateHolidayBonusA() {
		try {
			double[] result = HolidayBonus.calculateHolidayBonus(studentDataSet);
			assertEquals(75.0, result[0], .001);
			assertEquals(75.0, result[1], .001);
			assertEquals(75.0, result[2], .001);
		} catch (Exception e) {
			fail("This should not have caused an Exception");
		}

	}

	@Test
	public void testCalculateTotalHolidayBonusA() {
		assertEquals(375.0, HolidayBonus.calculateTotalHolidayBonus(studentDataSet), .001);
	}

}
