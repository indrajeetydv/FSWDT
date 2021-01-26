class A13{
	static  void m1(){
		System.out.println("A13 m1 ");
	}

	void m2(){
		System.out.println("A13 m2 ");
		m1();
	}
}

class B13 extends A13{
	static void m1(){
		System.out.println("B13 m1");
	}

	public static void main(String args[]){
		B13 b=new B13();
		b.m1();//B12 m1
		b.m2();//A13 m2 
		       //A13 m1 

		A13 a=new B13();
		a.m1();// A13 m1
		a.m2();// A13 m2
		       // A13 m1
	}
}