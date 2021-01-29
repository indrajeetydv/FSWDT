public class HDBCBank implements Bank{
	double balance;
	
	public void deposit(double amount) throws InvalidAmountException{
		if(amount<=0){
			throw new InvalidAmountException(amount+"is invalid amount");
		}
		balance=balance+amount;
	}

	public double withdraw(double amount) throws InsufficientAmountException{

		if(balance<amount){
			throw new InsufficientAmountException("Insufficient Funds");
		}
		balance=balance-amount;
		return balance;
	}

	public void balanceEnquiry(){
		System.out.println("Current Balance: "+balance);
	}
}