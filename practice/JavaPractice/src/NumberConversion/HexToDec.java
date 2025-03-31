package NumberConversion;

public class HexToDec{
	public static void main(String[] args) {
		String num = "F5";
		int j =1;
		int sum =0;
		for(int i =num.length()-1;i>=0;i--) {
			int rem ;
			if(num.charAt(i)>='0' && num.charAt(i) <='9') {
				rem = num.charAt(i)-'0';
			}
			else {
				rem = num.charAt(i)-55;
			}
			sum += rem*j;   
			j *= 16;	
		}
		System.out.println(sum);
	}
}

//1000   -> 8*1 			65 A 66 B 67 C 68 D 69 E   69-55
//62  -->   14*16  224
//3   -->   3*16*16 768