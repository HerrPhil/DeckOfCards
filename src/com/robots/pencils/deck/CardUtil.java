package com.robots.pencils.deck;

import java.util.Random;

public final class CardUtil {
	
	public static final int[] shuffle(int size) {
		
		Random randomGenerator = new Random(); // Random number generator
		Order order = new Order(size);

		for(int index = 0; index < size; index++) {
			int randomIndex = randomGenerator.nextInt(52);
			order.swap(index, randomIndex);
		}
		
		return order.getResult();
	}

}
