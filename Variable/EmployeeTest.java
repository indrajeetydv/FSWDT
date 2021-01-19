public class EmployeeTest{

	public static void main(String[] args){
		Employee emp1=new Employee("Vinay","Singh");
		System.out.println("EMployee First Name: "+emp1.fName);
		System.out.println("EMployee Last Name: "+emp1.lName);

		System.out.println("\n******========************");
		Employee emp2=new Employee("Rajat","Singh");
		System.out.println("EMployee First Name: "+emp2.fName);
		System.out.println("EMployee Last Name: "+emp2.lName);


		System.out.println("\n******========************");
		Employee emp3=new Employee("Pavan","Kumar");
		System.out.println("EMployee First Name: "+emp3.fName);
		System.out.println("EMployee Last Name: "+emp3.lName);
	}
}