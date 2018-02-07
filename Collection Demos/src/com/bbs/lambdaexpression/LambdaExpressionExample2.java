package com.bbs.lambdaexpression;

public class LambdaExpressionExample2 {
	public static void main(String[] args) {
		int width = 10;

		// with lambda
		Drawable d2 = () -> {
			System.out.println("Drawing " + width);
		};
		d2.draw();

		Sayble s1 = () -> {
			System.out.println("hi....");
		};
		s1.say();

		Addable add1 = (int a, int b) -> {
			System.out.println(a + b);
		};
		add1.add(10, 10);
		
		
	}
}