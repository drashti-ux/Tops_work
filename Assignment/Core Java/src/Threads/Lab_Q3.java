//Use inter-thread communication methods like wait(), notify(), and notifyAll()
package Threads;
class Item{
	int item;
	boolean produce = false;
	
	public synchronized void setItem(int x) {
		while(produce) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		item = x;
		System.out.println("Set : "+item);
		produce = true;
		notify();
	}
	
	public synchronized void getItem() {
		while(!produce) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("Get: "+item);
		produce = false;
		notify();
	}
}

class Producer implements Runnable{
	Item x;
	Producer(Item x){
		this.x = x;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 1;i<=5;i++) {
			x.setItem(i);
		}
	}
}
class Consumer implements Runnable{
	Item x;
	
	Consumer(Item x){
		this.x = x;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 1;i<=5;i++) {
			x.getItem();
		}
	}
}

public class Lab_Q3 {
	public static void main(String[] args) {
		
		Item itm =new Item();
		Producer p1 = new Producer(itm);
		Consumer c1 = new Consumer(itm);
		
		Thread th1 = new Thread(p1);
		Thread th2 = new Thread(c1);
		th1.start();
		th2.start();
		
	}
}
