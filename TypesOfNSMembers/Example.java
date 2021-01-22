public class Example{
	int x=10;
	int y=20;

   public static void main(String[] args){
		Example e1=new Example();
		Example e2=new Example();

		System.out.println("x= "+e1.x+" y= "+e1.y);// 10 20
		System.out.println("x= "+e2.x+" y= "+e2.y);// 10 20

		e2.x=30;
		e2.y=40;
		System.out.println("x= "+e1.x+" y= "+e1.y);//  10 20
		System.out.println("x= "+e2.x+" y= "+e2.y);// 30 40


		Example e3=null;
		System.out.println("x= "+e3.x+" y= "+e3.y);//  10 20

	}
	
}