package com.callor.arrays.service;

import com.callor.arrays.service.utils.Line;

/*
 * makeScore()
 * printScore()
 * sumScore()
 * 
 * 등의 method를 선언하고
 * 임의 성적을 생성하여 intKor에 저장
 * 성적일람표 출력
 * 총점계산
 */

public class ScoreServiceV5 {

	private int[] intKor;

	public ScoreServiceV5() {
		intKor = new int[100];
	}

	public void makeScore() {
		for (int i = 0; i < intKor.length; i++) {
			intKor[i] = (int) (Math.random() * 100) + 1;
		}
	}

	public void printScore() {

		System.out.println(Line.dLine);
		System.out.println("성적일람표");
		System.out.println(Line.sLine);

		for (int i = 0; i < intKor.length; i++) {
			System.out.printf("%d점\t\t", intKor[i]);
			if ((i + 1) % 5 == 0) {
				System.out.println();
			}
		}
	}

	public void sumScore() {
		int intSum = 0;
		for (int i = 0; i < intKor.length; i++) {
			intSum += intKor[i];
		}
		
		System.out.println(Line.dLine);
		System.out.println("총점");
		System.out.println( intSum );
		System.out.println(Line.sLine);


	}

}
