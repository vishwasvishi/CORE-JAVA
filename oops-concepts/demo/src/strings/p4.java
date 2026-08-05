package strings;

public class p4 {

	public static void main(String[] args) {
		String s1 = "Vishwas";
		System.out.println(s1.length());
		System.out.println("-------------");
		
		System.out.println(s1.charAt(4));
		System.out.println("-------------");
		
		char[] ch=s1.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
		}

	}

}
