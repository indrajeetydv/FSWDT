public class Divison{
	public static void main(String[] args){

		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		//Class.forName("A");
		try{
			int result=a/b;

			System.out.println(result);
		}catch(ArithmeticException e){
			System.out.println("Please do not pass second value as ZERO");
		}
		
	}
}