package com.javaex.practice;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] data = {1, 3, 5, 8, 9, 11, 15, 19, 18, 20, 30, 33, 31};
		
		int count = 0;
		int sum = 0;
//		
//		for (int i=0; i < data.length; i++) {
//			if (data[i] % 3 ==0) {
//			count = count + 1; // count++;
//			sum = sum + data[i]; // sum += data[i];
//			}
//			}
//		System.out.printf("주어진 배열에서 3의 배수의 개수=> %d%n주어진 배열에서 3의 배수의 합=> %d%n",
//				count, sum);
//		
		for (int i : data) { // 확장된 for 문(enhanced for loop)입니다. 
							// 이 구문은 data 배열의 모든 요소를 처음부터 끝까지 순회합니다.
							//각 반복에서 배열의 현재 요소가 num 변수에 할당되고, 
							//이를 사용하여 반복문 내에서 원하는 작업(예: 조건 검사, 값 계산)을 수행할 수 있습니다.
			if(i % 3 == 0) { 
				count++;
				sum += i;
			}
		}
		System.out.printf("주어진 배열에서 3의 배수의 개수=> %d%n주어진 배열에서 3의 배수의 합=> %d%n",
				count, sum);	
	
	}

}
