package �ؽ�;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * ������: 2017-07-20
 * ������: ����
 * ������: x
 * ������: x
 * ���� :�ؽ�
 * ���� :.
 * 
 * �ؽ� ���̺��� dynamic set(Ž��,����,���� ��� ����)�� �����ϴ� ���� ȿ���� ���.
 * ������ ��� Ž��,����,���� O(1)
 * �־��� ��� ��Ÿ(n)
 * �ؽ� ���̺��� �ؽ� �Լ��� ����Ͽ� key�� T[hash_function(k))]�� �����Ų��. �̷� ��� key�� h(k)�� ����� �Ǿ��ٰ��Ѵ�.
 * �ؽ� ���̺��� �Ϲ������� �ϳ��� �迭�� ���Ѵ�. �� ��� key�� ��� �ڿ������ ������ �����Ѵ�.
 * �ΰ� �̻��� Ű�� ������ ��ġ�� �ؽ��Ǹ� �浹�̶�� �Ѵ�. �� �Լ��� ���ǿ��� ġ���� 1��1�� �¾� �������� �ܻ��Լ��� �ƴϹǷ� �׻� �߻� ���ɼ��� �ִ�. 
 * ��ټ� ���ǿ��� ġ������ ũ�Ƿ� �̷��� ���� ���ϱ� ���Ͽ� chaining�� open addressing���� ���ؾ��Ѵ�.
 * Ű�� ����: 
 * Ű�� ����Ʈ �� �տ� ���� O(1)
 * �ߺ��� Ű�� ��� �ü� ������, �ߺ��� ������� �ʴ´ٸ� ������ �˻��ؾ��Ѵ�. �׷��Ƿ� ���⵵�� ����Ʈ ���̿� ���
 * Ű�� �˻�:
 * T[hash_function(k))]���� ���� �˻�
 * �ð� ���⵵�� ����Ʈ ���̿� ���
 * Ű�� ����:
 * T[hash_function(k))]���� �˻� �� ����
 * ã�� �Ŀ��� O(1)�ð��� ���� ����
 * �־��� ���, ��� Ű�� ��� ���� �ؽ����� ���� �ϳ��� �������� �ؽ��Ǵ� ���
 * ���̰� n�� �ϳ��� ���Ḯ��Ʈ�� ���������. �׷��� �־��� ��� Ž���� ���Ÿ(n)+�ؽ��Լ� ���ð��� �ɴѴ�.
 * �ᱹ ��սð����⵵�� ���ӿ� �󸶳� �� �й�Ǵ��Ŀ����� �����ȴ�.
 * ������ Ű�� ��� ���Կ� �յ��� Ȯ���� ���������� �ؽ� �ȴٴ� ����.->���ǿ����� �Ұ���
 * Load factor a = n/m
 * n�� ���̺� ����� Ű�� ����
 * m�� �ؽ� ���̺��� ũ��.
 * �ϳ��� Ű�� n���� �������� �ϳ��� ���� Ȯ���� n/m�̴�.
 * 
 * open addressing������ �ذ���:
 * Linear probing:
 * �ڽ��� ��ġ�� �ؽ��� ����ִٸ� �װ��� �ִ´�. ���� ä�����ִٸ� ����������, �ٷ� ���� ��ġ�� �ִ´�. �̷��� �ȴٸ� ���̸� Ŭ����Ʈ���� ���ϰ� �Ǽ�
 * ���ο� Ű ���� �� ���� Ŭ��������ġ�� ���� �� ���ɼ��� �������Ƿ� ���� ��ġ�� �κ��� �þ�� ������ �����.
 * Quadratic probing
 * �ڽ��� ��ġ�� �ؽ��� ����ִٸ� �װ��� �ִ´�. ���� ä�����ִٸ� 1^2,2^2,3^2�� ������ ������  �ִ´�. 
 * 
 * Double hashing
 * �ϳ��� �ؽ� �Լ��� �ƴ� �ٸ� �ؽ� �Լ��� �̿��ؼ� �����.
 * 
 * �ܼ������� �Ѵٸ� ���� A,B,C�� ���� �ؽ� �Լ����� ���� linear�� �浹 �ذ��ߴ�����. �̶� B�� �����ϸ� C�� �����ϴ� ��ġ��
 * �˼��� ����. �׷��Ƿ� ������ ��, C�� B�� �ڸ��� �Ű�����Ѵ�. Ŭ����Ʈ ��ü�� �Űܾ� �Ѵ�.
 * 
 * ������ Ű���� ���������ʰ� ���ʿ� �������� �� �������̴�. �׷��Ƿ� Ű�� ������ ������ �ؽ��Լ����� �ұ�Ģ���̾���Ѵ�. 
 * �ؽ��Լ� ����� ���
 * division ���
 * h(k) = k%m;
 * ����:������.
 * ����:�ؽ����� Ű���� Ư���κп� ���Ͽ� �����ȴ�.
 * multiplication ���
 * 0~1���� ��� A ����.
 * kA�� �Ҽ� �ι����� �����Ѵ�.
 * �Ҽ� �ι��� m�� ���� �� �Ҽ��� �Ʒ��� ������.
 * m=8�̰� W=5,k=21;
 * A=13/32;
 * ka=21*13/32l->8+(17/32);
 * ka�� �Ҽ��ι� * m�� �ϰ�, �װ��� ������ �����´�.
 * m*(ka mod 1) = 8*(17/32) = 17/4 = 4....
 * h(21) = 4;
 * ����:Ű�� �Ϻκи��� ���� �ʴ´�.
 * ����:
 * 
 * �ڹ��� objectŬ������ hashcode, ��� ��ü�� ������ �ִٴ� ���̴�. �׷��� Object.equals�� hashcode�� ����ϴ°�.
 * ���� Ŭ�������� �޼ҵ��� ��� div ����� ������� mul ����� ������� �ʴ´�.
 */

public class Hashing extends ����.printArray
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
			System.out.print(i+"���� ");
			for(int j=chaining[i].size()-1;j>=0;j--)
			{
				System.out.print(j+"��° ["+chaining[i].get(j)+"]");
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
			System.out.println("linear �ؽ� ���ԿϷ�");
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
			System.out.println("quadratic �ؽ� ���ԿϷ�");
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
		//���� ��ģ��.
		hashing.quadraticProbing(3);
		hashing.quadraticProbing(16);
		//�Ȱ�ġ�°����� �� 16, �翬�� �����ϸ� ��ģ��.
		hashing.doubleProbing(16);
		//���� ��ģ��.
		hashing.chaining(11);
		hashing.chaining(24);
	}
}
