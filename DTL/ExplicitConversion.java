public class ExplicitConversion{
	public static void main(String[] args){
		int i=130;//4 bytes
		short s=i;//2 bytes  range:-32,768 to 32767
		//short s=(short)i;//2 bytes  range:-32,768 to 32767


		System.out.println(i);//130
		System.out.println(s);//130


		short s1=(byte)i;// -128 to 127

		//short 2 bytes
		//byte 1 bytes

		//minValue+(result-maxValue-1)
		//-126


		//1. within cast operator we can write either same data type which is available in destination or less than destination data type
		//2. conversion will happned based on cast operator
		System.out.println(s1);//130  -126
	}
}