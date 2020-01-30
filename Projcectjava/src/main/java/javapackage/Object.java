package javapackage;

import java.util.ArrayList;

public class Object {
	public void object1() {
		
		System.out.println("Object one printed");
	}

public void object2() {
		
		System.out.println("Object two printed");
	}
private void inj(int b) {
	System.out.println(b);
}

	public static void main(String[] args) {
		// Java is object oriented programming language
		// everything in Java associated with Class and object
		ArrayList <String> a=new ArrayList();
		a.add("bangladesh");
		a.add("India");
		System.out.println(a);
		a.size();
		System.out.println(a.size());
		Object galib=new Object();
  
     galib.inj(3);
     
     Mymethod clear=new Mymethod();
     clear.method1();
     clear.math(8);
     clear.math(7);
     
     Modifier cons=new Modifier();
     cons.Moddefault();
     cons.Modpublic();
     Constructor2 two=new Constructor2(3.1,"toyota",5);
  
     
     
	}

}
