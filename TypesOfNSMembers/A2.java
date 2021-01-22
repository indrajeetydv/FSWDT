class A2{
	int x=10;


	A2(){
		//this(10);
		System.out.println("A2 non-parameterized constructor");
		
	}

	A2(int i){
		this();
		System.out.println("A2 parameterized constructor");
	}

	public static void main(String[] args){
		//A2 a=new A2();
		A2 a=new A2(10);
		
	}
}
