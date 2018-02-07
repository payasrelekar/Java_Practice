package com.seed.multithreadingdemos;

public class SynchronizedBlockDemo {
	public synchronized void prinTable(int n) {
		synchronized (this) {
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
}

class MyThread3 extends Thread {
	SynchronizedBlockDemo t1;

	public MyThread3(SynchronizedBlockDemo t1) {
		this.t1 = t1;
	}

	@Override
	public void run() {
		t1.prinTable(5);
	}
}

class MyThread4 extends Thread {
	SynchronizedBlockDemo t2;

	public MyThread4(SynchronizedBlockDemo t2) {
		this.t2 = t2;
	}

	@Override
	public void run() {
		t2.prinTable(100);
	}
}
