class A12{
	private void m1(){
		System.out.println("A12 m1 ");
	}

	void m2(){
		System.out.println("A12 m2 ");
		m1();
	}
}

class B12 extends A12{
	void m1(){
		System.out.println("B12 m1");
	}

	public static void main(String args[]){
		B12 b=new B12();
		b.m1();//B12 m1
		b.m2();//A12 m2 
		       //A12 m1 

		A12 a=new B12();
		//a.m1();// B12 m1
		a.m2();// A12 m2
		       // A12 m1
	}
}