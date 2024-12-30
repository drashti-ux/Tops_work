class Bank{
	 long accno;
	private String iFsccode;
	private String Name;
	
	public void setData() {
		accno = 22545224;
		iFsccode = "SBIn05646";
		Name ="Drashti";
	}
	
	public void  show() {
		System.out.println("Account no: "+accno);
		System.out.println("iFSC code :"+iFsccode);
		System.out.println("Name :"+Name);
	}
	
}
public class EncapsuationDemo {
	public static void main(String [] args) {
		Bank B1 = new Bank();
		B1.setData();
		long s = B1.accno;
		System.out.println("S ="+s);
		B1.show();
	}
}
