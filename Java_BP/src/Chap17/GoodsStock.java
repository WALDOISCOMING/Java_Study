package Chap17;

/*
 * 작성일자:2017_03_18
 * 작성자:길경완
 * 직렬화 가능 클래스 만들기
 * 예제 17-2
 */
public class GoodsStock implements java.io.Serializable{
	String code;
	int num;
	public GoodsStock(String code,int num) {
		this.code=code;this.num=num;
		// TODO Auto-generated constructor stub
	}
	void addStock(int num){
		this.num+=num;
	}
	int substractStock(int num)throws Exception{
		if(this.num<num)
			throw new Exception("재고 부족");
		this.num-=num;
		return num;
	}
}
