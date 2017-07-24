package 해싱;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * 생성일: 2017-07-20
 * 생성자: 길경완
 * 수정일: x
 * 수정자: x
 * 제목 :해싱
 * 내용 :.
 * 
 * 해쉬 테이블은 dynamic set(탐색,삽입,삭제 모두 지원)을 구현하는 가장 효과적 방법.
 * 적절한 경우 탐색,삽입,삭제 O(1)
 * 최악일 경우 쎄타(n)
 * 해쉬 테이블은 해쉬 함수를 사용하여 key를 T[hash_function(k))]에 저장시킨다. 이런 경우 key가 h(k)로 햐ㅐ싱 되었다고한다.
 * 해쉬 테이블은 일반적으로 하나의 배열을 말한다. 이 경우 key는 모두 자연수라는 가정이 존재한다.
 * 두개 이상의 키가 동일한 위치에 해슁되면 충돌이라고 한다. 이 함수는 정의역과 치역이 1대1로 맞아 떨어지는 단사함수가 아니므로 항상 발생 가능성이 있다. 
 * 대다수 정의역이 치역보다 크므로 이러한 것을 피하기 위하여 chaining과 open addressing으로 피해야한다.
 * 키의 삽입: 
 * 키를 리스트 맨 앞에 삽입 O(1)
 * 중복된 키가 들어 올수 있으며, 중복이 허락되지 않는다면 그전에 검색해야한다. 그러므로 복잡도는 리스트 길이에 비례
 * 키의 검색:
 * T[hash_function(k))]에서 순차 검색
 * 시간 복잡도는 리스트 길이에 비례
 * 키의 삭제:
 * T[hash_function(k))]에서 검색 후 삭제
 * 찾은 후에는 O(1)시간에 삭제 가능
 * 최악의 경우, 모든 키가 모두 동일 해쉬값을 가져 하나의 슬롯으로 해슁되는 경우
 * 길이가 n인 하나의 연결리스트가 만들어진다. 그래서 최악의 경우 탐색은 빅쎄타(n)+해쉬함수 계산시간이 걸닌다.
 * 결국 평균시간복잡도는 슬롭에 얼마나 잘 분배되느냐에의해 결정된다.
 * 각각의 키가 모든 슬롯에 균등한 확률로 독립적으로 해슁 된다는 가정.->현실에서는 불가능
 * Load factor a = n/m
 * n는 테이블에 저장될 키의 갯수
 * m은 해쉬 테이블의 크기.
 * 하나의 키에 n개가 들어왔을때 하나에 들어올 확률은 n/m이다.
 * 
 * open addressing에서의 해결방법:
 * Linear probing:
 * 자신이 위치할 해싱이 비어있다면 그곳에 넣는다. 만약 채워져있다면 순차적으로, 바로 앞의 위치에 넣는다. 이렇게 된다면 모이면 클러스트링이 심하게 되서
 * 새로운 키 삽입 시 점점 클러스터위치에 삽입 될 가능성이 높아지므로 점점 겹치는 부분이 늘어나는 문제가 생긴다.
 * Quadratic probing
 * 자신이 위치할 해싱이 비어있다면 그곳에 넣는다. 만약 채워져있다면 1^2,2^2,3^2의 제곱의 순으로  넣는다. 
 * 
 * Double hashing
 * 하나의 해쉬 함수가 아닌 다른 해쉬 함수를 이용해서 만든다.
 * 
 * 단순삭제를 한다면 만약 A,B,C가 같은 해쉬 함수값을 가져 linear로 충돌 해결했다하자. 이때 B를 삭제하면 C가 존재하는 위치를
 * 알수가 없다. 그러므로 삭제를 후, C를 B의 자리로 옮겨줘야한다. 클러스트 전체를 옮겨야 한다.
 * 
 * 현실의 키들은 랜덤하지않고 한쪽에 몰려있을 수 있을것이다. 그러므로 키가 패턴을 가져도 해쉬함수값은 불규칙적이어야한다. 
 * 해쉬함수 만드는 기법
 * division 기법
 * h(k) = k%m;
 * 장점:빠르다.
 * 단점:해쉬값이 키값은 특정부분에 의하여 결정된다.
 * multiplication 기법
 * 0~1사이 상수 A 선택.
 * kA의 소수 부문만을 선택한다.
 * 소수 부문에 m을 곱한 후 소수점 아래를 버린다.
 * m=8이고 W=5,k=21;
 * A=13/32;
 * ka=21*13/32l->8+(17/32);
 * ka의 소수부문 * m를 하고, 그것의 정수만 가져온다.
 * m*(ka mod 1) = 8*(17/32) = 17/4 = 4....
 * h(21) = 4;
 * 장점:키의 일부분만에 되지 않는다.
 * 단점:
 * 
 * 자바의 object클래스는 hashcode, 모든 객체는 가지고 있다는 것이다. 그래서 Object.equals는 hashcode를 사용하는것.
 * 여기 클래스에서 메소들은 모두 div 기법을 사용하지 mul 기법은 사용하지 않는다.
 */

public class Hashing extends 정렬.printArray
{
	int hash[];
	ArrayList<Integer> []chaining;
	int size;
	public Hashing(){
		size=13;
		hash = new int[size];
		Arrays.fill(hash,-1);
		chaining = new ArrayList[size];
		for(int i=0;i<size;i++)
		{
			chaining[i] = new ArrayList<Integer>();
		}
	}
	
	public void printChaining()
	{
		for(int i=0;i<size;i++)
		{
			System.out.print(i+"행의 ");
			for(int j=chaining[i].size()-1;j>=0;j--)
			{
				System.out.print(j+"번째 ["+chaining[i].get(j)+"]");
			}
			System.out.println(" ");
		}
	}
	public void chaining(int key)
	{
		int div = key%size;
		chaining[div].add(key);
		printChaining();
				
	}
	
	
	public void linearProbing(int key)
	{

		int div = key%size;
		while(hash[div]!=-1)
		{
			if(div>=size)
			{
				size=0;
			}
			div++;
			//hash[key%m]=key;
		}
			hash[div] = key;
			System.out.println("linear 해슁 삽입완료");
			print(hash);
		
	}
	public void quadraticProbing(int key)
	{

		int div = key%size;
		int quadratic=1;
		while(hash[div]!=-1)
		{
			if(div>=size)
			{
				size=0;
			}
			div=div+quadratic*quadratic;
			quadratic++;
			//hash[key%m]=key;
		}
			hash[div] = key;
			System.out.println("quadratic 해슁 삽입완료");
			print(hash);
	}
	
	public void doubleProbing(int key)
	{
		int div1 = key%size;
		int div2 = key%(size-2);
		if(hash[div1]==-1)
		{
			hash[div1] = key;
		}else
		{
			hash[div2]=key;
		}
		print(hash);
	}
	
	public static void main(String[] args)
	{
		Hashing hashing = new Hashing();
		hashing.linearProbing(1);
		
		hashing.linearProbing(4);
		//둘이 겹친다.
		hashing.quadraticProbing(3);
		hashing.quadraticProbing(16);
		//안겹치는곳으로 간 16, 당연히 많이하면 겹친다.
		hashing.doubleProbing(16);
		//둘이 겹친다.
		hashing.chaining(11);
		hashing.chaining(24);
	}
}
