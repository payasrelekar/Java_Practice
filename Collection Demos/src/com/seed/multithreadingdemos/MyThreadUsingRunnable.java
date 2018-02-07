package com.seed.multithreadingdemos;

public class MyThreadUsingRunnable implements Runnable {

	public static void main(String[] args) {
		Thread t = new Thread(new MyThreadUsingRunnable());
		t.start();
		t.setName("increment");
		Thread t1 = new Thread(new MyThreadUsingRunnable());
		t1.start();
		t1.setName("decrement");
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i + " " + Thread.currentThread().getName());
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
