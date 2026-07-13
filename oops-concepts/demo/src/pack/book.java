package pack;

public class book extends Library {
	String bname;
	String autor;
	double price;
	public book(String loc,int bid,String bname,String autor,double price) {
		super(loc,bid);
		this.autor =autor;
		this.bid=bid;
		this.bname=bname;
		this.price=price;
	}
	public static void main(String[] args) {
		book b=new book("mysuru",1,"abc","anupama",1000);
		System.out.println("Library name ="+b.libraryName+"| bid ="+b.bid+"| book name ="+b.bname+"| author ="+b.autor+"| price ="+b.price);

	}

}
