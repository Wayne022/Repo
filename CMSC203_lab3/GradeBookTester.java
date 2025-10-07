import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTester {
	private GradeBook g1;
	private GradeBook g2;
	

	@BeforeEach
	public void setUp() throws Exception {
	
		g1 = new GradeBook(5);
		g2 = new GradeBook(5);
		
		
		g1.addScore(89.0);
        g1.addScore(78.5);
        g1.addScore(96.0);

        g2.addScore(98.0);
        g2.addScore(88.0);
        g2.addScore(81.5);
        g2.addScore(79.0);
	}

	@AfterEach
	public void tearDown() throws Exception {
		
		g1= null;
		g2= null;
	}

	@Test
	void testAddScore() {
		assertTrue(g1.toString().equals("89.0 78.5 96.0 "));
        assertTrue(g2.toString().equals("98.0 88.0 81.5 79.0 "));

        // Check scoreSize
        assertEquals(3, g1.getScoresSize(), 0.001);
        assertEquals(4, g2.getScoresSize(), 0.001);
	}

	@Test
	void testSum() {
		assertEquals(89.0 + 78.5 + 96.0, g1.sum(), 0.001);
        assertEquals(98.0 + 88.0 + 81.5 + 79.0, g2.sum(), 0.001);
	}

	@Test
	void testMinimum() {
		assertEquals(78.5, g1.minimum(), 0.001);
        assertEquals(79.0, g2.minimum(), 0.001);
	}

	@Test
	void testFinalScore() {
		 assertEquals(185.0, g1.finalScore(), 0.001);

	        // g2: sum = 346.5, min = 79.0 → final = 267.5
	        assertEquals(267.5, g2.finalScore(), 0.001);
	}

	@Test
	void testGetScoresSize() {
		
	}

	@Test
	void testToString() {
		
	}

}
