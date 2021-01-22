class A1{
	int x=10;

	{
		System.out.println("A1 NSB");
		System.out.println("x: "+x);
	}

	A1(){
		super();
		System.out.println("A1 constructor");
		x=5;
	}

	
}

class B extends A1{
	int y=20;
	{
		System.out.println("B NSB");
		System.out.println("y: "+y);
	}
	B(){

		super();
		System.out.println("B constructor");
		y=6;
	}

	public static void main(String[] args){
		System.out.println(" Bs main method ");
		
		B b=new B();
		System.out.println("x: "+b.x);
		System.out.println("x: "+b.y);

	}


}