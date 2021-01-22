//fully 
import myPackage.*;

public class ImportStmtTest{
	public static void main(String[] args){
		Human obj=new Human("Rajat","Singh",22);
		Human obj1=new Human("Vinay","Singh",22);

		System.out.println("First Name: "+obj.fName);
		System.out.println("Last Name: "+obj.lName);
		System.out.println("Age: "+obj.age);

		System.out.println("\n********==============*************");
		System.out.println("First Name: "+obj1.fName);
		System.out.println("Last Name: "+obj1.lName);
		System.out.println("Age: "+obj1.age);

	}
}