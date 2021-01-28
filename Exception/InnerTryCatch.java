public class InnerTryCatch{
	public static void main(String[] args){
		try{
			System.out.println("In outer try");
			try{
				System.out.println("In Inner try");
				System.out.println(10/0);
			}catch(ArithmeticException ae){
				System.out.println("In Inner catch");
			}
		}catch(ArithmeticException ae){
			System.out.println("In Outer catch");
		}
		System.out.println("After Outer try/catch");
	}
}

//In outer try
//In Inner try
//In Inner catch
//After Outer try/catch