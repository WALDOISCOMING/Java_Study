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
		if(sharedArea.isReady!=true){
			synchronized (sharedArea) {
				try{
					sharedArea.wait();
					
			}catch(InterruptedException e){
				System.out.println(e.getMessage());
			}
			}
			
		}
		System.out.println(sharedArea.result);
		/*
		for(int cnt=0;cnt<3;cnt++){
			//����ȭ ���
				int sum = sharedArea.getTotal();
			
			System.out.println("�հ�"+sum);
			
			try{
				Thread.sleep(1);
			}catch(InterruptedException e){
				System.out.println(e.getMessage());
			}
		}
		*/
		/*
		while(sharedArea.isReady!=true)
			continue;
		System.out.println(sharedArea.result);
		*/
	}
}
