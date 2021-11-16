package com.javaex.practice;

import java.util.Scanner;

public class Ex14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double h, v, area, round;
		
		System.out.print("가로를 입력하세요: ");
		h = sc.nextDouble();
		
		System.out.print("세로를 입력하세요: ");
		v = sc.nextDouble();
		
		area = h * v;
		round = 2 * (h + v);
		
		System.out.println("사각형의 넓이는 " + area);
		System.out.println("사각형의 둘레는 " + round);
		
		sc.close();
	}
}
