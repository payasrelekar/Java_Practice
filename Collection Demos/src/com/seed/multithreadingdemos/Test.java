package com.seed.multithreadingdemos;

public class Test {
	public static void main(String[] args) {
		MyTable t = new MyTable();
		MyThread1 th1 = new MyThread1(t);
		MyThread2 th2 = new MyThread2(t);
		th1.start();
		th2.start();
	}

}
