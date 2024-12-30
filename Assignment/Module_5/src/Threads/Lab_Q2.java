//Use inter-thread communication methods like wait(), notify(), and notifyAll().
package Threads;

class Count{
	int count;
	public synchronized int  increment() {
		count++;
		return count;
	}
}

class XYZ implements Runnable{	
	Count c;
	XYZ(Count count){
		c = count;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i =1;i<=1000;i++) {
			c.increment();
		}
	}	
}

class XY implements Runnable{
	Count c;
	XY(Count count){
		c = count;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i =1;i<=1000;i++) {
			c.increment();
		}
	}
}

public class Lab_Q2 {
	
	public static void main(String[] args)  {
		Count c1 = new Count();
		XYZ obj = new XYZ(c1);
		Thread th1 = new Thread(obj);
		
		XY obj1 = new XY(c1);
		Thread th2 = new Thread(obj1);
		
		th1.start();
		th2.start();
		try {
			th1.join();
			th2.join();
			
		}catch(Exception e) {		
		}
		System.out.println(c1.count);
	}
	
}
