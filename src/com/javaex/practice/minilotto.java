package com.javaex.practice;

import java.util.Random;

public class minilotto {

	public static void main(String[] args) {
		// 미니로또 만들기 1~45
		
		 Random rand = new Random();
	        int[] numbers = new int[6];
	        int count = 0;

	        while (count < 6) {
	            int num = rand.nextInt(45) + 1; // 1~45 사이의 숫자 생성
	            boolean duplicate = false;
	            for (int i = 0; i < count; i++) {
	                if (numbers[i] == num) { // 중복 체크
	                    duplicate = true;
	                    break;
	                }
	            }
	            if (!duplicate) {
	                numbers[count++] = num;
	            }
	        }

	        for (int number : numbers) {
	            System.out.print(number + " ");
	        }

	}

}
