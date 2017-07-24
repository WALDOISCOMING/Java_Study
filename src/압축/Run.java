package 압축;

//자기 자신을 비교하기 위해서 implements 한다.
public class Run implements Comparable<Run> {
/*
 * 트리의 노드로 사용하기 위해 오른.왼자식 노드 필드 추가한다.
 * 두 run 크기 비교하는 compareTo 메소드를 overrding freq로 비교하자.
 */
	public Run right;
	public Run left;
	

public byte symbol;
public int runLen;
public int freq;

public int codeword; //부여된 codeword를 32정수로 저장.
public int codewordLen;//부여된 codeword의 길이

	private void assignCodewords(Run p,int codeword,int length)
	{
		//리프일때
		if(p.left==null&&p.right==null)
		{
			p.codeword=codeword;
			p.codewordLen=length;
		}
		else
		{
			//왼쪽에는 0을 추가는 것이고 오른쪽에느ㅏㄴ 1을 추가한다. 길이는 1증가.
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
