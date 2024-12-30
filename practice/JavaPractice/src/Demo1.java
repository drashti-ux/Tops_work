import java.util.Scanner;

public class Demo1 {
	public static void main(String[] args) {
		String s1;
		Scanner sc = new Scanner(System.in);
		
		s1 = sc.nextLine();
		System.out.println(s1);
		
		StringBuffer s2 = new StringBuffer(s1);
		
		System.out.println(s2);
		System.out.println(s2.length());
		
	}
}
