package Chap18;
//���̸� ����ϴ½����� Ŭ����
public class printThread extends Thread{
	SharedArea sharedArea;
	public printThread() {
		// TODO Auto-generated constructor stub
	}
	public printThread(SharedArea area) {
		sharedArea=area;
		// TODO Auto-generated constructor stub
	}
	public void run(){
		for(int cnt=0;cnt<3;cnt++){
			int sum = sharedArea.account1.balance+sharedArea.account2.balance;
			System.out.println("�հ�"+sum);
			try{
				Thread.sleep(1);
			}catch(InterruptedException e){
				System.out.println(e.getMessage());
			}
		}
		/*
		while(sharedArea.isReady!=true)
			continue;
		System.out.println(sharedArea.result);
		*/
	}
}
