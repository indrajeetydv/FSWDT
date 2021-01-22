public class Example2{
	int x;
	int y;

	Example2(/*final Example2 this,*/int x,int y){
		//final Example2 this=new Example2();
		//x=10 y=20
		this.x=x;
		this.y=y;
	}

	void m2(){
		System.out.println("x= "+this.x+" y= "+this.y);// 10 20
	}

   public static void main(String[] args){
		Example2 e=new Example2(10,20);
 //e.x
 //e.y

		
		System.out.println("x= "+e.x+" y= "+e.y);// 10 20

		e.m2();
		

		
	}
	
}