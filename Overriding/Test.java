import java.io.*;
class A{
	public void m1() throws Exception{
		System.out.println("Overridden method: m1");
	}
}

class B extends A{
	public void m1() throws ClassNotFoundException{
		System.out.println("Overriding method: m1");
	}
}

public class Test{

/*The new method definition can only throw all or none, or a subset of the checked exceptions 
(including their subclasses) that are specified in the throws clause of the overridden method 
in the superclass.
*/

/*OR*/

/*	The overriding method must not throw checked exceptions that are new 
	for those are declared by overridden method i.e. 
		overriding method can only declare to throw that exception or its subclass.
*/
	public static void main(String[] args) throws Exception{
		A a=new B();
		a.m1();
	}
}
