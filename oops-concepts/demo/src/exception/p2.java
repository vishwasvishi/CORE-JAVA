package exception;

public class p2 {

	public static void main(String[] args) {
		String s="abc123";
		try {
			int num=Integer.parseInt(s);
			System.out.println(num);
		}catch (NumberFormatException e) {
			System.out.println("from catch");
		}

	}

}
