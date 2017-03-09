package Chap05;

/*
 * 작성일자:2017_03_09
 * 작성자:길경완
 * 정수 배열의 통계를 내는 클래스
 * 예제 5-23
 * 예제 5-24: 정수 배열의 통계를 내는 클래스- 평균 계산 기능 추가
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
