
public class StaticVariable {
	static int i =10;
	public void change() {
		i =15;
		System.out.println("after change: "+i);
	}
	public static void main(String[] args) {
		StaticVariable obj = new StaticVariable();
		System.out.println("before change:"+obj.i);
		obj.change();
		
		StaticVariable obj2 = new StaticVariable();
		System.out.println("val:"+obj2.i);
		
	}
}
