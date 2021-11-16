package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int coin500, coin100, coin50, coin10, total;
		
		System.out.print("500원 개수: ");
		coin500 = sc.nextInt();
		
		System.out.print("100원 개수: ");
		coin100 = sc.nextInt();
		
		System.out.print("50원 개수: ");
		coin50 = sc.nextInt();
		
		System.out.print("10원 개수: ");
		coin10 = sc.nextInt();
		
		total = (coin500 * 500) + (coin100 * 100) + (coin50 * 50) + (coin10 * 10);
		
		System.out.println("동전의 총합은 " + total + " 원 입니다.");
		
		sc.close();
	}
}
