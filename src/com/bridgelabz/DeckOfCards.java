package com.bridgelabz;

public class DeckOfCards {

    public static void main(String[] args) {

        System.out.println("Welcome to Deck of cards"); // printed welcome msg

      /*
      *creating array to store values
      * storing suits in one string and ranks in another string
       */

        String[][] cardsCollection = new String[4][13];

        String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };
        String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };

        /*
        creating object to access createCards() Method
         */
        DeckOfCards deckOfCards = new DeckOfCards();
        deckOfCards.createCards(suits, ranks, cardsCollection);

    }

    // created  method to store data in array

    public void createCards(String[] suit, String[] ranks, String[][] cardsCollection) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {

                cardsCollection[i][j] = (suit[i] + "-" + ranks[j]); // storing values in array

            }

        }

    }

}


