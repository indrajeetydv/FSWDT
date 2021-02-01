public class StringDemo1{
	public static void main(String[] args){
		String s1=new String("a");
		String s2=s1.concat("b");


		System.out.println(s1);//a
		System.out.println(s2);//ab
		System.out.println(s1==s2);//false

		s2.concat("c");
		System.out.println(s2);//ab
		
	}
}