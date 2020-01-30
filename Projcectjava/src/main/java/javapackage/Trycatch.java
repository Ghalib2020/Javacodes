package javapackage;

public class Trycatch {

	public static void main(String[] args) {
		/*try and catch block to handle exception. code would be inside the try and
		 *  we are gonna handle exception in catch block
		syntax:
		try{
		code/body;
		}
		
		catch(Exception e){
		exception handle;
		}
		*/
		try {	
  			int Array[]= {1,3,5,7,9};
		    System.out.println(Array[2]);
	        System.out.println(Array[8]);
		}
		catch(Exception e) {
			System.out.println("error1");
		}
		
		finally 
		{
			System.out.println("dont care i am gonna run");
		}
	}
	
	
}
