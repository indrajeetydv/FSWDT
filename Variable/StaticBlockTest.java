public class StaticBlockTest{
	
	//SB-1 SB-2 main
	
	static{
		System.out.println("SB-1");
	}
	
	public static void main(String[] args){
		System.out.println("Main");
	}

	static{
		System.out.println("SB-2");
	}
}