package encapsulation;

public class atm {
	
	private double bal=100000;
	
	

	public double checkbal() {
		return this.bal;
	}



	public void deposite(int amount) {
		this.bal += amount;
	}
	
	public void withdraw(int amount) {
		this.bal -= amount;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
