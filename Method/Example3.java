public class Example3{
	static void fun(byte b1){
		System.out.println("funByte= "+b1);
		
	}
	static void fun(short b1){
		System.out.println("funShort= "+b1);
		
	}
	static void  fun(int b1){
		System.out.println("funInt= "+b1);
		
	}

	static byte  fun1(int b1){
		System.out.println("funInt= "+b1);
		return (byte)b1;
		
	}

	static void  fun(long b1){
		System.out.println("funLong= "+b1);
		
	}

	public static void main(String[] args){
		fun(120);
		fun(121L);
		System.getProperty("sun.arch.data.model");
		
	}
}