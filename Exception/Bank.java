public interface Bank{
	public void deposit(double amount) throws InvalidAmountException;
	public double withdraw(double amount) throws InsufficientAmountException;
	public void balanceEnquiry();
}