package com.callor.arrays.service;

public class ScoreServiceV3 {
	
	private int[] intKor;
	/* 클래스 영역에 선언된 배열(변수) = 인스턴스 배열(변수)
	 * 변수를 클래스영역에 선언할때는 특별한 경우가 아니면 private을 설정함으로 변수는 외부의 접근을 차단한다
	 */
	public ScoreServiceV3() {
		intKor = new int[100];
		
	}
	
	public void printNo1Score() {
		/* ScoreServiceV3에 선언된 intKor배열은
		 * private 접근제한자가 선언되어있기 때문에
		 * 인스턴스를 이용하여 배열에 접근할 수 
		 */
		System.out.println(intKor[1]);
	}

}
