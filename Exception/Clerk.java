import java.util.*;
import java.io.*;
public class Clerk{
	public static void main(String[] args){
		    try{
				//BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
				Scanner sc=new Scanner(System.in);

				Bank b=new HDBCBank();

				String option="";
				do{
					System.out.println("1.Deposit");
					System.out.println("2.withdraw");
					System.out.println("3.Balance Enquiry");

					System.out.println("Enter Option:");
					//option=sc.readLine();
					option=sc.nextLine();

					switch(option){
						case "1":{
							System.out.println("Enter deposit amount:");
							String s=sc.nextLine();//sc.readLine();
							double amount=Double.parseDouble(s);
							b.deposit(amount);
							b.balanceEnquiry();
							break;
						}
						case "2":{
							System.out.println("Enter Withdraw amount:");
							String s=sc.nextLine();//sc.readLine();
							double amount=Double.parseDouble(s);
							b.withdraw(amount);
							b.balanceEnquiry();
							break;
						}
						case "3":{
							b.balanceEnquiry();
							break;
						}
						default:
							System.out.println("Invalid Option:");
					}
					System.out.println("Do you want to continue(Yes/No)");
					option=sc.nextLine();//sc.readLine();
				}while(option.equalsIgnoreCase("Yes"));
			}catch(InvalidAmountException e){
				System.out.println(e.getMessage());
			}catch(InsufficientAmountException e){
				System.out.println(e.getMessage());
			}/*catch(IOException e){
				System.out.println(e.getMessage());
			}*/
	}
}