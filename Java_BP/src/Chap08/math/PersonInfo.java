package Chap08.math;
/*
 * 작성일자:2017_03_13
 * 작성자:길경완
 * private 생성사를 포함하는 클래스의 예
 * 예제 8-12
 */
class PersonInfo {
String name;
int age;
char gender;
String bloodType;
private PersonInfo(String name,int age){
	this.name=name;this.age=age;
}

PersonInfo(String name,int age,char gender) {
	this.name=name;this.age=age;this.gender=gender;
	// TODO Auto-generated constructor stub
}
PersonInfo(String name,int age,char gender,String bloodType) {
	this.name=name;this.age=age;this.gender=gender;this.bloodType=bloodType;
	// TODO Auto-generated constructor stub
}

}
