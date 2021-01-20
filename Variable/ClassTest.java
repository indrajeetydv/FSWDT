import java.lang.reflect.*;

public class ClassTest{
	public static void main(String[] args){
		Account a=new Account();
		Class c=a.getClass();

		System.out.println("Class Information: "+c);



		Method[] m=c.getDeclaredMethods();
		System.out.println("\n*********Method Information*********** ");
		for(int i=0;i<m.length;i++)
			System.out.println(m[i]);

		Field[] f=c.getDeclaredFields();
		System.out.println("\n*********Field Information*********** ");
		for(int i=0;i<f.length;i++)
			System.out.println(f[i]);


	}
}