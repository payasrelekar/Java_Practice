package com.seed.multithreadingdemos;

public class DaemonThreadDemo implements Runnable {

	public static void main(String[] args) {
		Thread t1 = new Thread(new DaemonThreadDemo());
		Thread t2 = new Thread(new DaemonThreadDemo());
		t1.setDaemon(true);
		t1.start();
		t2.start();
	}

	@Override
	public void run() {
		if (Thread.currentThread().isDaemon()) {
			System.out.println(Thread.currentThread().getName() + " :: Daemon thread is work");
		} else {
			System.out.println(Thread.currentThread().getName() + " :: User Thread Work");
		}
	}

}
