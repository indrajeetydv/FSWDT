import java.io.*;
public class DOSDemo{
	public static void main(String[] args) throws FileNotFoundException,IOException{
		FileOutputStream fos=new FileOutputStream("bbc1.txt");

		DataOutputStream dos=new DataOutputStream(fos);
		
		dos.writeInt(97);// 4 byte
		dos.writeFloat(97.34f);// 4 byte
		dos.writeChar('A');// 2 byte
		dos.writeBoolean(true);//// 1 byte
		dos.writeUTF("FSWD");//8 byte


		dos.

		System.out.println("Data written to file");
	}
}