package com.javaex.practice;

public class Ex03 {
	public static void main(String[] args) {
		
		int x = 1;
		int y = 1;
		
		//(1)x에 1 증가, (2)x에 2 곱하기, (3)a에 대입
		int a = ++x * 2; //x:2, a:4
		//(1)y에 2 곱하기, (2)b에 대입, (3)y에 1 증가
		int b = y++ * 2; //y:2, b:2
		
		System.out.println("a=" + a); //4
		System.out.println("b=" + b); //2
		System.out.println("x=" + x); //2
		System.out.println("y=" + y); //2
	}
}
