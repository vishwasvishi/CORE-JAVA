package abstraction;

public class acc_imp extends acc {
		double bal=50000;
	
	

	public double bal() {
		return this.bal;
	}



	public void deposite(int amt) {
		this.bal += amt;
	}
	
	public void withdraw(int amt) {
		this.bal -= amt;
	}

	public static void main(String[] args) {
		acc ob = new acc_imp();
		System.out.println(ob.bal());
		ob.deposite(25000);
		System.out.println(ob.bal());
		ob.withdraw(10000);
		System.out.println(ob.bal());

	}

}
