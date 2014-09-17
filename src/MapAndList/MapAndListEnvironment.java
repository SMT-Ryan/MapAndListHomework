package MapAndList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;


/******************************************************************************
 * <b>Title</B>: MapAndListEnvironment.java Description: This project will 
 * include: 
 * a map with state names and state keys and a methods to display them
 * in natural order and reverse the order.  
 * 
 * a list containing a deck of cards with methods to display them as entered 
 * and to display them after they have been shuffled into random order.
 * 
 * Copyright: Copyright (c) 2014 Company: Silicon Mountain Technologies
 *
 * @author Ryan Riker
 * @version 1.0
 * @since 09/10/2014 last update: never
 *****************************************************************************/

public class MapAndListEnvironment {

	public MapAndListEnvironment() {
		
	}

	public static void main(String[] args) {
		/**
		 * creates a new environment and calls the process method.
		 */
		MapAndListEnvironment mapEnvironment = new MapAndListEnvironment();
		mapEnvironment.process();
		
	}
	/**
	 * Produces a list of states abbreviations and state names, which are
	 * 		organized into a two treemaps.  one in natural order and one in 
	 * 		reverse natural order. 
	 */
	
	public void process() {
		
		/**
		 * Calls the set method to make a set key list.
		 */
		List<String> stateKey = setStateKey();
		
		/**
		 * Calls the method to make a set state name list.  
		 */
		
		List<String> stateName = setStateName();
		
		/**
		 * generates the first treemap in normal natural order.  
		 */
		 Map<String , String> stateMap = new TreeMap<>();
		 
		 	for ( int count = 0 ; count < stateKey.size(); count++ ) {

		 		stateMap.put(stateKey.get(count), stateName.get(count));
			}
		 
		/**
		 * set a custom comparator to sort in reverse. 
		 */
		 Comparator<String> testComparator = Collections.reverseOrder();
		 
		 /**
		  * produce a second map of the same lists using the new comparator.
		  */
		 Map<String , String> stateMapInverted = new TreeMap<String 
				 , String >(testComparator);
		 
		 for ( int count = 0 ; count < stateKey.size(); count++ ) {

			stateMapInverted.put(stateKey.get(count), stateName.get(count));
			    
			}
		 
		 /**
		  * Prints the two maps
		  */
		 
		 printMap(stateMap);
		 printMap(stateMapInverted);

		 
		/**
		* generates a new list of card objects prints them and then shuffles
		* the deck and prints it again.
		*/
			
		List<Card> cardList = setCardList();
		printList(cardList);
		shuffleList(cardList);
		printList(cardList);
		
	}

	/**
	 * Sets the values of the list of cards.
	 * @return
	 */
	private List<Card> setCardList() {
		
		
		List<Card> StandardDeck = new ArrayList<>(52); 
		
		StandardDeck.add(new Card(1 , 'D'));
		StandardDeck.add(new Card(2 , 'D'));
		StandardDeck.add(new Card(3 , 'D'));
		StandardDeck.add(new Card(4 , 'D'));
		StandardDeck.add(new Card(5 , 'D'));
		StandardDeck.add(new Card(6 , 'D'));
		StandardDeck.add(new Card(7 , 'D'));
		StandardDeck.add(new Card(8 , 'D'));
		StandardDeck.add(new Card(9 , 'D'));
		StandardDeck.add(new Card(10 , 'D'));
		StandardDeck.add(new Card(11 , 'D'));
		StandardDeck.add(new Card(12 , 'D'));
		StandardDeck.add(new Card(13 , 'D'));
		
		StandardDeck.add(new Card(1 , 'C'));
		StandardDeck.add(new Card(2 , 'C'));
		StandardDeck.add(new Card(3 , 'C'));
		StandardDeck.add(new Card(4 , 'C'));
		StandardDeck.add(new Card(5 , 'C'));
		StandardDeck.add(new Card(6 , 'C'));
		StandardDeck.add(new Card(7 , 'C'));
		StandardDeck.add(new Card(8 , 'C'));
		StandardDeck.add(new Card(9 , 'C'));
		StandardDeck.add(new Card(10 , 'C'));
		StandardDeck.add(new Card(11 , 'C'));
		StandardDeck.add(new Card(12 , 'C'));
		StandardDeck.add(new Card(13 , 'C'));
		
		StandardDeck.add(new Card(1 , 'H'));
		StandardDeck.add(new Card(2 , 'H'));
		StandardDeck.add(new Card(3 , 'H'));
		StandardDeck.add(new Card(4 , 'H'));
		StandardDeck.add(new Card(5 , 'H'));
		StandardDeck.add(new Card(6 , 'H'));
		StandardDeck.add(new Card(7 , 'H'));
		StandardDeck.add(new Card(8 , 'H'));
		StandardDeck.add(new Card(9 , 'H'));
		StandardDeck.add(new Card(10 , 'H'));
		StandardDeck.add(new Card(11 , 'H'));
		StandardDeck.add(new Card(12 , 'H'));
		StandardDeck.add(new Card(13 , 'H'));
		
		StandardDeck.add(new Card(1 , 'S'));
		StandardDeck.add(new Card(2 , 'S'));
		StandardDeck.add(new Card(3 , 'S'));
		StandardDeck.add(new Card(4 , 'S'));
		StandardDeck.add(new Card(5 , 'S'));
		StandardDeck.add(new Card(6 , 'S'));
		StandardDeck.add(new Card(7 , 'S'));
		StandardDeck.add(new Card(8 , 'S'));
		StandardDeck.add(new Card(9 , 'S'));
		StandardDeck.add(new Card(10 , 'S'));
		StandardDeck.add(new Card(11 , 'S'));
		StandardDeck.add(new Card(12 , 'S'));
		StandardDeck.add(new Card(13 , 'S'));
		
		return StandardDeck;
	}

