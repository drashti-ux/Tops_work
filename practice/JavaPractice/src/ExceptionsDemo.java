import java.util.Scanner;

class NotFoundVowel extends Exception{
	NotFoundVowel(){
		System.out.println("This Is Created By Drashti..");
	}
}

class CheckVowel{
	String str;
	int count =0;
	void check(String str) throws NotFoundVowel{
		this.str = str;
		str = str.toLowerCase();
		for(int i =0;i<str.length();i++) {
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'||str.charAt(i) == 'o'||str.charAt(i) == 'u') {
				count ++;
			}
		}
		if(count != 0) {
			System.out.println("The String Contains "+count+" numbers of vowels.");
		}
		else {
			throw new NotFoundVowel();
		}
	}
}

public class ExceptionsDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The String :");
		String S = sc.nextLine();
		CheckVowel ch = new CheckVowel();
		try {
			ch.check(S);
		}catch(Exception e){
			System.out.println("Exception "+e+" Handled ..");
		}
		
	}
}
