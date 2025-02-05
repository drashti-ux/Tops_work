package Patterns;

public class AsNumber {
	public static void main(String[] args) {
		ArmstrongNUmber as = new ArmstrongNUmber();
		int count = 0;
		for(int i=100;i<1000;i++) {
			if(as.isArmStrong(i)) {
				count++;
				System.out.println(i);
			}
		}
		System.out.println("Three digits Armstrong numbers:"+count);
	}
}
