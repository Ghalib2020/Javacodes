package javapackage;

import java.util.HashMap;// import HasMap from Java.util package 

public class Hashmap {

	public static void main(String[] args) {
		/*
		 To store items (key, value) pair we use hashmap
		 one object used as a key another object used as an value.
		 it can store different types, as (string, int), (string,String),(int,int),(int,string)
		 */
HashMap <String, String> capital=new HashMap();// HashMap key word
capital.put("bangladesh", "dhaka");
capital.put("Usa","washinton");
System.out.println(capital);
// to get acess an item in hashmap we us get method
//capital.get("bangladesh");
System.out.println(capital.get("canada"));
System.out.println(capital.get("bangladesh"));
//remove
//capital.remove("bangladesh");
System.out.println(capital);
/* we can use keyset() method if we only want the key and use the value() method if we want the values
 * 
 */
for(String i:capital.keySet()) {
	System.out.println(i);
	
}
for(String i:capital.values()) {
	System.out.println(i);
}


	}

}
