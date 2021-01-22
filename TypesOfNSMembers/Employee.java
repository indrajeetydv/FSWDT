public class Employee{
	int eid=1122;
	String empName="Rajat Singh";
	String company="Google";

	public String toString(){
		//login className@HashCodevalue in hexa-decimal format
		return eid+" "+empName+" "+company;
	}

   public static void main(String[] args){
		Employee e1=new Employee();
		//className@HashCodevalue in hexa-decimal format
		System.out.println(e1);//Employee@15db9742

	}
	
}