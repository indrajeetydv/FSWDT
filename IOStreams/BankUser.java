import java.io.*;
public class BankUser{
	public static void main(String args[]) throws Exception{
		
		FileInputStream fis=new FileInputStream("BankAccountInfo.txt");
		ObjectInputStream oos=new ObjectInputStream(fis);

		Bank bank=(Bank)oos.readObject();

		//System.out.println(bank.getAcctNo()+" "+bank.getUserName()+" "bank.getPassword());


		System.out.println(bank);



	}

}