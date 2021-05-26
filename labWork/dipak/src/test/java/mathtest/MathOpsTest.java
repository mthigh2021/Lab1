package mathtest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;
import org.junit.Before;
import org.junit.BeforeClass;

import TestExamples.MathOps;

import org.junit.Test;

public class MathOpsTest {

	@BeforeClass
	public static void setUpBeforeClass1() {
		System.out.println("Befor class...");
	}
	
	@AfterClass
	public static void setUpBeforeClass() {
		System.out.println("Befor class...");
	}
	
	@Before
	public void setUP() {
		System.out.println("Running Before....");
	}
	@After
	public void tearDown() {
		System.out.println("running After....");
	}
	@Test
	public void addTest() {
		assertEquals(10, MathOps.add(5, 5));
		assertEquals(8, MathOps.sub(10,2));
		
	}
	@Test
	public void minusTest() {
		assertEquals(10, MathOps.add(5, 5));
		assertEquals(7, MathOps.sub(9,2));
		
	}
	@Test public void divTest() {
		
		MathOps.div(10, 5);
	}

}
