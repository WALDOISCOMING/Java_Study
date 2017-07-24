package ����;


/*
 * ������: 2017-07-14
 * ������: ����
 * ������: 2017-07-20
 * ������: ����
 * ���� :blob ����.
 * ���� :������ ������� �ȹ��� blob�� 1�� �Ǿ��ִ°͵��� ���°�.
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
		System.out.println("[0,0]�ڸ� ��ó�� blob�� �� ������ "+countingCellInABlob.countCell(0, 0,Array)+"���̴�.");
		System.out.println("---------------------------------------");
		countingCellInABlob.printCell(Array);
		
	}

}
