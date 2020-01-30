package javapackage;

public class Array {

	public static void main(String[] args) {
    //Array is used to store multiple values in one variable
	/*	for (statement1;statement2;statement3)
	    {
		body;
	    }
	    Array syntax= data Type,variable name[]={value1,value2....nth no of value};
	*/
		int Array[]= {1,3,5,7,9};
		//Index starts from 0;Total Index 4 total number of value 5
		/*index0=1;
		index1=3;
		..
		index4=9;*/
		
	System.out.println(Array[2]);
	System.out.println(Array[4]);
	
	String a[]= {"toyota","bmw","nissan","ford","fiat"};
	System.out.println(a[1]);
	a[0]="mustang";// replace
	System.out.println(a[0]);
	a[3]="Jeep";//replace
	System.out.println(a[3]);
	
	
	//Array length
	
	System.out.println(a.length);
	for(int i=0;i<4;i++) {
	System.out.println(a[i]);
	}
	for (String i:a) {
		System.out.println(i);
		
	}
	
	}

}
