package javapackage;

public class Constructor {
	double a; //we have created a class attribute
	
	public Constructor() { //created a class constructor for the class "Constructor"
		a=2.1; //set the initial value for the class attribute a
		
		
	} 	
	

	public static void main(String[] args) {
		/* constructor is special type of method, that is used to initialize objects
		 * the constructor is called when a object of a class is created
		 * also it can be set to initial value of attribute
		 * constructor name should be the same as class name 
		 * there are 2 types of constructor 1 Default constructor (no argument) 2. Parameterized constructor
		 
		 */
	Constructor cons=new Constructor();// created an object for class constructor
	System.out.println(cons.a);
	


	}

}
