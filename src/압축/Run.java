package ����;

//�ڱ� �ڽ��� ���ϱ� ���ؼ� implements �Ѵ�.
public class Run implements Comparable<Run> {
/*
 * Ʈ���� ���� ����ϱ� ���� ����.���ڽ� ��� �ʵ� �߰��Ѵ�.
 * �� run ũ�� ���ϴ� compareTo �޼ҵ带 overrding freq�� ������.
 */
	public Run right;
	public Run left;
	

public byte symbol;
public int runLen;
public int freq;

public int codeword; //�ο��� codeword�� 32������ ����.
public int codewordLen;//�ο��� codeword�� ����

	private void assignCodewords(Run p,int codeword,int length)
	{
		//�����϶�
		if(p.left==null&&p.right==null)
		{
			p.codeword=codeword;
			p.codewordLen=length;
		}
		else
		{
			//���ʿ��� 0�� �߰��� ���̰� �����ʿ������� 1�� �߰��Ѵ�. ���̴� 1����.
			assignCodewords(p, codeword+'0', length+1);
			assignCodewords(p, codeword+'1', length+1);
		}
	}




	@Override
	public int compareTo(Run o) 
	{
	return 0;
	}
}
