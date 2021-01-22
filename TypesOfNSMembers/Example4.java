public class Example4{
	int x=10;
	int y=20;

	void m1(Example4 e){
		//e=2020
		//this=1010
		System.out.println(x+" ****"+y);// 10 20
		this.x=30;
		this.y=40;
		e.x=30;
		e.y=40;
		System.out.println(x+" ****"+y); //30 40
	}
		
   public static void main(String[] args){
		Example4 e1=new Example4();//1010
		Example4 e2=new Example4();//2020

		System.out.println(e1.x+" ****"+e1.y); //10 20

		//1010.m1(2020)
		e1.m1(e2);

		System.out.println("======== **** ==============="); //10 20
		System.out.println(e1.x+" ****"+e1.y);//30 40 
		System.out.println(e2.x+" ****"+e2.y);// 30 40
 
	}
	
}