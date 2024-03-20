package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// Ex05 5개의 숫자를 키보드로 입력 받아 평균을 구하는 프로그램을 작성하세요.
		// 10
		// 20
		// 30
		// 40
		// 50
		// 평균은 30.0 입니다 출력.
		
		Scanner sc = new Scanner(System.in);
		
		double[] num = new double[5];
		double sum = 0;
		
		//5 까지 루프를 돌면서 입력을 받고
		
		for (int i = 0; i < num.length; i++) {
		num[i] = sc.nextDouble();
		sum = sum + num[i];
			
		}
		
		//다시 5까지 루프를 돌면서 평균을 구함
		
		double average = sum / num.length; 
		
		// 출력
		System.out.println("평균은 " + average + " 입니다.");
		sc.close();
	}

}
