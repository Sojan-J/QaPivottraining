package bankOperationAssignment;

public class BankinPersonalDetails {
	private String customerName;
	private String customerAccountNo;
	private int atmPin;
	private double accountBalance;
	private String passWord;
	private String username;

	public BankinPersonalDetails(String customerName, String customerAccountNo, int atmPin, double accountBalance,
			String passWord, String username) {
		this.customerName = customerName;
		this.customerAccountNo = customerAccountNo;
		this.atmPin = atmPin;
		this.accountBalance = accountBalance;
		this.passWord = passWord;
		this.username = username;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerAccountNo() {
		return customerAccountNo;
	}

	public void setCustomerAccountNo(String customerAccountNo) {
		this.customerAccountNo = customerAccountNo;
	}

	public int getAtmPin() {
		return atmPin;
	}

	public void setAtmPin(int atmPin) {
		this.atmPin = atmPin;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}
