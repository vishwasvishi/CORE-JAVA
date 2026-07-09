class movie
{
	String title;
	String hero;
	String heroine;
	public void display(){
		System.out.println("title="+this.title+" Hero="+this.hero+" Heroine="+this.heroine);
	}
	public movie(String title, String	q hero,	String heroine){
		this.title=title;
		this.hero=hero;
		this.heroine=heroine;
	}
	public static void main(String[] args) 
	{
		movie m1=new movie("kgf","yash","ra");
		movie m2=new movie("devil","dharshan","ra");
		m1.display();
		m2.display();
	}
}
