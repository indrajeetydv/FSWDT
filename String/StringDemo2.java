public class StringDemo2{
	public static void main(String[] args){
		String s1=new String("a");
		String s2=new String("a");

		System.out.println(s1);//a
		System.out.println(s2);//a
		System.out.println(s1.equals(s2));//false
		System.out.println(s1==s2);//false
	}
}


