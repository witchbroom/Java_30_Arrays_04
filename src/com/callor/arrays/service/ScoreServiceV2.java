package com.callor.arrays.service;

import com.callor.arrays.service.utils.Line;

public class ScoreServiceV2 {
	
	/* 클래스 영역에 선언된 변수
	 * ScoreServiceV1 클래스에선언된 모든 method에서
	 * 변수에 접근(읽고, 저장)할 수 있다
	 * 인스턴스 변수:
	 * ScoreServiceV1 클래스를 사용하여 인스턴스를 생성할때 자동으로 초기화되는 변수
	 */
	int[] intKor; // 선언만 된 정수형 배열
	
	/*
	 * ScoreServiceV1 클래스를 초기화한 생성자 메서드 선언
	 * 생성자 메서드는 클래스를 선언하면
	 * 클래스 블럭 ( {} ) 내부에 자동으로 선언된다
	 * 자동으로 선언된 생성자 메서드는 코드상에는 보이지 않는다
	 * 
	 * 임의로 생성자 메서드를 선언하는 이유
	 * 1. 클래스 영역에 선언된 변수를 초기화하여 사용할 수 있도록 준비하는 코드가 포함된다
	 */
	public ScoreServiceV2() {
		intKor = new int[100]; // intKor 배열이 사용할(저장, 읽기) 준비가 된다.
	}
	
	public void makeScore() {
		for(int i = 0 ; i < intKor.length ; i++) {
			/*
			 * random * 50을 연산하면 0~49까지 임의의 수가 생성된다
			 * 여기에 + 51을 하면 0일때는 51, 49일때는 100의 결과가 생성된다
			 * 그래서 51~100까지의 범위에서 임의 수를 생성하는 코드
			 */
			intKor[i] = (int)(Math.random() * 50) + 51;
		}
	}
	
	public void printScore() {
		
		// Line 클래스에 선언된 dLine 속성(변수)은 static 이기 때문에
		// Line 클래스를 line 인스턴스로 만들고 line.dLine처럼
		// 접근할 필요가 없다
		// Line line = new Line();
		// System.out.println(line.dLine);
		
		/*
		 * Line 클래스에 static으로 선언된 dLine()에게
		 * 정수값을 전달하고, 정수 개수만큼 라인 문자열을 return받는다
		 */
		
		/*
		 * dLine 속성(변수)은 static으로 선언되어있기 때문에
		 * Line 클래스를 인스턴스로 생성하지 않고도 접근할 수 있다
		 */
		
		System.out.println( Line.dLine(50) );
		System.out.println("국어 성적 일람표");
		System.out.println( Line.sLine(50) );
		
		for(int i = 0 ; i < intKor.length ; i++) {
			System.out.printf("%d : %d\t\t", (i+1), intKor[i]);
			if( (i + 1) % 5 == 0) {
				System.out.println();
			}
		}
		System.out.println( Line.dLine );
	}

}
