package Chap16;
/*
 * 작성일자:2017_03_18
 * 작성자:길경완
 * 장바구니 클래스와 상품 항목 클래스를 사용하는 프로그램(1)
 * 예제 16-2
 */
public class NestedClassExample1 {
	public static void main(String[] args){
		Cart cart =new Cart();
		cart.addIten("초콜릿",3,1000);
		cart.addIten("케이크",1,25000);
		cart.addIten("샴페인",1,7000);
		printCart(cart);
	}
	static void printCart(Cart cart){
		int num = cart.getItemNum();
		System.out.println("   상품명  수량  단가     금액");
		System.out.println("---------------------");
		for(int cnt=0;cnt<num;cnt++){
			Cart.Item item = cart.getItem(cnt);
			System.out.printf("%3d %5s %5d %7d %7d %n",cnt+1,item.name,item.num,item.unitPrice,item.getPrice());
		}
		System.out.println("---------------------");
		System.out.printf(" 총 계         %10d  %n",cart.getTotalPrice());
	}
}
