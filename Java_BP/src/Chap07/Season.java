package Chap07;
/*
 * 작성일자:2017_03_12
 * 작성자:길경완
 * 사계절을 열거 타입으로 선언해서 사용하는 예
 * 예제 7-15
 * 예제 7-20: 열거 상수에 연관된 값을 이용하는 프로그램
 */
public enum Season {
SPRING("봄"),SUMMER("여름"),FALL("가을"),WINTER("겨울");

final private String name;
Season(String name){
	this.name= name;
}
String value(){
	return name;
}
}
