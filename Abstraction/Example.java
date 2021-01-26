/*class Example{
	//missing method body, or declare abstract
	void m1();
}*/

/*//Example is not abstract
class Example{
	
	abstract void m1();
}*/


/*//Working Example
abstract class Example{
	
	abstract void m1();

	public static void main(String args[]){
		System.out.println("abstract class example");
	}
}
*/


/*abstract class Example{
	
	abstract void m1();

	public static void main(String args[]){
		// Example is abstract; cannot be instantiated
		Example e=new Example();
	}
}*/


abstract class Example{
	
	abstract void m1();

	static int a=10;

	public static void main(String args[]){
		System.out.println(Example.a);
	}
}

