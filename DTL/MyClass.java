public class MyClass{
	static void m(double x){
		System.out.println("double");
	}
	static void m(int x){
		System.out.println("int");
	}
	public static void main(String[] args){
		m(23);
	}
}