package Chap16;
/*
 * �ۼ�����:2017_03_18
 * �ۼ���:����
 * ���� ������ Ŭ������ �Ա� Ŭ����(�̳� Ŭ����)
 * ���� 16-4
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
