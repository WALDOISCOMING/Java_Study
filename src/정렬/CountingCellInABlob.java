package 정렬;


/*
 * 생성일: 2017-07-14
 * 생성자: 길경완
 * 수정일: 2017-07-20
 * 수정자: 길경완
 * 제목 :blob 세기.
 * 내용 :간단한 방법으로 팔방의 blob이 1로 되어있는것들을 세는것.
 */

public class CountingCellInABlob {

static int BACKGROUND_COLOUR=0;
static int IMAGE_COLOUR=1;
static int ALREADY_COUNTED=2;

static int SIZE=8;


public void printCell(int[][] Array){
	for(int i=0;i<SIZE;i++){
		for(int j=0;j<SIZE;j++){
		System.out.print("["+Array[i][j]+"]");
		}
		System.out.println(" ");
	}

}


public int countCell(int x,int y,int Array[][]){

	if(x<0||y<0||x>=SIZE||y>=SIZE){
	return 0;
	}
	else if(Array[x][y]!=IMAGE_COLOUR){
	return 0;
	}else{
	Array[x][y] = ALREADY_COUNTED;
		return 1+countCell(x-1,y-1,Array)+countCell(x-1,y,Array)+countCell(x-1,y+1,Array)
			+countCell(x,y-1,Array)+countCell(x,y+1,Array)
			+countCell(x+1,y-1,Array)+countCell(x+1,y,Array)+countCell(x+1,y+1,Array);
	}

}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]Array={
				{1,0,0,0,0,0,0,1},
				{0,1,1,0,0,1,0,0},
				{1,1,0,0,1,0,1,0},
				{0,0,0,0,0,1,0,0},
				{0,1,0,1,0,1,0,0},
				{0,1,0,1,0,1,0,0},
				{1,0,0,0,1,0,0,1},
				{0,1,1,0,0,1,1,1},
			};
		
		CountingCellInABlob countingCellInABlob = new CountingCellInABlob();
		countingCellInABlob.printCell(Array);
		System.out.println("---------------------------------------");
		System.out.println("[0,0]자리 근처의 blob의 총 갯수는 "+countingCellInABlob.countCell(0, 0,Array)+"개이다.");
		System.out.println("---------------------------------------");
		countingCellInABlob.printCell(Array);
		
	}

}
