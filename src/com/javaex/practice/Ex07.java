package com.javaex.practice;

public class Ex07 {

	public static void main(String[] args) {
		
		int i = 10;
		
		//(1)i에 1 증가, (2)i%2 연산, (3)n에 대입
		int n = ++i % 2;
		
		System.out.println(i); //11
		System.out.println(n); //1
	}
}
