class Example2{
	static void m1(){
		System.out.println("Example2 m1");
	}
}

public class Sample2 extends Example2{
	static void m1(){
		Example2.m1();
		System.out.println("Sample2 m1");
	}

	public static void main(String args[]){
		Sample2 s=new Sample2();
		s.m1();
	}
}