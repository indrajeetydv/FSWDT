import java.io.*;
class FileCopy{
	public static void copy(String srcFile, String destFile) throws FileNotFoundException,IOException{
		FileInputStream fis=new FileInputStream(srcFile);
		FileOutputStream fos=new FileOutputStream(destFile);

		int i;
		while((i=fis.read())!=-1){
			fos.write(i);
		}

		System.out.println("Data has written to "+ destFile);
	}
}

public class Test{
	public static void main(String[] args) throws FileNotFoundException,IOException{
		FileCopy.copy(args[0],args[1]);
	}
}