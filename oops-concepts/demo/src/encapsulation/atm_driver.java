package encapsulation;

public class atm_driver {

	public static void main(String[] args) {
		atm ob = new atm();
		System.out.println(ob.checkbal());
		ob.deposite(50000);
		System.out.println("--------------------");
		System.out.println(ob.checkbal());
		ob.withdraw(25000);
		System.out.println("--------------------");
		System.out.println(ob.checkbal());

	}

}
