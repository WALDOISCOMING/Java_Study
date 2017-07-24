package ����;

/*
 * 
 *  
 * run-length encoding 
 * run�̶�� ���� ���ӵɶ� ���.aaabb��� 3a2b�� ǥ��. ���ӵǴ� ��� ȿ����.
 */
public class RunLength {

	public void printRunLength(String str)
	{
		int count=1;
		for(int i=0;i<=str.length();i++)
		{
			if(i==str.length()-1)
			{
				System.out.print(count+""+str.charAt(i)+":");
				break;
			}
			
			
			if(str.charAt(i)==str.charAt(i+1))
			{
				count++;				
			}
			else
			{
				System.out.print(count+""+str.charAt(i)+":");
				count=1;
			}
		}
		
		
	}
	
	public static void main(String[] args)
	{
		String str="aabbbcca";
		RunLength runLength = new RunLength();
		runLength.printRunLength(str);
		
	}
}
