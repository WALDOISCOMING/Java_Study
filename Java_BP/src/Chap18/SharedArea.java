package Chap18;

class SharedArea {
	double result;
	boolean isReady;
	synchronized void transfer(int amount){
		
			
		
		account1.withdraw(1000000);
		System.out.println("�̸��� ����:100���� ����");
		account2.deposit(1000000);
		System.out.println("������ ����:100���� �Ա�");
		
	}
	synchronized int getTotal(){
			return account1.balance+account2.balance;
	}
	Account account1;
	Account account2;
}
