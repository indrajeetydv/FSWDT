import java.util.*;
class Sample{
	public void division(String a, String b) throws ArithmeticException,NumberFormatException{
		int x1=Integer.parseInt(a);
		int x2=Integer.parseInt(b);
		int c=x1/x2;
		System.out.println("Result: "+c);
	}

}

public class SampleTest{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first value:");
		String s1=sc.nextLine();
		System.out.println("Enter Second value:");
		String s2=sc.nextLine();

		Sample s=new Sample();

		try{
			s.division(s1,s2);
		}catch(ArithmeticException exp){
			System.out.println("Don't enter zero for denominator");
		}catch(NumberFormatException nfe){
			System.out.println("Only enter integer value");
		}


	}
}