class hey extends Thread{
	public void run() {
		for(int i = 0;i<=100;i++) {
			System.out.println("This is First Time..");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class hello extends Thread{
	public void run() {
		for(int i = 0;i<=100;i++) {
			System.out.println("This is Second Time.. helloo");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class ExE {
	public static void main(String[] args) throws InterruptedException {
		hey h1 = new hey();
		hello h2 = new hello();
		h1.start();
		h2.start();
	}
}
