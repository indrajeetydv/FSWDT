class A{
	int x=10;

	{
		System.out.println("A NSB");
		System.out.println("x: "+x);
	}

	A(){
		System.out.println("A constructor");
		x=5;
	}

	public static void main(String[] args){
		A a=new A();
		System.out.println("x: "+a.x);
	}
}
