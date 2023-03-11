import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTest2 
{
	
	private GradeBook g1;
	private GradeBook g2;
	
	@BeforeEach
	void setUp() throws Exception
	{
		g1 = new GradeBook(5); 
		g2 = new GradeBook(5);
		
		g1.addScore(50);
		g1.addScore(23);
		
		g2.addScore(15);
		g2.addScore(4);
		g2.addScore(37);
		
		
	}

	@AfterEach
	void tearDown() throws Exception 
	{
		g1 = null;
		g2 = null;
	}

	@Test
	void testAddScore() 
	{
		assertTrue(g1.toString().equals("50.0 23.0 "));
		assertEquals(g1.getScoreSize(), 2);
		
		//add test for g2.
		assertTrue(g2.toString().equals("15.0 4.0 37.0 "));
		assertEquals(g2.getScoreSize(), 3);
	}

	@Test
	void testSum() 
	{
		assertEquals(73, g1.sum(), .0001);
		
		assertEquals(56, g2.sum(), .0001);
	}

	@Test
	void testMinimum() 
	{
		assertEquals(23, g1.minimum(), .001);
		
		assertEquals(4, g2.minimum(), .001);
	}

	@Test
	void testFinalScore() 
	{
		assertEquals(50, g1.finalScore());
		
		assertEquals(52, g2.finalScore());

	}



}
