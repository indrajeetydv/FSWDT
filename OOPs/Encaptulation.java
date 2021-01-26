class Bank{
	private double balance;

	Bank(){
		//super("");
		System.out.println("");
		
	}
	//getter and setter method
	public double getBalance(){
		//add validation logic, to check data is correct or not
		if(balance>0)
			return balance;
		else
			return -1;
			
	}

	public void setBalance(double balance){
		this.balance=balance;
	}

}

public class Encaptulation{
	public static void main(String[] args){
		Bank bank=new Bank();
		bank.setBalance(1000);
		System.out.println(bank.getBalance());

		Bank bank1=new Bank();
		//insufficient amount
		bank1.setBalance(-100);
		System.out.println(bank1.getBalance()==-1?"U don't have sufficient Balance":bank1.getBalance());
		//deposit money
		bank1.setBalance(100);
		System.out.println(bank1.getBalance()==-1?"U don't have sufficient Balance":bank1.getBalance());

	}
}