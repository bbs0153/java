package exam01;

class BankAccount {

	private int balance;

	public void deposit(int deposit) {

		balance += deposit;
		System.out.println("[입금 완료] 현재 잔액 : " + balance);
	}

	public void withdraw(int withdraw) {

		try {
			if (balance >= withdraw) {
				balance -= withdraw;
				System.out.println("[출금 완료] 현재 잔액 : " + balance);
			} else if (balance < withdraw) {
				throw new NegativeBalanceException("돈이없다.");
			}

		} catch (NegativeBalanceException e) {
			System.out.println("예외발생:" + e.getMessage());
		}
	}

}

class NegativeBalanceException extends Exception {

	public NegativeBalanceException(String msg) {
		super(msg);
	}

}

public class BankAccountTest {

	public static void main(String[] args) {

		BankAccount b = new BankAccount();

		b.deposit(100);
		b.withdraw(60);

	}

}
