package com.seed.multithreadingdemos;

public class JoinMethodDemo implements Runnable {
	@Override
	public void run() {
		System.out.println("Thread Started :: " + Thread.currentThread().getName());
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Thread Ended :: " + Thread.currentThread().getName());
	}

	public static void main(String[] args) {

		Thread th1 = new Thread(new JoinMethodDemo());
		Thread th2 = new Thread(new JoinMethodDemo());
		Thread th3 = new Thread(new JoinMethodDemo());
		th1.start();

		try {
			th1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		th2.start();
		try {
			th2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		th3.start();
		try {
			th3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}