package encapsulation;

public class student {
	private String sname;
	private int usn;
	private String branch;
	
	public student( String sname, int usn, String branch) {
		this.sname=sname;
		this.usn=usn;
		this.branch=branch ;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getUsn() {
		return usn;
	}


	public String getBranch() {
		return branch;
	}
	
	

}
