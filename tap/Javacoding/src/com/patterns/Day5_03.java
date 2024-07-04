package com.patterns;

public class Day5_03 {

	public static void main(String[] args) {
		int a = 7;
		int b = a++ + ++a + ++a + a++ ;
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("..............................");
		int c = a-- - b++ + a++ + ++b - a++ + ++a; 
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		System.out.println("..............................");
		int d = a++ + b-- - c++ - a++ + ++b + ++a ;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		
	
	}
}
