package encapsulation;

public class stu_driver {

	public static void main(String[] args) {
		student ob = new student("abc", 123, "cs");
		System.out.println(ob.getSname());
		System.out.println(ob.getUsn());
		System.out.println(ob.getBranch());
		System.out.println("-----------------------");
		ob.setSname("abcd");
		System.out.println("-----------------------");
		System.out.println(ob.getSname());
		System.out.println(ob.getUsn());
		System.out.println(ob.getBranch());

	}

}
