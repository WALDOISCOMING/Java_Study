package ����;

import java.io.IOError;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

import javax.sound.midi.Synthesizer;

/*
 * 
 * text�� ���� ��. �ս��� ���ϸ� ����� �����Ų��
 * ���ڸ� ��Ʈ�� ��ȯ�ϰ�, ���̾��±��ڸ� ������Ʈ ���Ծ��°� ū ��Ʈ������ ������.
 * �̷��� ���� � ���ڶ� �ٸ����� �κ��� ���� �ʾƾ��Ѵ�. prefix�� �ϴµ� �� ����� tree�� ����ϴ°��� �Ϲ����̴�.
 * 
 * ���ο��� 09 12 19 21 39�� �󵵷� ���������ִٸ�.
 * 1.���� ���� 2���� ã�´�. �� �ΰ��� �ڽ����� �ϴ� tree�� �����. �̵��� parent�� �ڽ��� ��ģ ���̴�.
 * 2.�� ���� ��� ��� tree�� �����
 * 3.������ �������� �����ʿ��� 0 ū�ʿ��� 1 �ִ´�.
 * �̷��� �������� readlength�� ����� �̿��Ѵ�.
 *
 *	1�ܰ�
 *������ ������ �о� run�� frequency�� ã��.
 *run�� run ����Ƚ���� ���Ѵ�.
 * �ν��� run�� arraylist�� �����Ѵ�.
 * ������ ������ �ּ� 2�� �о���ϴµ� ù��°�� run�� ������, �� �������� �� �����Ҷ�/
 */
public class HuffmanCoding {
	//private Heap<Run> heap;//�̴ϸ� ��
	private Run theRoot = null;//������Ʈ���� root
	/*
	 * Ʈ�� ������ �����ϸ� �󵵰� ���� ���� �ΰ� Ʈ���� ã�� �ϳ��� ��ģ��. ���⿡���� �ּ� ���� ����ϸ� �̷��� ���� ����Ǵ°� ��尡 �ƴ� Ʈ���̴�.
	 */
	//run!
	private ArrayList<Run> runs = new ArrayList<Run>();
	
	private Run[] chars = new Run[256];
	
	
	private void createHuffmanTree()
	{
		/*
		 * 1.����� run�� ���� �ִ´�.
		 * 2.�� ���� 
		 * 	1)���� ���� ���� ����.
		 * 	2)��ģ��.
		 * 	3)���������� ���� �ִ´�.
		 * 3.Ʈ���� theroot�� �����.
		 */
	}
	//������ 0 �������� 1 �ͳ��� ���°��� ���ϴ�.
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
		//�����϶�
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
