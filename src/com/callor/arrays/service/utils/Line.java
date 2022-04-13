package com.callor.arrays.service.utils;

public class Line {
	
	/*
	 * 클래스 영역에 dLine, sLine 문자열형 변수를 선언
	 * static : 프로젝트 코드가 실행되는 순간 항상 자동으로 사용할 준비가 되도록 선언
	 * final : 변수에 final 키워드가 부착되면, 한번 저장된 값을 절대 변경할 수 없다(can not assign)
	 */
	public static final String dLine = "=".repeat(100);
	public static final String sLine = "-".repeat(100);
	
	/*
	 * return type이 문자열형(String 형, String type)인 dLine method 선언
	 */
	public static String dLine(int count) {
		String dLine = "=";
		return dLine.repeat(count);
	}
	
	/*
	 * int type(정수형) type argument가 1개 있고
	 * return type이 String type(문자열형)인 sLine method 선언
	 */
	public static String sLine(int count) {
		String sLine = "-";
		return sLine.repeat(count);
	}

}
