public class MyClass2{
	static void m(double x){
		System.out.println("double");
	}
	static void m(short x){
		System.out.println("short");
	}
	public static void main(String[] args){
		//because float consumes less memmory
		//
		m(23);//double
	}
}