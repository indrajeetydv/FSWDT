class Example{
	void m1(int i,float f){
		System.out.println("int,float m1 method");
	}

	void m1(float f,int i){
		System.out.println("float,int m1 method");
		
	}

}

class Sample {

	public static void main(String[] args){
		Example e=new Example();
		e.m1(20,34.234f);//int,float m1 method
		e.m1(34.345f,40);//float,int m1 method

		//e.m1(10,20);//CTE: ambiguous error
	}
	
}