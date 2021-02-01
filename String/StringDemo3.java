public class StringDemo3{
	public static void main(String[] args){
		StringBuffer s1=new StringBuffer("a");
		StringBuffer s2=s1.append("b");


		System.out.println(s1);//a
		System.out.println(s2);//ab
		System.out.println(s1==s2);//true

		s2.append("c");
		System.out.println(s2);//abc
		
	}
}