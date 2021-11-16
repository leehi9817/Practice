package com.javaex.practice;

public class Ex09 {
	public static void main(String[] args) {
		
		double f = 80.0;
		// 5/9의 결과값이 0이기 때문에 부정확하다
		System.out.println(5/9*(f-32.0));
		
		// 5/9 대신 5.0/9.0을 사용하여 소수점이 표현되도록 해야함
		System.out.println(5.0/9.0*(f-32.0));
	}
}
