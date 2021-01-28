public class InnerTryCatch3{
	public static void main(String[] it){
		try{

			int a=Integer.parseInt(it[0]);
			System.out.println("a: "+a);
			try{
				int[] x=new int[a];
				System.out.println("array size: "+x.length);
			}catch(NullPointerException npe){
				System.out.println("NPE raised");
			}
			int b=10+a;
			System.out.println("b: "+b);
		}catch(ArrayIndexOutOfBoundsException aiobe){
			System.out.println("Pass alleast one integer value");
		}catch(NumberFormatException nfe){
			System.out.println("Pass only integer value");
		}
		
	}
}
