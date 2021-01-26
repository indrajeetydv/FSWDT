class A1{
	void m1(){
		System.out.println("A1 m1 ");
	}

	void m2(){
		System.out.println("A1 m2 ");
		m1();
	}
}

class B1 extends A1{
	void m1(){
		System.out.println("B1 m1");
	}

	public static void main(String args[]){
		B1 b=new B1();
		b.m1();//B m1
		b.m2();//A m2 
		       //B m1 

		A1 a=new B1();
		a.m1();// B m1
		a.m2();// A m2
		       // B m1
	}
}