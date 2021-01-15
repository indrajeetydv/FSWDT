public class ClassLevelVarExample{
	//class level var
	//declare a variable
	//non-static varaible
	int a;


	//static variable
	static int b;

	
	public static void main(String[] args){
		//non-static variable a cannot be referenced from a static context
		//System.out.println("Value of a: "+a);

		//accessing the static variable
		System.out.println("Value of b: "+b);

		ClassLevelVarExample ex=new ClassLevelVarExample();
		System.out.println("Value of a: "+ex.a);
	}
}