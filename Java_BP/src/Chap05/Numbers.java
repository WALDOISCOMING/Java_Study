package Chap05;

/*
 * �ۼ�����:2017_03_09
 * �ۼ���:����
 * ���� �迭�� ��踦 ���� Ŭ����
 * ���� 5-23
 * ���� 5-24: ���� �迭�� ��踦 ���� Ŭ����- ��� ��� ��� �߰�
 */
public class Numbers {
	int num[];
	Numbers(int num[]) {
		this.num = num;
	}
	int getTotal(){
		int total=0;
		for(int cnt=0;cnt<num.length;cnt++)
			total+=num[cnt];
		return total;
	}
	int getAverage(){
		int total;
		total = getTotal();
		int avg = total/num.length;
		return avg;
	}
}
