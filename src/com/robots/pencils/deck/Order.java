package com.robots.pencils.deck;

import java.util.Arrays;

public class Order {
	
	private int result[];
	
	public Order(int size) {
		result = new int[size];
		Arrays.setAll(result, i -> i);
	}
	
	public int[] getResult() {
		return result;
	}
	
	public void swap(int index, int randomIndex) {
		int temp = result[index];
		result[index] = result[randomIndex];
		result[randomIndex] = temp;
	}

}
