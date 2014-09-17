package MapAndList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;


/******************************************************************************
 * <b>Title</B>: MapAndListEnvironment.java Description: this project will 
 * include: a map with state names and state keys and a method to order and 
 * reverse the order.  
 * 
 * a list containing a deck of cards. and a method to shuffle them into random 
 * order.
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
		
		MapAndListEnvironment mapEnvironment = new MapAndListEnvironment();
		mapEnvironment.process();
		
		
	}
	/**
	 * Produces a list of states abbreviations and state names, which are
	 * 		organized into a two treemaps.  one in natural order and one in 
	 * 		reverse natural order. 
	 */
	
	public void process() {
		
		//makes a key list.
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

		
		
		//makes a state name list.  
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

				
		//generates the first treemap in normal natural order.  
		 Map<String , String> stateMap = new TreeMap<>();
		 
		 	for ( int count = 0 ; count < stateKey.size(); count++ ) {

		 		stateMap.put(stateKey.get(count), stateName.get(count));
			}
				    
		 //prints the first maps keys and values to the display.
		 System.out.println("printing out a alphabetical tree map of states "
		 		+ "and states codes" ); 

		 System.out.println(stateMap.keySet());
		 
		 System.out.println(stateMap.values());
		 
		//set a custom comparator to sort in reverse. 
		Comparator<String> testComparator = Collections.reverseOrder();
		 
		 //produce a second map of the same listss using the new comparator.
		 Map<String , String> stateMapInverted = new TreeMap<String , String >(testComparator);
		 
		 for ( int count = 0 ; count < stateKey.size(); count++ ) {

			stateMapInverted.put(stateKey.get(count), stateName.get(count));
			    
			}
		 
		 //prints the second maps keys and values to the display.
		 System.out.println(stateMapInverted.size());
		 
		 System.out.println("printing out a alphabetical tree map of states "
		 		+ "and states codes" ); 

		 System.out.println(stateMapInverted.keySet());
		 
		 System.out.println(stateMapInverted.values());
		 
	}


}
