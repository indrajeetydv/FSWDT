class A{
	static void m1(){
		System.out.println(" A m1 ");
	}

	void m2(){
		System.out.println(" A m2 ");
	}

	static void m3(){
		System.out.println(" A m3 ");
	}

	int m3(String s){
		System.out.println(" A m3 String-args");
		return 50;
	}


	

	//void  m3(float f,int x){}
}

class B extends A{
	static void m1(){
		System.out.println(" B m1 ");
	}

	void m2(){
		System.out.println(" B m2 ");
	}

	void  m3(float f,int x){
		System.out.println(" B m3 float,int-args");
	}

	
}

public class ABTest{
	public static void main(String[] args){
		B b=new B();
		b.m1();// B m1
		b.m2(); // B m2
		b.m3(); // A m3
		b.m3("abc");// A m3 String-args
		b.m3((float)45.3,67);//B m3 float,int-args
		b.m3(45.3f,67);//B m3 float,int-args


		A a=new B();
		a.m1();// A m1
		B.m1();//B m1
		a.m2();// B m2
		a.m3();// A m3
		a.m3("abc"); //A m3 String-args
		a.m3(45.3f,67);//B m3 float,int-args


	}
}