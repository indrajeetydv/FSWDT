import java.io.*;
public class BankTransaction{
	public static void main(String args[]) throws FileNotFoundException,IOException{
		Bank acct=new Bank();

		acct.setAcctNo(1112);
		acct.setUserName("rajat");
		acct.setPassword("admin");


		System.out.println(acct);

		FileOutputStream fos=new FileOutputStream("BankAccountInfo.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);

		oos.writeObject(acct);

		System.out.println("Object written to file");



	}

}