public class Example{
	//local variables without modifier
	static void m1(int a, int b){
		//
		int result=a+b;
		System.out.println("Result: "+result);
	}

	//local variables with modifier
	static void  m2(final int a, final int b){
		int result=a+b;
		System.out.println("Result: "+result);
	}

	//invalid method
	/*void  m3(public  int a){
		System.out.println("Value of a: "+a);
	}*/

	//extra point
	static void m4(){
		//declare a variable
		int a;
		//error: variable a might not have been initialized
		//at method level we can't use variable without intialization
		System.out.println("Value of a: "+a);

	}



	public static void main(String[] args){
		m1(10,20);
		m2(30,40);
		//m3(10);
		m4();
	}
}