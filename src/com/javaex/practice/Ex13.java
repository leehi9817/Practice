package com.javaex.practice;

import java.util.Scanner;

public class Ex13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final double RATE = 1230.95;
		double kor, dollar;
		
		System.out.print("환전할 원화를 입력하세요: ");
		
		kor = sc.nextDouble();
		
		dollar = kor / RATE;
		
		System.out.println("받으실 달러는 " + dollar);
		
		
		sc.close();
	}
}
