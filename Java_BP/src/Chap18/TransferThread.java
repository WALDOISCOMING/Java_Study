package Chap18;

public class TransferThread extends Thread{
SharedArea sharedArea;
public TransferThread(SharedArea area) {
	sharedArea=area;
	// TODO Auto-generated constructor stub
}
public void run(){
	for(int cnt=0;cnt<12;cnt++){
		synchronized (sharedArea) {//����ȭ ���
		sharedArea.transfer(100);
		}
	}
}
}
