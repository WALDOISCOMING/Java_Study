package Chap17;
/*
 * 작성일자:2017_03_19
 * 작성자:길경완
 * 상품 정보 클래스와 서브 클래스들
 * 예제 17-11
 */
public class ClothingInfo extends GoodsInfo{
	String color;
	char size;
	
	
	public ClothingInfo(String name, String code, int price,String color,char size) {
		super(name, code, price);
		this.color=color;this.size=size;
		// TODO Auto-generated constructor stub
	}

}
