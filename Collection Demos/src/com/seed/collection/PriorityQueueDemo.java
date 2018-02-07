package com.seed.collection;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {
	public static void main(String[] args) {
		Queue<String> qu = new PriorityQueue<>();
		qu.add("Bhagvat");
		qu.add("Akash");
		qu.add("Balaji");
		qu.add("Samadhan");
		qu.add("Pandurang");
		qu.add("Bhagvat");

		System.out.println(qu);

		Deque<String> dq = new ArrayDeque<>();
		dq.add("Bhagvat");
		dq.add("Akash");
		dq.add("Balaji");
		dq.add("Samadhan");
		dq.add("Pandurang");
		dq.add("Bhagvat");
		System.out.println();
		System.out.println(dq);

		dq.addFirst("Rajeev");
		dq.addLast("Jagdish");

		System.out.println(dq);

		dq.removeFirst();
		dq.removeLast();
		System.out.println(dq);

		dq.remove();
		System.out.println("After Removing:" + dq);

		System.out.println(dq.poll());

	}
}
