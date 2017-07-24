package 인공지능관련;
/*
 * 생성일: 2017-07-14
 * 생성자: 길경완
 * 수정일: 2017-07-20
 * 수정자: 길경완
 * 제목 :미로
 * 내용 :재귀를 통한 미로찾기이다. 
 * 이것은 간단하게 미로를 찾는 방법이지만 이 방법, 재귀를 통하여 후에 인공지능을 설계시킴/.
 */

public class Maze {


static int PATHWAY_COLOUR=0;
static int WALL_COLOUR=1;
static int BLOCKED_COLOUR=2;
static int PATH_COLOUR=3;

static int MAZE_SIZE=8;

static int maze[][]={
                {0,0,0,0,0,0,0,1},
                {0,1,1,0,1,1,0,1},
                {0,0,0,1,0,0,0,1},
                {0,1,0,0,1,1,0,0},
                {0,1,1,1,0,0,1,1},
                {0,1,0,0,0,1,0,1},
                {0,0,0,1,0,0,0,1},
                {0,1,1,1,0,1,0,0},
        };

void printMaze(int size){
	for(int i=0;i<size;i++){
		for(int j=0;j<size;j++){
			System.out.print("["+maze[i][j]+"]");
		}
		System.out.println(" ");
	}

}


public boolean searchMaze(int x,int y){
	if(x<0||y<0||x>=MAZE_SIZE||y>=MAZE_SIZE){
		return false;
	}
	else if(x==MAZE_SIZE&&y==MAZE_SIZE){
		maze[x][y]=PATH_COLOUR;
		return true;

	}else if(maze[x][y]!=PATHWAY_COLOUR){
		return false;
	}else{
		maze[x][y]=PATH_COLOUR;
		if(searchMaze(x,y-1)||searchMaze(x+1,y)||searchMaze(x,y+1)||searchMaze(x-1,y)){

			return true;
		}

		maze[x][y]=BLOCKED_COLOUR;
		return false;

	}

}
public static void main(String[] args){
	System.out.println("bf maze");	
	Maze maze = new Maze();
	maze.printMaze(MAZE_SIZE);

	System.out.println("af maze");	
	maze.searchMaze(0,0);
	maze.printMaze(MAZE_SIZE);



}
}
