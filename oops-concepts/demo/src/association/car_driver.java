package association;

public class car_driver {

	public static void main(String[] args) {
		engine e = new engine(2000, 8);
		System.out.println(e);
		car c = new car("bmw", "black", 1000000, e);
		car c1 = new car("benz", "red", 7000000, e);
		car c2= new car("tata", "silver", 100000, e);
		
		car[] x= {c,c1,c2};
		
		for(int i=0;i<x.length;i++) {
			
			x[i].display();
			x[i].x.display_engine();
			System.out.println("-------------------");
			
		}
		/*same in for and for each*/
		
		for(car lv:x) {
			lv.display();
			lv.x.display_engine();
			System.out.println("-------------------");
		}
		int sum=0;
		int[] b= {10,10,10};
		for (int k=0;k<b.length;k++) {
			sum += b[k];
			
		}
		System.out.println(sum);
		
		int n=98765432;
		short h=(short)n;
		
		System.out.println(n);
		System.out.println(h);

	}

}