package nttit.com.Java.Projcectjava;

import javapackage.Ex2;

//If we want to get access from one class to another class in different package we have to use inheritance. To inherit we can use "extends" keyword.
//we have to import javapackage ex2 to inherit from a class which is in other package
public class Childclassinharitense extends Ex2{
	//public void fbsignup(String firstname,String Lastname) {
		//System.out.println(firstname+Lastname);
//	}
	
	public static void main(String[] args) {
	/* inharitance divided into 2 catagories, 1.Sub class(child class) 2.Superclass (parent class)
		1.Subclass: the class that inherits from another class(parent class) is sub class 
		2.Superclass: Is the class from where inherits from is called superclass.
	 * To inherit we have to us extends keyword.
	 * Why And When To Use "Inheritance"?
- It is useful for code reusability: reuse attributes and methods of an existing class when you create a new class.
		 */
		Childclassinharitense obj=new Childclassinharitense();// we have to cretae object of child class.
		obj.fbsignup("ggg", "hhh");
		obj.fbsignup(null, null, 0);
	
		
	
		
	}

}
 