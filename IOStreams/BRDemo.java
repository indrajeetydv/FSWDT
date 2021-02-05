import java.io.*;

public class BRDemo{
	public static void main(String[] args) throws FileNotFoundException,IOException{
		BufferedReader br=new BufferedReader(new FileReader("ps.txt"));

		String str;
		while((str=br.readLine())!=null){
			
			System.out.println(str);
		}
	}
}