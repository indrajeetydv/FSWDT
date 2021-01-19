public class Employee{
	String fName;
	String lName;

	Employee(){
		System.out.println("Default constructor");
	}

	Employee(String fName, String lName){
		this.fName=fName;
		this.lName=lName;
	}
	
}