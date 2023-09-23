package in.ineuron.dto;

public class Customer {
	private Integer pin;
	private String customerName;
	private Double accountBalance= (double) 0;
	private  Integer accountNumber = 0;
	private static Integer accountHolderCount = 1;
	
	public Customer() {
		accountNumber = accountHolderCount++;	
	}
	public Integer getAccountHolderCount() {
		return accountHolderCount;
	}


	public Integer getPin() {
		return pin;
	}

	public void setPin(Integer pin) {
		this.pin = pin;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(Double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public Integer getAccountNumber() {
		return accountNumber;
	}


	@Override
	public String toString() {
		
		return "#***************************#  \nCUSTOMER "+customerName+" DETAILS :\nPin Details : " + pin +  "\nAccount Number : " + accountNumber +"  \n#***************************#";
	}

}
