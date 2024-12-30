//Write a Java program that creates two threads to find and print even and odd numbers from 1 to 20.
package Threads;

class Odd extends Thread{
	public void run() {
		for(int i = 1;i<=20;i++) {
			try {
				if(i%2!=0) {
					System.out.println("Odd:"+i);
					Thread.sleep(1000);
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class even extends Thread{
	public void run() {
		for(int i = 1;i<=20;i++) {
			
			try {
				if(i%2==0) {
					System.out.println("Even:"+i);
					Thread.sleep(1000);
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class TwoThreads {
	public static void main(String [] args) {
		
		Odd o = new Odd();
		even e = new even();
		
		o.start();
		e.start();
	}
}
