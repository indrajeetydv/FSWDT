public class FinalVar{
	static int a=10;
	static final int b=20;

	int x=30;
	final int y=40;



	public static void main(String[] args){
		int p=50;

		final int q=60;
		//cannot assign a value to final variable q
		//q=80;

		System.out.println("a: "+a);
		System.out.println("b: "+b);

		// non-static variable x cannot be referenced from a static context
	   /* System.out.println("x: "+x);
		System.out.println("y: "+y);*/

		FinalVar  var=new FinalVar();
		System.out.println("x: "+var.x);
		System.out.println("y: "+var.y);


		System.out.println("p: "+p);
		System.out.println("q: "+q);



	}
}