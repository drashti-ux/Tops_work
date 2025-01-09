package Threads;

class Movie extends Thread{
	int total_earning = 0;
	public void run() {
			for(int i =1;i<=10;i++) {
				total_earning = total_earning + 100;
			}
	}
}
class SMC extends Thread{
	int total_earning = 0;
	public synchronized void run() {
			for(int i =1;i<=10;i++) {
				total_earning = total_earning + 100;
			}
			notify();
		
	}
}
public class WaitNotify {
	public static void main(String[] args) {
		SMC smc = new SMC();
		Movie mv = new Movie();
		synchronized(smc) {
			smc.start();
			try {
				smc.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		synchronized(mv) {
			mv.start();
			try {
				mv.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Total Earning :"+smc.total_earning);
		System.out.println("Total Earning :"+mv.total_earning);
	}
}
