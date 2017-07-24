package Chap16;

import java.util.ArrayList;

/*
 * 작성일자:2017_03_18
 * 작성자:길경완
 * 장바구니 클래스와 상품항목 클래스(이너 클래스)
 * 예제 16-1
 */
public class Cart {
	ArrayList<Item> list = new ArrayList<Item>();
	void addIten(String name,int num,int unitPrice){
		list.add(new Item(name,num,unitPrice));
	}
	void removeItem(int index){
		list.remove(index);
	}
	int getItemNum(){
		return list.size();
	}
	Item getItem(int index){
		return list.get(index);
	}
	int getTotalPrice(){
		int total=0;
		for(Item item:list)
			total+=item.getPrice();
		return total;
	}
	void chageItemNumber(int index,int num){
		Item item = list.get(index);
		item.num = num;
	}
	
	
	class Item{
		String name;
		int num;
		int unitPrice;
		public Item(String name,int num,int unitPrice) {
				this.name=name;this.num=num;this.unitPrice=unitPrice;
			// TODO Auto-generated constructor stub
		}
		int getPrice(){
			return num*unitPrice;
		}
	}
}
