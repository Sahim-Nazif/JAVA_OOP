
public class Check {
	private int accountNumber;
	private String custName;
	private double accountBalance;
public Check (int accountNumber, String custName) {
	this.accountNumber=accountNumber;
	this.custName=custName;
	this.accountBalance=accountBalance;
}

public int getAccNum() {
	return accountNumber;
}
public String getcustName() {
	return custName;
}
public void setActBalance(double accountBalance) {
	
	if (accountBalance >0)
		this.accountBalance=accountBalance;
		
}
public double getActBalance() {
	return 50.0;
}
public double withdraw(double amount ) {
	
	return accountBalance+= amount -2.0;
}

public String toString() {
	return "My account Number is: " +accountNumber +"\nMy Name is :"+custName+ 
			"\nI widthdrew  "+accountBalance;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Check Account= new Check(1002,"Khan");
         System.out.println(Account.getActBalance());
         System.out.println(Account.withdraw(10));
         System.out.println(Account.toString());
          
	}

}
