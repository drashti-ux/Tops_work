package OOPs_Concept;
class Ab{
	int a = 10;
	public void display() {
		System.out.println("In A Show ");
	}
}
class Bc extends Ab{
	
	public void display() {
		System.out.println("In B Show ");
	}
}
class Cd extends Bc{
	public void display() {
		System.out.println("In C Show ");
	}
}
public class Lab_Q3 {
	public static void main(String [] args) {
		Cd c = new Cd();
		c.display();
	}
	
}
