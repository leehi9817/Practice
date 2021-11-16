package com.javaex.practice;

import java.util.Scanner;

public class Ex16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final double TAX_RATE = 0.1;
		double price, receive, tax, bounce;
		
		System.out.print("상품가격: ");
		price = sc.nextDouble();
		
		System.out.print("받은돈: ");
		receive = sc.nextDouble();
		
		tax = price * TAX_RATE; 
		bounce = receive - price;
		
		System.out.println("받은돈: " + receive);
		System.out.println("상품가격: " + price);
		System.out.println("부가세: " + tax);
		System.out.println("잔액: " + bounce);
		
		sc.close();
	}
}
