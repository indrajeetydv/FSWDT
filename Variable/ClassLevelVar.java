public class ClassLevelVar{
	//non-static or instance variable
	int x=30;
	int y=40;

	//static variable
	static int a=10;
	static int b=20;

	public static void main(String[] args){
		//local variable
		int p=50;
		int q=60;

		System.out.println("a: "+a);
		System.out.println("b: "+b);

		// non-static variable x cannot be referenced from a static context
	   /* System.out.println("x: "+x);
		System.out.println("y: "+y);*/

		ClassLevelVar  var=new ClassLevelVar();
		System.out.println("x: "+var.x);
		System.out.println("y: "+var.y);


		System.out.println("p: "+p);
		System.out.println("q: "+q);

		

	}
}