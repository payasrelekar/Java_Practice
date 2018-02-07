package com.seed.multithreadingdemos;

public class Test2 {
	public static void main(String[] args) {
		SynchronizedBlockDemo s1 = new SynchronizedBlockDemo();
		MyThread3 th3 = new MyThread3(s1);
		MyThread4 th4 = new MyThread4(s1);
		th3.start();
		th4.start();
	}

}
