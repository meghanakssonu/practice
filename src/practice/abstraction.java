package practice;

interface Bank {

	double deposit(double amount);

	double withdraw(double amount);

	double balance();

}

class AxisBank implements Bank {
	
	double minimum_balance = 1000;

	@Override
	public double deposit(double amount) {
		minimum_balance = minimum_balance+amount;
		return minimum_balance;
	}

	@Override
	public double withdraw(double amount) {
		minimum_balance = minimum_balance-amount;
		return minimum_balance;
	}

	@Override
	public double balance() {
		return minimum_balance;
	}
}

public class abstraction {

	public static void main(String[] args) {
		Bank bank = new AxisBank();
		System.out.println(bank.balance());
		System.out.println(bank.deposit(10000));
		System.out.println(bank.withdraw(5000));
		System.out.println(bank.balance());
	}

}
