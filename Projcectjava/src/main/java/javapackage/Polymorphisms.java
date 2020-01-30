package javapackage;

public class Polymorphisms{
	void method1(double d,String c,int n) {
		System.out.println(d +" "+c+" "+n);
	}
	
	protected  void method1(double d,String c,int n,double f) {
		System.out.println(d +" "+c+" "+n);
	}
	public void method1(double d,String c) {
		System.out.println(d +" "+c);
	}
protected  void fbsignup(String firstname,String Lastname, int contactinfo) {
	
}
public void fbsignup(String firstname,String Lastname) {
	
}


	public static void main(String[] args) {

		/*
		 * Polymorphism has two types, 1.Method overloading 2.Method overriding
		 * 1.Method overloading: Same method name but different parameters/signatures
		 * 2.Method overriding :It has to be doing something with parent and child relationship,4
		 * if child method wants to have the same method from the parent class then child class 
		 can overwrite the method.
		 */

	}

}
