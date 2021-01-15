
public class Example{
	//static method
	static void m1(int a){
		System.out.println("m1 method: "+a);
	}

	int add(int a, int b){
		return a+b;
	}

	//non-static method
	void m2(){
		int result=add(10,12);
		System.out.println("m2 method: "+result);
	}

	public static void main(String[] args){

		m1(10);	
		//non-static method m2() cannot be referenced from a static context
		//m2();

		//
		Example ex=new Example();
		ex.m2();

	}
}