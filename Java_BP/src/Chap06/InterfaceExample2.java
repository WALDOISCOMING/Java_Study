package Chap06;
/*
 * �ۼ�����:2017_03_12
 * �ۼ���:����
 * Lenable �������̽� ������ �������� �̿��ϴ� ���α׷�
 * ���� 6-29
 */


public class InterfaceExample2 {
	public static void main(String[] args){
		Lendable arr[] = new Lendable[3];
		arr[0] = new SeparateVolume("833","Ǫ���� ����","����");
		arr[1] = new SeparateVolume("609","����̼���","���긮ġ");
		arr[2] = new AppCDInfo("2002-1742","XML�� ���� �ڹ����α׷�");
		checkOutAll(arr,"������","20060315");
		
	}
	static void checkOutAll(Lendable arr[],String borrower,String date){
		for(int cnt=0;cnt<arr.length;cnt++)
			try{
			arr[cnt].checkOut(borrower,date);
			}catch(Exception e){
				System.out.println(e);
			}
	}
}
