package Chap16;
/*
 * �ۼ�����:2017_03_18
 * �ۼ���:����
 * ��ٱ��� Ŭ������ ��ǰ �׸� Ŭ������ ����ϴ� ���α׷�(1)
 * ���� 16-2
 */
public class NestedClassExample1 {
	public static void main(String[] args){
		Cart cart =new Cart();
		cart.addIten("���ݸ�",3,1000);
		cart.addIten("����ũ",1,25000);
		cart.addIten("������",1,7000);
		printCart(cart);
	}
	static void printCart(Cart cart){
		int num = cart.getItemNum();
		System.out.println("   ��ǰ��  ����  �ܰ�     �ݾ�");
		System.out.println("---------------------");
		for(int cnt=0;cnt<num;cnt++){
			Cart.Item item = cart.getItem(cnt);
			System.out.printf("%3d %5s %5d %7d %7d %n",cnt+1,item.name,item.num,item.unitPrice,item.getPrice());
		}
		System.out.println("---------------------");
		System.out.printf(" �� ��         %10d  %n",cart.getTotalPrice());
	}
}
