import java.io.*;
public class Bank implements Serializable{
	private long acctNo;
	private String userName;
	private String password;


	public long getAcctNo(){
		return acctNo;
	}

	public void setAcctNo(long acctNo){
		this.acctNo=acctNo;
	}

	public String getUserName(){
		return userName;
	}

	public void setUserName(String userName){
		this.userName=userName;
	}

	public String getPassword(){
		return password;
	}

	public void setPassword(String password){
		this.password=password;
	}


	public String toString(){
		return "acctNo: "+acctNo+"\tUser Name: "+userName+"\tpassword: "+password;
	}
}