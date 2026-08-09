package Therad;

public class p2 {

	public static void main(String[] args) {
		Runnable r=new myrunnable();
		Thread t = new Thread(r);
		t.start();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("main thread");
		}

	}

}
