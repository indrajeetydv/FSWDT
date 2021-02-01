import java.io.*;
class A1{
	public void m1(){
		System.out.println("Overridden method: m1");
	}
}

class B1 extends A1{
	public void m1() throws ArithmeticException{
		System.out.println("Overriding method: m1");
	}
}

public class Test1{

	/*The overriding method can throw any unchecked exception (Runtime), 
regardless of whether the overridden method declares the exception.
*/
	public static void main(String[] args){
		try{
		A1 a=new B1();
		a.m1();
	  }catch(ArithmeticException e){
	  	System.out.println(e.getMessage());
	  }
	}
}

