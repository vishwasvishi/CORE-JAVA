package object_programes;

public class bike {
	int cc;
	float mileage;
	
	public bike(int cc,
	float mileage) {
		this.cc=cc;
		this.mileage=mileage;
	}
	public boolean equals(Object obj) {
		bike temp = (bike)obj;
		
		if (this.cc==temp.cc &&this.mileage==temp.mileage)
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		bike r15=new bike(155,45);
		bike mt15=new bike(155,45);
		System.out.println(mt15.equals(r15));
		System.out.println(r15.equals(mt15));
	}

}
