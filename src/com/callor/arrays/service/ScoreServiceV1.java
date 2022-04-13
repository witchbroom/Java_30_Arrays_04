package com.callor.arrays.service;

import com.callor.arrays.service.utils.Line;

public class ScoreServiceV1 {
	
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
	public ScoreServiceV1() {
		intKor = new int[100]; // intKor 배열이 사용할(저장, 읽기) 준비가 된다.
	}
	
	public void makeScore() {
		for(int i = 0 ; i < intKor.length ; i++) {
			intKor[i] = (int)(Math.random() * 50) + 51;
		}
	}
	
	public void printScore() {
		

		System.out.println( Line.dLine );
		System.out.println("국어 성적 일람표");
		System.out.println( Line.sLine );
		
		for(int i = 0 ; i < intKor.length ; i++) {
			System.out.printf("%d\t", intKor[i]);
			if( (i + 1) % 5 == 0) {
				System.out.println();
			}
		}
		System.out.println( Line.dLine );
	}
	
}
