package poly;

public class emp_driver {

	public static void main(String[] args) {
		employee e1=new dev("abc",111,3000000);
		employee e2= new tester("vishi", 222, 600000);
		
		employee[] x= {e1,e2};
		
		for (employee lv:x) {
			lv.display();
			lv.work();
			System.out.println("-----------------gr");
		}

	}

}
