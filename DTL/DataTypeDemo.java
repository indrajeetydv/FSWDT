public class DataTypeDemo{
	public static void main(String[] args){

		int i=2147483647;
		System.out.println(i);


		
		// error: integer number too large:
		//int i1=2147483648;
		//System.out.println(i1);

		//incompatible types: possible lossy conversion from long to int
		//int i2=2147483648L;
		//System.out.println(i2);


		//expression
		byte b=10*2;
		System.out.println(b);

		//incompatible types: possible lossy conversion from int to byte
		//byte b1=10*20;

		byte b1=10;
		byte b2=20;
		//incompatible types: possible lossy conversion from int to byte
		//10*20=200
		//max byte range:127
		//max int range: 2147483647
		byte b3=b1+b2;

		//incompatible types: possible lossy conversion from int to short
		//10*20=200
		//short s =b1*b2;
		

		short s1 =(short)(b1*b2);
		System.out.println(s1);

	}



}