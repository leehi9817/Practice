package com.javaex.practice;

public class Ex06 {
	public static void main(String[] args) {
	
		int i = 10;
		
		//(1)i%2 연산, (2)n에 대입, (3)i값 1 증가
		int n = i++ % 2;
		
		System.out.println(i); //11
		System.out.println(n); //0
	}
}
