package Chap05;

/*
 * 작성일자:2017_03_09
 * 작성자:길경완
 * 상수 필드 선언을 포함하는 클래스
 * 예제 5-35
 */
public class LimitedValue {
	final static int UPPER_LIMIT = 10000;
	int value;
	void setValue(int value){
		if(value<UPPER_LIMIT)
			this.value =value;
		else
			this.value =UPPER_LIMIT;
	}
}
