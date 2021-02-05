import java.io.*;
public class PrintStreamDemo1{
	public static void main(String[] args) throws FileNotFoundException,IOException{
		PrintStream ps=new PrintStream(new FileOutputStream("ps.txt"));

		ps.print("A");
		ps.print("B");
		ps.print("C");
		System.out.println("Data is written to ps.txt file");

		System.out.println("A");
		System.out.println("B");
		System.out.println("C");



		

	}
}

