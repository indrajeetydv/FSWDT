class A3{
	int x=10;


	A3(){	
		System.out.println("A3 non-parameterized constructor");
	}

	A3(int i){
		System.out.println("A3 parameterized constructor");
	}

	
}

class B3 extends A3{
	B3(){
		super(10);
		System.out.println("B3 non-parameterized constructor");
	}

	B3(int i){

		System.out.println("B3 parameterized constructor");
	}

	public static void main(String[] args){
		B3 b=new B3();		
	}
}
