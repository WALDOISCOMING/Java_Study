package Chap16;
/*
 * 작성일자:2017_03_18
 * 작성자:길경완
 * 돼지 저금통 클래스와 입구 클래스(이너 클래스)
 * 예제 16-4
 */
public class PiggyBank {
	int total;
	Slot slot;
	public PiggyBank() {
		total=0;slot = new Slot();
		// TODO Auto-generated constructor stub
	}
	
	class Slot{
		void put(int amount){
			total+=amount;
		}
	}
}
