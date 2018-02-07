package com.seed.multithreadingdemos;

public class ThreadPriorityDemo implements Runnable {

	public static void main(String[] args) {
		Thread th1 = new Thread(new ThreadPriorityDemo());
		Thread th2 = new Thread(new ThreadPriorityDemo());
		th1.setPriority(Thread.MIN_PRIORITY);
		th2.setPriority(Thread.MAX_PRIORITY);
		th1.start();
		th2.start();
		Thread.yield();

	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}

}
