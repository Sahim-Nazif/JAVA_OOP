import java.util.*;

public class BasePlusCommission {
	private int employeeID;
	private String fname;
	private String lname;
	private double baseSalary;
	private double grossSalary;
	private double commissionRate;

public BasePlusCommission(int employeeID, String fname,String 
		lname,double baseSalary,double grossSalary, double commissionRate) {
	this.lname=lname;
	this.grossSalary=grossSalary;
	this.commissionRate=commissionRate;
	this.employeeID=employeeID;
	this.fname=fname;
	this.baseSalary=baseSalary;
}

public BasePlusCommission(int employeeID, String fname,double baseSalary) {
	this.employeeID=employeeID;
	this.fname=fname;
	this.baseSalary=baseSalary;

}


public  int getEmpid() {
	return employeeID;
}
public String getFname() {
	return fname;
}
public String getlname() {
	return lname;
}
public double setSal(double baseSalary) {
	this.baseSalary=baseSalary;
	return 200.0;
}
public double getSal() {
	return baseSalary;
}
public void setCommision(double commissionRate) {
	if (commissionRate <= 0.1 || commissionRate >=1.0) {
		throw new IllegalArgumentException("Commission must be >0.0 and <1.0");
	}
	
	this.commissionRate=commissionRate;
}
public double getCommission() {
	return commissionRate;
}
public void setGrossSalary(double grossSalary) {
     if (grossSalary<0.0) {
    	 throw new IllegalArgumentException("Gross salary mbust be >=0.0");
     }
      this.grossSalary=grossSalary;
}
public double getGrossSalary() {
	return grossSalary;
}
public double earnings() {
	return commissionRate*grossSalary+baseSalary;
}
public String toString() {
	return employeeID + fname +lname +baseSalary+grossSalary+commissionRate;
}
	public static void main(String[] args) {
	
		BasePlusCommission emp=new BasePlusCommission(304412, "Sahim", "Khan",1, 3012,0.1);
	
		emp.setGrossSalary(312);
		System.out.println("Employee ID is :" + emp.getEmpid());
		System.out.println("Employee Firstname is :" + emp.getFname());
		System.out.println("Employee Lastname :" + emp.getlname());
		System.out.printf("Employee Base Salary is $%,.2f\n  " , emp.getSal());
		System.out.printf("Employee Gross Salary is $%,.2f\n ", emp.getGrossSalary());
		System.out.printf("Employee commission is $%.2f\n " , emp.getCommission());
		System.out.printf("Employee's Total Earning is $%,.2f\n",emp.earnings());
		
		
	}


}
 