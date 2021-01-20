public class StaticBlockTest3{
	
	//SB-1
	//m1 method
	//SB-2
	//main
	//a:10
	static{
		System.out.println("SB-1");
	}

	static int a=m1();
	
	static int m1(){
		System.out.println("m1 method");
		return 10;
	}

	public static void main(String[] args){
		System.out.println("Main");
		System.out.println("a: "+a);
	}

	static{
		System.out.println("SB-2");
	}
}