package com.robots.pencils.deck;

public final class Card {
	public static enum Suit {
		HEARTS, DIAMONDS, CLUBS, SPADES
	}

	public static enum FaceValue {
		TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE
	}

	private final Suit suit;
	private final FaceValue faceValue;

	public Card(Suit suit, FaceValue faceValue) {
		this.suit = suit;
		this.faceValue = faceValue;
	}
	
	public String toString() {
		return faceValue.toString() + " OF " + suit.toString();
	}
	
	public boolean equals(Card that) {
		return this.suit.equals(that.suit) && this.faceValue.equals(that.faceValue);
	}

}
