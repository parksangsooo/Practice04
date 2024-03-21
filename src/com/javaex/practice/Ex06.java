package com.javaex.practice;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char c[] = {'T','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l'};
		System.out.println(c);
		
		// 문자 배열을 String 객체로 변환
        String str = new String(c);
        
        // 공백을 콤마로 변경
        String replacedStr = str.replace(" ", ",");
        
        // 결과 출력
        System.out.println(replacedStr);

//        주어진 문자 배열을 String 객체로 변환한 후, replace 메소드를 사용하여 공백을 콤마로 바꿀 수 있습니다.
//        이 방법은 코드를 좀 더 간결하게 만들어 줍니다. 
//        예를 들어, String newStr = new String(c).replace(" ", ",");와 같이 사용할 수 있습니다. 
        
	}

}
