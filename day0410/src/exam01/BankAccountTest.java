package exam01;

class BankAccount {

	private int balance;

	public void deposit(int deposit) {

		balance += deposit;
		System.out.println("[�Ա� �Ϸ�] ���� �ܾ� : " + balance);
	}

	public void withdraw(int withdraw) {

		try {
			if (balance >= withdraw) {
				balance -= withdraw;
				System.out.println("[��� �Ϸ�] ���� �ܾ� : " + balance);
			} else if (balance < withdraw) {
				throw new NegativeBalanceException("���̾���.");
			}

		} catch (NegativeBalanceException e) {
			System.out.println("���ܹ߻�:" + e.getMessage());
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
