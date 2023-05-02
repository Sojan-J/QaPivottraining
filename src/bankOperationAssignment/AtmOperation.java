package bankOperationAssignment;

public class AtmOperation extends BankOperation {
	private double accountBalance=customer.getAccountBalance();
	@Override
	protected void depisiteCheq(double cheqAmount) {
		customer.setAccountBalance(accountBalance+cheqAmount);
	}

}
