package Chap05;

/*
 * 작성일자:2017_03_09
 * 작성자:길경완
 * 상품 재고 클래스
 * goodscode는 상품 명
 * stockNum 제고 갯수
 * 메소드 addstock 제고 추가
 * 메소드 substractStock은 제고 감소
 * 예제 5-2
 * 예제 5-4: 생성자를 추가
 */
public class GoodStock {
	String goodsCode;
	int stockNum;
	public GoodStock(String code,int num) {
	 goodsCode = code;
	 stockNum = num;
	}
	void addStock(int amount){
		stockNum+=amount;				
	}
	int subtractStock(int amount){
		if(stockNum<amount)
			return 0;
		stockNum-=amount;
		return amount;
	}
}
