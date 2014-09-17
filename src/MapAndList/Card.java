package MapAndList;

/**
 * <b>Title</B>: card.java 
 * Description: class Object that is a card.  
 * Copyright: Copyright (c) 2014 
 * Company: Silicon Mountain Technologies
 * @author Ryan Riker
 * @version 1.0
 * @since 09/11/2014
 * last update: never
 */

public class Card {
		
	
	/**********************************************************************
	*possible ranks 0(no card) 1(low ace) 2 3 4 5 6 7 8 9 10 11(jack and/or
	*	high ace) 12(queen) 13(king) 15(joker)		
	*	possible suits E(no card) H(hearts) D(diamonds) S(spades) C(clubs) 
	*	j(joker) jokers and no cards.
	*******************************************************************************/	

	
	/**
	 * constant values of card suits
	 */
	public final static char EMPTY = 'E';
    public final static char DIAMONDS = 'D';
    public final static char CLUBS = 'C';
    public final static char HEARTS = 'H';
    public final static char SPADES = 'S';
    public final static char JOKERS = 'J';
		
    /**
     * constant values of card ranks 
     */
    public final static int NO_CARD = 0;
    public final static int LOW_ACE = 1;
    public final static int DEUCE = 2;
    public final static int THREE = 3;
    public final static int FOUR = 4;
    public final static int FIVE = 5;
    public final static int SIX = 6;
    public final static int SEVEN = 7;
    public final static int EIGHT = 8;
    public final static int NINE = 9;
    public final static int TEN = 10;
    public final static int JACK = 11;
    public final static int HIGH_ACE = 11;    
    public final static int QUEEN = 12;
    public final static int KING = 13;
	public final static int JOKER = 14;
	
		/**
		 * Declaring private variables
		 */
		private int cardRank;
		private char cardSuit;
		
			/**
			 * if nothing is passed to the card class it will make a card but set the values at no card and empty.  
			 */
			public Card (){
				cardRank = NO_CARD;
				cardSuit = EMPTY;
			}
			/**
			 * No suit constructor 
			 * @param activeCardRank
			 */
			public Card (int activeCardRank){
				cardRank = activeCardRank;
				cardSuit = EMPTY;
				System.out.println("No suit Constructor called, somthing has"
						+ " gone wrong.");
			}
			/**
			 * No rank constructor
			 * @param activeCardSuit
			 */
			public Card (char activeCardSuit){
				cardRank = NO_CARD;
				cardSuit = activeCardSuit;
				System.out.println("No rank Constructor called, something has"
						+ " gone wrong.");
			}
			/**
			 * properly initiate a card
			 * @param activeCardRank
			 * @param activeCardSuit
			 */
			public Card ( int activeCardRank, char activeCardSuit) {
				cardRank = activeCardRank;
				cardSuit = activeCardSuit;
			}
			
			/**
			 * sets a new rank and/or suit for a card
			 * @param newValue
			 */
			public void setCardRank(int newValue){
			
				cardRank = newValue;
			}
			
			public void setCardSuit(char newValue){
			
				cardSuit = newValue;
			}
			
			/**
			 * gets the rank and/or suit of a card
			 * @return
			 */
			public int getCardRank() {
			
				return cardRank;
			}
		
			public char getCardSuit() {
			
				return cardSuit;
			}
			
			/**
			 * boolean check to see if a card is playable
			 * @param cardRank
			 * @return
			 */
			public boolean isPlayableRank(int cardRank) {
		        return LOW_ACE <= cardRank && cardRank <= KING;
		    }
			
		    public boolean isPlayableSuit(char cardSuit) {
		        return DIAMONDS == cardSuit || CLUBS == cardSuit || SPADES == cardSuit || HEARTS == cardSuit;
		    }

		    
		    /**
		     * boolean check to see if a card is possible
		     * @param cardRank
		     * @return
		     */
			public boolean isPossibleRank(int cardRank) {
		        return NO_CARD <= cardRank && cardRank <= JOKER;
		    }
			
		    public boolean isPossibleSuit(char cardSuit) {
		        return JOKER == cardSuit || EMPTY == cardSuit || DIAMONDS == cardSuit || CLUBS == cardSuit || SPADES == cardSuit || HEARTS == cardSuit;
		    }


}
