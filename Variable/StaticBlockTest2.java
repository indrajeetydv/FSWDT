public class StaticBlockTest2{
	
	//SB 
	//m1 method
	//main
	//10
	
	static{
		System.out.println("SB");
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


}