public class Account{
	//
	public String firstName;
	public String lastName;
	public static int acctNumber;

	Account(String firstName,String lastName){
		this.firstName=firstName;
		this.lastName=lastName;
	}

	Account(){
		System.out.println("Non-parametrized");
	}

	public String getFirstName(){
		return firstName;
	}

	public String getLastName(){
		return lastName;
	}

	public int getAcctNumber(){
		return acctNumber;
	}

	public static void setAcctNumber(int acctNumber){
		Account.acctNumber=acctNumber;
	}
}