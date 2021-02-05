import java.io.*;

public class InputStreamReaderDemo{
	public static void main(String[] args) throws FileNotFoundException,IOException{
		InputStreamReader isr=new InputStreamReader(new FileInputStream("ps.txt"));;

		int data;
		while((data=isr.read())!=-1){
			System.out.println((char)data);
		}
	}
}