package FileHandling;

/*
 * Synchronization: one thread can run at a time
 * 
 * use to lock the recourses:
 * printer,bank account etc.
 */

class Caller{
	public synchronized void  call(String msg) throws InterruptedException {
		System.out.print("["+msg);
		Thread.sleep(2000);
		System.out.println("]");
	}
}

class Callback implements Runnable{
	Caller c;
	String msg;
	Thread th;
	
	Callback(Caller c,String msg){
		this.c = c;
		this.msg = msg;
		th = new Thread(this);
		th.start();
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			
				c.call(msg);
			
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
public class Syncronization {
	public static void main(String[] args) {
		Caller c = new Caller();
		Callback cb = new Callback(c,"Hey Drashti");
		Callback cb2 = new Callback(c,"Hey Yash");
		Callback cb3 = new Callback(c,"Hey Avi");
	}
}
