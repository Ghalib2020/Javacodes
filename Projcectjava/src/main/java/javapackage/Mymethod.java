package javapackage;

public class Mymethod {
	 // method name (argument/parameter){code/body}
	/*method is a block of code,we can pass data parameters through a method, we use method to 
	 * reuse code,that
	means we define code once and reuse many time.*/
	 
	/*for static method we dont need to create any object , we can call through method name
	 *  to see execution.
		Call a Method
		To call a method in Java, write the method's name followed by two parentheses () and 
		a semicolon;
		*/
	
public void method1() {
	System.out.println("My first method");
	}
	static void method2() {
		System.out.println("my second method");}
		
	static void mom3() {
			System.out.println("car");
		
	}
	
	
	public void vehicle(String car) {
		
		System.out.println(car);
	}

	public void math(int a) {
		System.out.println(a+ "is my number");
	}
	public void math1(double a)
	{
		System.out.println(a);
	}
	
	static int Mymethod(int number) {
		return number;
		//we created a constructor which is not a method but special type of method
		
	}
	static String Mymethod1(String bd) {
		return bd;
		//return bd;
	}
	public static void main(String[] args) {
		// 
method2();
Object galib=new Object();
galib.object1();
//mom3();
//vehicle("bmw");
//System.out.println(Mymethod(1));
//System.out.println(Mymethod1("bangladesh"))


	}

}
