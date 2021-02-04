interface I1{
	 public static void m1();
}

class I1Impl implements I1{
	 public void m1(){
		System.out.println("interface implementation class");
	}
}

public class Test1{
	public static void main(String[] args){
		I1 i=new I1Impl();
		i.m1();
	}
}