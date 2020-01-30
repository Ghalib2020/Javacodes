package javapackage;

public class Constructorfruits {
	
	String fruit ;
	int b;

	public Constructorfruits(String fruit1,int b1) {
	fruit=fruit1;
		b=b1; 
		
		
	}
	

	public static void main(String[] args) {
		Constructorfruits apple=new Constructorfruits("mango",5);
		System.out.println(apple.b+apple.fruit);


	}

}
