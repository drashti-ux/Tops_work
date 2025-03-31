
public class primeNo {
	public static void main(String[] args) {
		
		for(int num=1;num<=100;num++) {
			boolean isPrime = true;
		for(int i =2;i<num;i++) {
			if(num%i==0) {
				isPrime = false;
			}
		}
		if(isPrime) {
			System.out.println(num+" Is Prime");
		}
	}
	}
}