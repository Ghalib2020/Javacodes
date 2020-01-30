package javapackage;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylist {

	public static void main(String[] args) {
		/* arraylist is a resize able array, we can add remove replace any time we want.
		 Syntex : 
		 
		 */
		ArrayList <String> fruits =new ArrayList();
		//add value
		fruits.add("banana");
		fruits.add("apple");
		fruits.add("pine");
		System.out.println(fruits);
		/* Array list size
		 * we use size method to find out how many elements are in arrey list
		 */
		fruits.size();
	
		System.out.println(fruits.size());
		
		//sort of 
		Collections.sort(fruits);
		for(String i:fruits) {
		System.out.println(i);
		}
		
		//replace
		fruits.set(0,"orange");
		System.out.println(fruits);
		
		
		
		//remove
		fruits.remove(0);
		System.out.println(fruits);
		
		// for remove all we use clear()
		
	fruits.clear();
	System.out.println(fruits);
	
	// For int valve
	ArrayList<Integer> A=new ArrayList();
	A.add(3);
	System.out.println(A);
	
	A.add(5);
	System.out.println(A);
	
	// if we want to incrmeant we have to do for loop
		for(int i:A) {
			System.out.println(i);
		}
		for(int i=0;i<A.size();i++) {
			System.out.println(A.get(i));
		}
		A.remove(1);
		System.out.println(A);
		

	}

}
