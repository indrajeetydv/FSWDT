import java.io.*;
public class FOSDemo{
	public static void main(String[] args) throws FileNotFoundException,IOException{
		FileOutputStream fos=new FileOutputStream("bbc.txt",true);
		fos.write('d');
		fos.write('e');
		fos.write(102);

		
		//fos.write("FSWDT");
		fos.write(new byte[]{12,14,120});

		System.out.println("Data written to file");
	}
}