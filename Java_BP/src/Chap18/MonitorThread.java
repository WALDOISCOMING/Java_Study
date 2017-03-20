package Chap18;

public class MonitorThread extends Thread{
	Thread thread;
	public MonitorThread(Thread thread) {
		this.thread=thread;
		// TODO Auto-generated constructor stub
	}
	public void run(){
		while(true){
		Thread.State state = thread.getState();
		System.out.println("쓰레드 상태"+state);
		if(state==Thread.State.TERMINATED)
			break;
		try{
			Thread.sleep(2000);
		}catch(InterruptedException e){
			System.out.println(e.getMessage());
		}
	}
	}
}
