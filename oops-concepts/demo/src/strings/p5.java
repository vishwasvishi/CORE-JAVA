package strings;

public class p5 {
	public static void main(String[] args) {
		String s1 ="Java";
		String s2 =s1.substring(1);
		String s3 = s1.substring(1, 4);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		System.out.println("-------------------");
		
		String s4 = s1.toUpperCase();
		String s5 = s1.toLowerCase();
		
		System.out.println("-------------------");
		
		System.out.println(s4.concat(s5));
		System.out.println(s1.replace('a', '@'));
		System.out.println(s1.replace("ja", "jiva"));
		
		System.out.println("--------------------");
		
		String s6 = "   vishwas   ";
		String s7 = s6.trim();
		System.out.println(s7.indexOf('s'));
		System.out.println(s7.lastIndexOf('s'));

	}
	
}
