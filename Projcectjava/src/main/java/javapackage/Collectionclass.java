package javapackage;

import java.util.ArrayList;
import java.util.Collections;

public class Collectionclass {

	public static void main(String[] args) {
		
		ArrayList<Integer> A=new ArrayList();
		A.add(3);
		A.add(10);
		A.add(5);
		System.out.println(A);
		
		// if we want to increment we have to do for loop
			
			for(int i=0;i<A.size();i++) {
				//System.out.println(A.get(i));
				
			
			}
Collections.sort(A);
for(int i:A) {
	System.out.println(i);
	/* Collection class is another useful class java.util package
	 which use sort method for sorting lists alphabetically and numerically

	 */
}

		}

	


	}


