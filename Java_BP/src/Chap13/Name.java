package Chap13;
/*
 * 작성일자:2017_03_16
 * 작성자:길경완
 * 사람의 일믕르 표현하는 클래스
 * 예제 13-11
 * 예제 13-14: hashCode 메소드를 추가한 Name클래스-미완성
 * 예제 13-15: equals 메소드를 추가한  Name클래스-완성
 */

public class Name {
	String firstName;
	String lastName;
	Name(String firstname,String lastName){
		this.firstName=firstname;this.lastName=lastName;
	}
	public int hashCode(){
		return firstName.hashCode()+lastName.hashCode();
	}
	public boolean equals(Object obj){
		if(!(obj instanceof Name)){
			return false;
		}
		Name name = (Name)obj;
		if(firstName.equals(name.firstName)&&lastName.equals(name.lastName))
			return true;
		else
			return false;
	}
}
