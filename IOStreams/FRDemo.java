import java.io.*;

public class FRDemo{
	public static void main(String[] args) throws FileNotFoundException,IOException{
		FileReader fr=new FileReader("ps.txt");

		int data;
		while((data=fr.read())!=-1){
			System.out.println(data+"...");
			System.out.println((char)data);
		}
	}
}