	/**
	 * sets the string list of state names
	 * @return stateName
	 */
	
	 private List<String> setStateName() {
		 
		 List<String> stateName = new ArrayList<>(50);
			
			stateName.add("Wyoming");
			stateName.add("Alabama");
			stateName.add("Alaska");
			stateName.add("Arkansas");
			stateName.add("Arizona");
			stateName.add("California");
			stateName.add("Colorado");
			stateName.add("Connecticut");
			stateName.add("Delaware");
			stateName.add("Florida");
			stateName.add("Georgia");
			stateName.add("Hawaii");
			stateName.add("Iowa");
			stateName.add("Idaho");
			stateName.add("Illinois");
			stateName.add("Indiana");
			stateName.add("Kansas");
			stateName.add("Kentucky");
			stateName.add("Louisiana");
			stateName.add("Massachusetts");
			stateName.add("Maryland");
			stateName.add("Maine");
			stateName.add("Michigan");
			stateName.add("Minnesota");
			stateName.add("Missouri");
			stateName.add("Mississippi");
			stateName.add("Montana");
			stateName.add("North Carolina");
			stateName.add("North Dakota");
			stateName.add("Nebraska");
			stateName.add("New Hampshire");
			stateName.add("New Jersey");
			stateName.add("New Mexico");
			stateName.add("Nevada");
			stateName.add("New York");
			stateName.add("Ohio");
			stateName.add("Oklahoma");
			stateName.add("Oregon");
			stateName.add("Pennsylvania");
			stateName.add("Rhode Island");
			stateName.add("South Carolina");
			stateName.add("South Dakota");
			stateName.add("Tennessee");
			stateName.add("Texas");
			stateName.add("Utah");
			stateName.add("Virginia");
			stateName.add("Vermont");
			stateName.add("Washington");
			stateName.add("Wisconsin");
			stateName.add("West Verginia");
			
		return stateName;
	}

	 /**
	  * sets the string list of state abbreviations
	  * @return stateKey
	  */
	 
	private List<String> setStateKey() {
		
		 List<String> stateKey = new ArrayList<>(50);

			stateKey.add("WY");
			stateKey.add("AL");		
			stateKey.add("AK");
			stateKey.add("AR");
			stateKey.add("AZ");
			stateKey.add("CA");
			stateKey.add("CO");
			stateKey.add("CT");
			stateKey.add("DE");
			stateKey.add("FL");
			stateKey.add("GA");
			stateKey.add("HI");
			stateKey.add("IA");
			stateKey.add("ID");
			stateKey.add("IL");
			stateKey.add("IN");
			stateKey.add("KS");
			stateKey.add("KY");
			stateKey.add("LA");
			stateKey.add("MA");
			stateKey.add("MD");
			stateKey.add("ME");
			stateKey.add("MI");
			stateKey.add("MN");
			stateKey.add("MO");
			stateKey.add("MS");
			stateKey.add("MT");
			stateKey.add("NC");	
			stateKey.add("ND");
			stateKey.add("NE");
			stateKey.add("NH");
			stateKey.add("NJ");
			stateKey.add("NM");
			stateKey.add("NV");
			stateKey.add("NY");
			stateKey.add("OH");
			stateKey.add("OK");
			stateKey.add("OR");
			stateKey.add("PA");
			stateKey.add("RI");
			stateKey.add("SC");
			stateKey.add("SD");
			stateKey.add("TN");
			stateKey.add("TX");
			stateKey.add("UT");
			stateKey.add("VA");
			stateKey.add("VT");
			stateKey.add("WA");
			stateKey.add("WI");
			stateKey.add("WV");
		 
		 
		return stateKey;
	}

	/**
	  * prints the size, keys and values of a state map to the display.
	  */
	private void printMap(Map<String, String> stateMap) {
		System.out.println();
		
		System.out.println("List Size " + stateMap.size());
		 
		System.out.println("printing to display the selected tree map of "
		 		+ "states and states codes" ); 

		System.out.println(stateMap.keySet());
		 
		System.out.println(stateMap.values());
		
		System.out.println();
	}
	
	/**
	 *prints to the display the cards in current card list. 
	 * @param cardList
	 */
	public void printList(List<Card> cardList) {
		
		System.out.println();
		
		System.out.println("List of shuffled cards size " + cardList.size());
		
		System.out.println();
		 
		 for ( int count = 0 ; count < cardList.size(); count++ ) {

			System.out.println("the shuffled card is " + 
					cardList.get(count).getCardSuit() + 
					 " and " + cardList.get(count).getCardRank());
		 }
		 
		System.out.println();
	}
	
	
	
	/**
	 * shuffles active card list.
	 * @param shuffleList
	 */
	public List<Card> shuffleList(List<Card> shuffleList){
		Collections.shuffle(shuffleList);
		return shuffleList;
	}

}
