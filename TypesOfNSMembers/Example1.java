public class Example1{
	static int a=30;
	static int b=40;
	int x=10;
	int y=20;

   public static void main(String[] args){
		Example1 e1=new Example1();
		

		System.out.println("Accessing non-static members");
		System.out.println("x= "+e1.x+" y= "+e1.y);// 10 20
		

		System.out.println("Accessing static members");
		System.out.println("a= "+a+" b= "+b);// 30 40
		System.out.println("a= "+Example1.a+" b= "+Example1.b);// 30 40
		
		//System.out.println("a= "+null.a+" b= "+null.b);//
		System.out.println("a= "+e1.a+" b= "+e1.b);// 30 40 
		Example1 e=null;
		System.out.println("a= "+e.a+" b= "+e.b);// 
		

		
	}
	
}