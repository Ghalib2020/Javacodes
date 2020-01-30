package javapackage;

public class Modifier {
	/*
	 * for class we use two kind of access modifier, public & default
	 * for public class we use public keyword and this class is accessable by any other classes
	 * for atributes and method there are four types modifier
	 1.public: code is accessable for all,all packages
	 2.private: code is only accessable within the decleared class 
	 3.default: code is only accessable within that package, this is used when we dont 
	 specifiy any modifier
	 4.protected:code is only accessable in the same package and sub classes.
	 */
	public void Modpublic()
	{
		
	}
	private void Modprivate(int a) {
		System.out.println(a);
		
	}
	void Moddefault() {
		
	}
	
	
	
}


