package com.seed.multithreadingdemos;

public class MyThread extends Thread {
	String name;

	public MyThread(String name) {
		super();
		this.name = name;
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

	public static void main(String[] args) {
		MyThread m1 = new MyThread("Bhagvat");
		MyThread m2 = new MyThread("Uddhan");

		m1.start();
		m2.start();
	}

}
