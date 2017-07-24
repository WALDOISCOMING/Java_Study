package 동적알고리즘;
/*
 * 
 * 
 * 정수들이 저장된 nn행렬의 좌상단에서 우하단까지 이동한다., 단 오른쪽이나 아래쪽으로 이동되는데,
 * 방문한 칸들의 합이 최소화되도록하자.
 * i,j도착하려면 i,j-1이나 i-1,j,에서 와야한다.
 * L[i,j]
 * 			1)i,j=1 Mij
 * 			2)j=1 L[i-1,j]+Mij 이전것+현재
			3)i=1 L[i,j-1]+Mij 이전것 현재
			4)else min(L[i-1,j],L[i,j-1])+mij
 */
public class ArrayRoute {
	int L[][];
	int m[][];
	//귀납을 사용한 경우이다. 답은 나오지만 반복된 계산의 경우가 생긴다.
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
	//가정. L[][]는 모두 초기에는 -1로 초기화되어있ㄷ다.
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
