package com.javaex.practice;

import java.util.Scanner;

public class Ex18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double c, f;
		
		System.out.print("È­¾¾: ");
		f = sc.nextDouble();
		
		c = 5.0/9.0 * (f - 32);
	
		System.out.println("È­¾¾ " + f + " ÀÇ ¼·¾¾¿Âµµ´Â " + c + " ÀÔ´Ï´Ù.");
		
		sc.close();
	}
}	
