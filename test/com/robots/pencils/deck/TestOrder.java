package com.robots.pencils.deck;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestOrder {

	private Order order;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		order = new Order(52);
	}

	@After
	public void tearDown() throws Exception {
		order = null;
	}

	@Test
	public final void testSwap() {
		// setup
		int expectedSeven = 29;
		int expectedTwentyNine = 7;
		
		// execute
		order.swap(7, 29);
		
		// assert
		int[] actual = order.getResult();
		assertEquals(expectedSeven ,actual[7]);
		assertEquals(expectedTwentyNine, actual[29]);
	}

}
