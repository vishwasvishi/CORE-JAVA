package poly;

public class bank_driver {

	public static void main(String[] args) {
		Bank b1=new sbi();
		Bank b2=new canara();
		
		Bank[] x= {b1,b2};
		
		for (Bank lv:x) {
			System.out.println(lv.intrest());
		}

	}

}
