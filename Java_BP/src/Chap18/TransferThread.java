package Chap18;

public class TransferThread extends Thread{
SharedArea sharedArea;
public TransferThread(SharedArea area) {
	sharedArea=area;
	// TODO Auto-generated constructor stub
}
public void run(){
	for(int cnt=0;cnt<12;cnt++){
		sharedArea.account1.withdraw(1000000);
		System.out.println("�鸸�� ����");
		sharedArea.account2.deposit(1000000);
		System.out.println("�鸸�� �Ա�");
	}
}
}
