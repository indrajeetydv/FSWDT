class Example3{
	public static void main(String args[]){
		System.out.println("Example3 main");
	}
}

public class Sample3 extends Example3{
	public static void main(String args[]){
		Example3.main(new String[0]);
		System.out.println("Sample3 main");
	}
}