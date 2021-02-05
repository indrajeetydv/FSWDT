import java.io.*;
public class BISDemo{
	public static void main(String[] args) throws FileNotFoundException,IOException{
		FileInputStream fis=new FileInputStream("bos.txt");
		BufferedInputStream bis=new BufferedInputStream(fis);

		int i;
		while((i=bis.read())!=-1){
			System.out.println((char)i);
		}
		
	}
}