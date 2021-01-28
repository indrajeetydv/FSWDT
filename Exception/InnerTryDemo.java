class InnerTryDemo{
	public static void main(String[] args){
		
	try{
		System.out.println("In outer try");
		try{
			system.out.println("In inner try");
			System.out.println(10/0);
		}catch(ArithmeticException exp){
			System.out.println("In inner catch");
		}
	}
	catch(ArithmeticException exp){
			System.out.println("In outer catch");
	}
	System.out.pritnln("After try/catch");
}