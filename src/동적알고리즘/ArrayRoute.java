package �����˰���;
/*
 * 
 * 
 * �������� ����� nn����� �»�ܿ��� ���ϴܱ��� �̵��Ѵ�., �� �������̳� �Ʒ������� �̵��Ǵµ�,
 * �湮�� ĭ���� ���� �ּ�ȭ�ǵ�������.
 * i,j�����Ϸ��� i,j-1�̳� i-1,j,���� �;��Ѵ�.
 * L[i,j]
 * 			1)i,j=1 Mij
 * 			2)j=1 L[i-1,j]+Mij ������+����
			3)i=1 L[i,j-1]+Mij ������ ����
			4)else min(L[i-1,j],L[i,j-1])+mij
 */
public class ArrayRoute {
	int L[][];
	int m[][];
	//�ͳ��� ����� ����̴�. ���� �������� �ݺ��� ����� ��찡 �����.
	int mat_re(int i,int j)
	{
		if(i==1&&j==1){
			return L[i][j];
		}else if(i==1){
			return mat_re(i,j-1)+L[i][j];
		}else if(j==1){
			return mat_re(i-1,j)+L[i][j]; 
		}else{
			return Math.min(mat_re(i-1,j),mat_re(i,j-1))+L[i][j];
		}
		
	}
	//����. L[][]�� ��� �ʱ⿡�� -1�� �ʱ�ȭ�Ǿ��֤���.
	int mat_memo(int i,int j)
	{
		if(L[i][j]!=-1)return L[i][j];
		if(i==1&&j==1)
			return L[i][j] = m[i][j];
		else if(i==1)
		{
			return L[i][j] = mat_memo(1,j-1)+m[i][j];
		}
		else if(j==1)
		{
			return L[i][j] = mat_memo(i-1,1)+m[i][j];
		}
		else
		{
			L[i][j] = Math.min(mat_memo(i-1,j),mat_memo(i,j-1))+m[i][j];
			return L[i][j];
		}
		
	}
}
