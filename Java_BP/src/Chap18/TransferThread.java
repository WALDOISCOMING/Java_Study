package Chap18;

public class TransferThread extends Thread{
SharedArea sharedArea;
public TransferThread(SharedArea area) {
	sharedArea=area;
	// TODO Auto-generated constructor stub
}
public void run(){
	for(int cnt=0;cnt<12;cnt++){
		synchronized (sharedArea) {//동기화 블록
		sharedArea.transfer(100);
		}
	}
}
}
