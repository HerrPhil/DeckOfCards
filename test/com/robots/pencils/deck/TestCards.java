package com.robots.pencils.deck;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestCards {

	Cards CUT;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		CUT = new Cards();
	}

	@After
	public void tearDown() throws Exception {
		CUT = null;
	}

	@Test
	public final void testGetDeckCount() {
		// setup
		int expected = 52;

		// execute
		int actual = CUT.getDeckCount();

		// assert
		assertEquals(expected, actual);
	}
	
	@Test
	public final void testGetThreeOfHearts() {
		// setup
		String expected = "three of hearts".toUpperCase();
		int hearts = 0;
		int three = 2;
		int draw = Card.FaceValue.values().length * hearts + three - 1;
		
		// execute
		String actual = CUT.getCard(draw).toString();
		
		// assert
		assertEquals(expected, actual);
	}
	
	@Test
	public final void testGetSevenOfDiamonds() {
		// setup
		String expected = "seven of diamonds".toUpperCase();
		int diamonds = 1;
		int seven = 6;
		int draw = Card.FaceValue.values().length * diamonds + seven - 1;
		
		// execute
		String actual = CUT.getCard(draw).toString();
		
		// assert
		assertEquals(expected, actual);
	}
	
	@Test
	public final void testGetNineOfClubs() {
		// setup
		String expected = "nine of clubs".toUpperCase();
		int clubs = 2;
		int nine = 8;
		int draw = Card.FaceValue.values().length * clubs + nine - 1;
		
		// execute
		String actual = CUT.getCard(draw).toString();
		
		// assert
		assertEquals(expected, actual);
	}
	
	@Test
	public final void testGetAceOfSpades() {
		// setup
		String expected = "ace of spades".toUpperCase();
		int spades = 3;
		int ace = 13;
		int draw = Card.FaceValue.values().length * spades + ace - 1;
		
		// execute
		String actual = CUT.getCard(draw).toString();
		
		// assert
		assertEquals(expected, actual);
	}

}
