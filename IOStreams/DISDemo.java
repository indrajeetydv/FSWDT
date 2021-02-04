import java.io.*;
public class DISDemo{
	public static void main(String[] args) throws FileNotFoundException,IOException{
		FileInputStream fis=new FileInputStream("bbc1.txt");
		
		DataInputStream dis=new DataInputStream(fis);
		
		/*dis.readInt();
		dis.readFloat();
		dis.readChar();
		dis.readBoolean();*/

		System.out.println(dis.readInt());
		System.out.println(dis.readFloat());
		System.out.println(dis.readChar());
		System.out.println(dis.readBoolean());
	}
}