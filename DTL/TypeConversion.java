public class TypeConversion{
	public static void main(String[] args){
		//automatic conversion
		int a=10; // 4 bytes
		long l=a; // 8 bytes
		System.out.println(a);
		System.out.println(l);


		//explicit type conversion

		long l1=10;//8 bytes
		//CTE: incompatible type: PLC
		//int i1=l1;// 4 bytes
		int i1=(int)l1;// 4 bytes
		System.out.println(l1);
		System.out.println(i1);


		int i=12345;//4 byte
		short s=(short)i; // 2 byte

	}



}