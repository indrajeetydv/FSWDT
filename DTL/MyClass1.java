public class MyClass1{
	static void m(double x){
		System.out.println("double");
	}
	static void m(float x){
		System.out.println("float");
	}
	public static void main(String[] args){
		//because float consumes less memmory
		m(23);//float
	}
}