package com.javaex.practice;

import java.util.Random;

public class Ex08 {

	public static void main(String[] args) {
		// 미니로또 만들기 1~45
		
		int[] num = new int[6];
		int count = 0;

		while (count < 6) {
		    int randomNumber = (int)(Math.random()*45) + 1; // 1~45까지 랜덤 숫자 생성
		    boolean duplicate = false; // 중복체크 초기화
		    for (int i=0; i<count; i++) {
		        if(num[i] == randomNumber) { // 중복 체크
		            duplicate = true;
		            break;
		        }
		    }
		    if(!duplicate) { // 중복이 아니면 배열에 추가
		        num[count] = randomNumber;
		        count++;
		    }
		}

		for (int number : num) {
		    System.out.print(number + " ");
		    }
		}
	}