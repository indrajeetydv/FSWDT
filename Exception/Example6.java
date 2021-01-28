public class Example6{
	public static void main(String[] args){
		int a=m1();
		System.out.println(a);
	}

	static int m1(){   
	   try{
			System.out.println("In try");
			return 10;

		}catch(ArithmeticException e){
			System.out.println("In Catch");
			return 20;
		}finally{
			System.out.println("In finally");
			return 30;
		}
	}
}

      /* in try
       in finally
       remove 10,30*/

