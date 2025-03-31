import java.util.Scanner;

public class ARmSNo {
	int digits(int num) {
		int count =0;
		while(num >0) {
			count ++;
			num = num/10;
		}
		return count;
	}
	public void isArmstrong(int num) {
		int dig =digits(num);
		int n =num;
		int sum = 0;
		while(num>0) {
			int reminder = num%10;
			sum += Math.pow(reminder,dig);
			num = num/10;
		}
		if(sum==n) {
			System.out.println(n+" Is ARmsStrong!");
		}
		else {
			System.out.println(n+" Is not ARmsStrong!");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No:");
		int no = sc.nextInt();
		ARmSNo obj = new ARmSNo();
		obj.isArmstrong(no);
	}
}
