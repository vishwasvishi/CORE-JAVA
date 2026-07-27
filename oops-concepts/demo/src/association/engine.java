package association;

public class engine {
	int cc;
	float mileage;
	
	public void display_engine() {
		System.out.println("CC="+this.cc+", Mileage"+this.mileage);
	}
	
	public engine(int cc,float mileage) {
		this.cc=cc;
		this.mileage=mileage;
	}

}
