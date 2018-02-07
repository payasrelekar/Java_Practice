package com.seed.multithreadingdemos;

public class MyTable {
	// Synchronization Demo
	public synchronized void prinTable(int n) {
		for (int i = 1; i < 5; i++) {
			System.out.println(n * i);
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class MyThread1 extends Thread {
	MyTable t1;

	public MyThread1(MyTable t1) {
		this.t1 = t1;
	}

	@Override
	public void run() {
		t1.prinTable(5);
	}
}

class MyThread2 extends Thread {
	MyTable t2;

	public MyThread2(MyTable t2) {
		this.t2 = t2;
	}

	@Override
	public void run() {
		t2.prinTable(100);
	}

}