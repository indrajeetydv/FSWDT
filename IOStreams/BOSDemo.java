import java.io.*;
public class BOSDemo{
	public static void main(String[] args) throws FileNotFoundException,IOException{
		FileOutputStream fos=new FileOutputStream("bos.txt");
		BufferedOutputStream bos=new BufferedOutputStream(fos);

		String str="FullStack Web Dev training";
		byte[] b= str.getBytes();

		bos.write(b);
		bos.flush();

		System.out.println("Data written to file");
	}
}