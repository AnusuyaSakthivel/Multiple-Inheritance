package org.sample;

public class EmployeeInfo implements AxixBank,ICICIBank {

	@Override
	public void savings() {
	System.out.println("Employee Savings is:10%");
		
	}

	@Override
	public void loanInterest() {
	System.out.println("Employee Loan Interest is:11%");
		
	}
	
	@Override
	public void educationLoanInterest() {
	System.out.println("Employee  Education Loan Interest is:12%");
		
	}

	@Override
	public void fixedDeposit() {
	System.out.println("Employee fixed Deposit is:13%");
		
	}
public static void main(String[] args) {
	EmployeeInfo e = new EmployeeInfo();
	e.educationLoanInterest();
	e.fixedDeposit();
	e.loanInterest();
	e.savings();
	e.educationLoan();
}
}
