package Chap08.math;
/*
 * �ۼ�����:2017_03_13
 * �ۼ���:����
 * private �����縦 �����ϴ� Ŭ������ ��
 * ���� 8-12
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
