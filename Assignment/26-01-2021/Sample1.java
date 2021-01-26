class Example1{
	void m1(){
		System.out.println("Example1 m1");
	}

	void m2(){
		System.out.println("Example1 m2");
	
	}

	void m3(){
		System.out.println("Example1 m3");
	}

}

public class Sample1 extends Example1{
	void m1(){
		System.out.println("Sample1 m1");
	}

	void m2(){
		super.m2();
		System.out.println("Sample1 m2");
	
	}

	public static void main(String args[]){
		Sample1 s=new Sample1();

		s.m1();
		s.m2();
		s.m3();


	}
}