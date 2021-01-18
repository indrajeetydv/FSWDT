public class AccountTest{
	public static void main(String[] args){
		


		Account jointAcct=new Account("Rajat","Vinay");

		jointAcct.setAcctNumber(111220033);

		System.out.println("FName: "+jointAcct.firstName);
		System.out.println("LName: "+jointAcct.lastName);
		System.out.println("AcctNo: "+jointAcct.acctNumber);

		System.out.println("\n*******============**********");

		Account jointAcct1=new Account("Raj","Vijay");
		System.out.println("FName: "+jointAcct1.firstName);
		System.out.println("LName: "+jointAcct1.lastName);
		System.out.println("AcctNo: "+jointAcct1.acctNumber);


		System.out.println("\n*******============**********");
		Account jointAcct2=new Account("Tom","Jerry");
		System.out.println("FName: "+jointAcct2.firstName);
		System.out.println("LName: "+jointAcct2.lastName);
		System.out.println("AcctNo: "+jointAcct2.acctNumber);



	}
}