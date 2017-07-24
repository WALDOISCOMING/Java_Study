package Chap11;
/*
 * 작성일자:2017_03_15
 * 작성자:길경완
 * toString메소드 오버라이딩의 예
 * 예제 11-3
 */
public class GoodsStock {
	String goodsCode;
	int stockNum;
	public GoodsStock(String goodsCode,int stockNum) {
		this.goodsCode=goodsCode;this.stockNum=stockNum;
		// TODO Auto-generated constructor stub
	}
	public String toString(){
		return "상품코드: "+goodsCode+"\n재고수량: "+stockNum+"\n";
	}
}
