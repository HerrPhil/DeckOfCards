package com.robots.pencils.deck;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestCardUtil {

	Cards cards;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		cards = new Cards();
	}

	@After
	public void tearDown() throws Exception {
		cards = null;
	}

	@Test
	public final void testShuffle() {
		int[] actual = CardUtil.shuffle(cards.getDeckCount());
		boolean valid = true;
		for (int i = 0; i < actual.length; i++) {
			valid &= (cards.getCard(i).toString() != null); 
		}
		assertTrue("all shuffled cards found", valid);
	}

}
