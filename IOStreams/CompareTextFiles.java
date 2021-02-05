import java.io.*;

public class CompareTextFiles
{
	public static void main(String[] args) throws Exception{
		BufferedReader br1=new BufferedReader(new FileReader("File1.txt"));
		BufferedReader br2=new BufferedReader(new FileReader("File2.txt"));

		String line1=br1.readLine();
		String line2=br2.readLine();

		int counter=1;
		boolean flag=true;

		while(line1!=null || line2!=null){

			if(!line1.equalsIgnoreCase(line2)){
				flag=false;
				break;
			}

			line1=br1.readLine();
			line2=br2.readLine();
			counter++;

		}

		if(flag){
			System.out.println("These two files have same content ");
		}else{
			System.out.println("These two files doesn't have same content at line no: "+counter);
		}

	}
}