////Use inter-thread communication methods like wait(), notify(), and notifyAll().
//package Threads;
//class Item{
//	int i;
//	boolean produce = false;
//	
//	public synchronized void setItem(int x) {
//		while(produce) {
//			try {
//				wait();
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//		i = x;
//		produce = true;
//		notify();
//	}
//	public synchronized void getItem() {
//		while(!produce) {
//			try {
//				wait();
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//		System.out.println("Get : "+i);
//		produce = false;
//		notify();
//	}
//}
//class Producer implements Runnable{
//	
//	Item i;
//	Producer(Item x){
//		i = x;
//	}
//	@Override
//	public void run() {
//		// TODO Auto-generated method stub
//		i++;
//	}
//	
//}
//class Consumer implements Runnable{
//	Item i;
//	
//	@Override
//	public void run() {
//		// TODO Auto-generated method stub
//		Thread th1 = new Thread();
//		th1.start();
//	}
//}
//public class Lab_Q3 {
//	public static void main(String[] args) {
//		Item x = new Item();
//		Producer p1 = new Producer(x);
//		
//	}
//}
