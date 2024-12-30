class A{
	public void showTheDataWhichBelongsToThisClassssssssssssss() {
		System.out.println("In A Show");
	}
}
class B extends A{
	public void showTheDataWhichBelongsToThisClassssssssssssss() {
		System.out.println("In B show");
	}
}
public class Demo {
	public static void main(String [] args) {
		B obj = new B();
		obj.showTheDataWhichBelongsToThisClassssssssssssss();
	}
}
