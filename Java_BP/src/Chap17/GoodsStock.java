package Chap17;

/*
 * �ۼ�����:2017_03_18
 * �ۼ���:����
 * ����ȭ ���� Ŭ���� �����
 * ���� 17-2
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
			throw new Exception("��� ����");
		this.num-=num;
		return num;
	}
}
