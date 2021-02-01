public class StringDemo5{
	public static void main(String[] args){
		String s="Java Programming language";

		//find string is empty or not
		System.out.println(s.isEmpty());//false

		//to find length
		System.out.println(s.length());//25	


		//compare to string object == and equals
		String s1=new String("abc");
		String s2=new String("abc");
		String s3=new String("Abc");

		System.out.println(s1==s2);//flase
		System.out.println(s1.equals(s2));//true

		System.out.println(s2==s3);//false
		System.out.println(s2.equals(s3));//false


		//comparing without case
		String s4=new String("A");
		String s5=new String("a");
		System.out.println(s4.equals(s5));//false
		System.out.println(s4.equalsIgnoreCase(s5));//true


		//comparing string which will return differences between string content
		String s6=new String("a");//97
		String s7=new String("A");//65
		System.out.println(s6.compareTo(s7));//32


		//print all chararcters
		char[] charArray=s.toCharArray();
		for(int i=0;i<charArray.length;i++){
			System.out.print(charArray[i]+"\t");
		}

		System.out.println("===============");

		//print value at particulat index charAt(index value)
		//"Java Programming language"//25
		
		System.out.println(s.charAt(2));

		//indexOf, lastIndexOf
		System.out.println(s.indexOf('a'));//1
		System.out.println(s.lastIndexOf('a'));//22



		//substring
		System.out.println(s.substring(5));//Programming language
		System.out.println(s.substring(5,16));//Programming

	}
}