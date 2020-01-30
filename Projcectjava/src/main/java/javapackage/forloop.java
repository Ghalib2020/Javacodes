package javapackage;

public class forloop {

	public static void main(String[] args) {
		int Array[]= {1,2,3,4,5,6,7,8,9};
		
	//there are 8 index total number 9.
		
		
	/*	for (statement1;statement2;statement3) {
		body;
	}*/
		//print all values
		
		for(int i=0;i<9;i++) { 
			//data type=int variable initialize i data 0 index; 
			//i++;i= i+1=0+1=1; i=i+1=1+1=2
		
			
			System.out.println(Array[i]);
		}
		// print all even number
		for(int i=1;i<9;i+=2) {
		System.out.println(Array[i]);
		}
		//odd number print
		for(int i=0;i<9;i+=2) {
			System.out.println(Array[i]);
			}
		}
	}

