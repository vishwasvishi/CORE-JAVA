package association;

public class car {
	
	String model;
	String color;
	double price;
	engine x;
	
	public void display() {
		System.out.println("Model="+this.model+", color="+this.color+", price="+this.price);;
		
	}
	
	public car(String model,String color,double price,engine x) {
		this.model=model;
		this.color=color;
		this.price=price;
		this.x=x;
	}

}
