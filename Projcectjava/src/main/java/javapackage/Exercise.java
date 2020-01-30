package javapackage;

public class Exercise extends Ex2 {
	public void fbsignup(String firstname,String Lastname) {
		System.out.println(firstname+Lastname);
	}

	public static void main(String[] args) {
		Exercise obj=new Exercise();
		obj.fbsignup("n", "m");
		try {
			int A []= {1,2,3,4,5};
			System.out.println(A[2]);
		}
		catch(Exception e)
		{
			System.out.println("error 2");
		}
		finally {
			System.out.println("hoise");
		}
		}}