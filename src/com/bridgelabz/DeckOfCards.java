package com.bridgelabz;

public class DeckOfCards {

    public static void main(String[] args) {
        System.out.println("Welcome into the Decks of Cards!!! Thank you");
        CardsPlay cardsPlay = new CardsPlay();
        cardsPlay.generateUniqueCards();
        cardsPlay.addPlayer();
    }

}


