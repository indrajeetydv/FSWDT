import java.io.*;
public class FISDemo{
	public static void main(String[] args) throws FileNotFoundException,IOException{
		FileInputStream fis=new FileInputStream("bbc.txt");

		int i;
		while((i=fis.read())!=-1){
			System.out.println(i+"..."+(char)i);
			
		}
		

		
	}
}