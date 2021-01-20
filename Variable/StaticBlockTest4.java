public class StaticBlockTest4{
	
	static int a=10;
	static int b=20;
	
	

	public static void main(String[] args){
		
		System.out.println("a: "+a);//10
		System.out.println("b: "+b);//20

		int a=40;
		System.out.println("a: "+a);//40   10

		System.out.println("a: "+StaticBlockTest4.a);//10
	}

}