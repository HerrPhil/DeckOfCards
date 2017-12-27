package com.robots.pencils.deck;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cards {

	private List<Card> deck;

	public static void main(String[] args) {
		Cards cards = new Cards();
		System.out.printf("deck of cards has %d cards%n", cards.getDeckCount());
		int[] shuffledDeck = CardUtil.shuffle(cards.getDeckCount());
		System.out.printf("shuffled deck has %d cards%n", shuffledDeck.length);
		@SuppressWarnings("resource")
		Scanner userInput = new Scanner(System.in);
		System.out.printf("%nEnter number cards to deal (%d to %d)%n", 1, shuffledDeck.length);
		int numberOfCards = userInput.nextInt();
		cards.deal(numberOfCards, shuffledDeck);

		System.exit(0);
	}

	public void deal(int numberOfCards, int[] shuffledDeck) {
		for(int i = 0; i < numberOfCards; i++) {
			System.out.printf("Card #%d %s%n", i+1, this.getCard(shuffledDeck[i]).toString());
		}
	}

	public Cards() {
		this.deck = new ArrayList<Card>();
		initDeck();
	}

	public int getDeckCount() {
		return deck.size();
	}
	
	public Card getCard(int draw) {
		return deck.get(draw);
	}

	private void initDeck() {
		for (Card.Suit suit : Card.Suit.values()) {
			for (Card.FaceValue faceValue : Card.FaceValue.values()) {
				Card nextCard = new Card(suit, faceValue);
				this.deck.add(nextCard);
			}
		}
	}

}
