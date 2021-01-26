class Example{
	void add(int a, int b){
		System.out.println("Example add(int,int): "+(a+b));
	}

	void sub(int a, int b){
		System.out.println("Example sub(int,int): "+(a-b));
	}


}

public class Sample extends Example{
	void add(int a,int b){
		System.out.println("add(int,int) in Sample");
		System.out.println("The addition of "+a +" and "+b+" is : "+(a+b));
	}

	public static void main(String args[]){
		Example e=new Sample();

		e.add(10,30);
		e.sub(30,10);

		System.out.println();
		Sample s=new Sample();
		s.add(10,30);
		s.sub(30,10);

		System.out.println();
		Example e1=new Example();
		e1.add(50,90);

	}
}