package Chap06;
/*
 * 작성일자:2017_03_12
 * 작성자:길경완
 * 은행 계좌 클래스를 상속하는 직불 계좌 클래스
 * 예제 6-38 크기 변경 인터페이스와 색상변경 인터페이스를 상속하는 외형변경 인터페이스
 */
public interface Changeable extends Resizble,Colorable{
void setFont(String font);
}
