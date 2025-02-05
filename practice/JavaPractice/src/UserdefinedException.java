class MyException extends Throwable{
	MyException(String msg){
		System.out.println(msg);
	}
}
public class UserdefinedException {
	public void display() throws MyException {
		for(int i = 0;i<=5;i++) {
			if(i ==2) {
				throw new  MyException("Hello I value is 2");
			}
			System.out.println("i :"+i);
		}
	}
	public static void main(String[] args)  {
		UserdefinedException obj = new UserdefinedException();
		try {
			obj.display();
		}
		catch(Throwable e) {
//			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}
}
