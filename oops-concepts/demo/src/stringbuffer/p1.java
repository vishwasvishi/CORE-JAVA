package stringbuffer;

public class p1 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("java");
		System.out.println(sb);
		
		sb.append('@');
		System.out.println(sb);
		
		sb.append(500);
		System.out.println(sb);
		
		sb.insert(0, '@');
		System.out.println(sb);
		
		sb.setCharAt(0, '$');
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
	}

}
