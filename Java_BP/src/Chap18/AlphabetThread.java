package Chap18;

public class AlphabetThread extends Thread{
	public void run(){
		for(char ch='A';ch<='Z';ch++){
			System.out.println(ch);
			try{
				Thread.sleep(1000);
			}catch(InterruptedException e){
				System.out.println(e.getMessage());
			}
		}
	}
}
