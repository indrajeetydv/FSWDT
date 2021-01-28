public class Example1{
	public static void main(String[] args){
		try{
			System.out.println("In try");
		}catch(Exception e){
			System.out.println("In Catch");
		}finally{
			System.out.println("In finally");
		}

		System.out.println("After try/catch/finally");
	}
}