package 압축;

import java.io.IOError;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

import javax.sound.midi.Synthesizer;

/*
 * 
 * text에 많이 씀. 손실을 피하며 제대로 압축시킨다
 * 글자를 비트로 변환하고, 많이쓰는글자를 작은비트 적게쓰는걸 큰 비트쪽으로 보낸다.
 * 이러한 것은 어떤 문자라도 다른것의 부분이 되지 않아야한다. prefix로 하는데 이 방법은 tree를 사용하는것이 일반적이다.
 * 
 * 내부에서 09 12 19 21 39의 빈도로 나누어져있다면.
 * 1.가장 작은 2개를 찾는다. 이 두개를 자식으로 하는 tree를 만든다. 이둘의 parent는 자식을 합친 값이다.
 * 2.이 것을 모두 모아 tree를 만든다
 * 3.위에서 내려오며 작은쪽에는 0 큰쪽에는 1 넣는다.
 * 이러한 과정에서 readlength의 방법을 이용한다.
 *
 *	1단계
 *데이터 파일을 읽어 run과 frequency를 찾기.
 *run과 run 등장횟수를 구한다.
 * 인식한 run을 arraylist에 저장한다.
 * 데이터 파일은 최소 2번 읽어야하는데 첫번째는 run을 읽을때, 그 다음에는 실 압축할때/
 */
public class HuffmanCoding {
	//private Heap<Run> heap;//미니멈 힙
	private Run theRoot = null;//허프만트리의 root
	/*
	 * 트리 집합을 유지하며 빈도가 가장 작은 두개 트리를 찾아 하나로 합친다. 여기에서는 최소 힙을 사용하며 이러한 힙에 저장되는건 노드가 아닌 트리이다.
	 */
	//run!
	private ArrayList<Run> runs = new ArrayList<Run>();
	
	private Run[] chars = new Run[256];
	
	
	private void createHuffmanTree()
	{
		/*
		 * 1.저장된 run을 힙에 넣는다.
		 * 2.그 동안 
		 * 	1)가장 작은 것을 고른다.
		 * 	2)합친다.
		 * 	3)합쳐진것을 힙에 넣는다.
		 * 3.트리에 theroot를 만든다.
		 */
	}
	//왼쪽은 0 오른쪽은 1 귀납을 쓰는것이 편하다.
	private void printHuffmanTree()
	{
	//	preOrderTraverse(theRoot,0);
	}
	/*
	private void preOrderTraverse(Run node,int depth)
	{
		for(int i=0;i<depth;i++)
		{
			System.out.print(" ");
			if(node==null)
			{
				System.out.println("null");
			}else
			{
				System.out.println(node.toString());
				preOrderTraverse(node.left,depth+1 );
				preOrderTraverse(node.right, depth+1);
			}
		}
		
		
	}
	
	public void encode(RandomAccessFile fIn,RandomAccessFile fOut)
	{
		
	}
	private void outputFrequencides(RandomAccessFile fIn,RandomAccessFile fOut)throws IOException
	{
		fOut.writeInt(runs.size());
		fOut.writeLong(fIn.getFilePointer());
		for(int j=0;j<runs.size();j++)
		{
			Run r = runs.get(j);
			fOut.write(r.symbol);
			fOut.writeInt(r.runLen);
			fOut.writeInt(r.freq);
		}
	}
	public Run findRun(byte symbol,int length)
	{
		
		return ;
	}
	private void storeRunsIntoArray(Run p)
	{
		//리프일때
		if(p.left==null&&p.right==null)
		{
			insertToArray(p);
		}else{
			storeRunsIntoArray(p.left);
			storeRunsIntoArray(p.right);
		}
	}
	
	public void compressFile(String inFileName,RandomAccessFile fIn)throws IOException
	{
		String outFileName = new String(inFileName+".z");
		RandomAccessFile fout = new RandomAccessFile(outFileName,"rw");
		collectRuns(fIn);
		outputFrequencides(fIn, fOut);
		createHuffmanTree();
		assignCodewords(theRoot,0,0);
		storeRunsIntoArray(theRoot);
		fIn.seek(0);
		encode(fIn,fOut);
	}
	public static void main(String[] args)
	{
		HuffmanCoding app = new HuffmanCoding();
		RandomAccessFile fIn;
		try{
			fIn = new RandomAccessFile("sample.txt","r");
			app.compressFile("sample.txt",fIn);
			fIn.close();
		}catch(IOException io){
			System.out.println("Cannot open"+io);
		}
	}
	
*/
}
