class Example{
	//overridden method
	void m1(){
		System.out.println("Example: m1 method");
	}

	void m2(){
		System.out.println("Exmaple: m2 method");
	}
}


public class Sample extends Example{
	//overriding
	void m1(){
		System.out.println("Sample: m1 method");
	}

	public static void main(String[] args){
		//CTP
		Sample s=new Sample();
		s.m1();//Sample: m1 method
		s.m2();//Exmaple: m2 method

		Example e=new Example();
		e.m1();//Example: m1 method
		e.m2();//Exmaple: m2 method

		//RTP
		Example e1=new Sample();
		e1.m1();//Sample: m1 method
		e1.m2();//Exmaple: m2 method
	}
}