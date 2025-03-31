package Threads;

class ABC extends Thread {
	public void run() {
		for(int i = 1;i<=20;i++) {
			System.out.println("Thread 1");
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class BCD extends Thread{
	public void run() {
		for(int i = 1;i<=20;i++) {
			System.out.println("Thread 2");
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class Lab_Q1 {
	public static void main(String[] args) {
		ABC th1 = new ABC();
		BCD th2 = new BCD();
		th1.start();
		th2.start();
	}
}
