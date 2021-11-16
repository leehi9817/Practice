package com.javaex.practice;

import java.util.Scanner;

public class Ex17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final double PI = 3.14;
		double v, r;
		
		System.out.print("반지름: ");
		r = sc.nextDouble();
		
		v = r * r * r * PI * 4/3;
		
		System.out.println("구의부피는: " + v);
		
		sc.close();
	}
}
