
public class Example1{
	//void methods
	//non-parameterized method
	static void fun1(){
		System.out.println("Function-1 is called");
	}

	//non-void method
	//parameterized method
	static int fun2(byte b1,byte b2){
		//byte result=b1+b2;
		//return result;
		return b1+b2;
	}

	public static void main(String[] args){
		fun1();
		byte b1=12;
		byte b2=34;
		int y=fun2(b1,b2);
		
		System.out.println("Result = "+y);

	}
}