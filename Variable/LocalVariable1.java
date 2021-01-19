public class LocalVariable1{
	//
	static int c;
	public static void main(String[] raj){
		int a=10;
		int b;

		System.out.println("a: "+a);//10
		//variable b might not have been initialized
		//Local variables should not be accessed without initialization
		//System.out.println("b: "+b);
		System.out.println("c: "+c);


	}

}