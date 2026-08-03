package object_programes;

public class p2 {
	int a=100;
	int b=200;
public static void main(String[] args) {
	p2 ob=new p2();
	p2 ob1=new p2();
	p2 ob2 = ob;
	System.out.println(ob.equals(ob1));
	System.out.println(ob.equals(ob));
}
}
