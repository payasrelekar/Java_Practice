package com.seed.regexdemos;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherDemo {
	public static void main(String[] args) {
		Pattern p = Pattern.compile(".s");
		Matcher mat = p.matcher("ms");
		boolean bol = mat.matches();
		System.out.println(bol);

		boolean bol1 = Pattern.compile(".s").matcher("mas").matches();
		System.out.println(bol1);

		boolean b = Pattern.matches(".s", "ms");
		System.out.println(b);

		System.out.println(Pattern.matches("[amn]", "abcd"));
		System.out.println(Pattern.matches("[amn]", "a"));

		System.out.println(Pattern.matches("[amn]?", "a"));
		System.out.println(Pattern.matches("[amn]*", "aaa"));
		System.out.println(Pattern.matches("[a-zA-z0-9]*", "bhagvaT123"));
	}
}
