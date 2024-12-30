
//thread -- smallest unit of process
//two types
//single thread 
//multiple thread

//by extending thread class
//by implementing runnable interface

package Threads;

class A implements Runnable{
	public void run() {
		for(int i =1;i<=10;i++) {
			System.out.println("A :"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class B implements Runnable{
	public void run() {
		for(int i =1;i<=10;i++) {
			System.out.println("B:"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class ThreadDemo {
	public static void main(String[] args) {
		A obj = new A();
		Thread th1 = new Thread(obj);
		th1.start();
		B obj2 = new B();
		Thread th2 = new Thread(obj2);
		th2.start();
	}
}
