public class Example7{
	public static void main(String[] args){
		int a=m1();
		System.out.println(a);
	}

	static int m1(){   
	   try{
			System.out.println("In try");
			System.out.println(10/0);
		}catch(ArithmeticException e){
			System.out.println("In Catch");
		}finally{
			System.out.println("In finally");
			return 30;
		}
	}
}

