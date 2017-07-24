package Chap09;
/*
 * �ۼ�����:2017_03_13
 * �ۼ���:����
 * stringBuilder ��ü�� ���� ũ�⸦ ���������� �ø��� ���α׷�
 * ���� 9-8
 */
public class StringBuilderExample3 {

	public static void main(String[] args) {
	StringBuilder sb = new StringBuilder("Ǫ�� �����");
	sb.ensureCapacity(50);
    printStringBuilder(sb);
    sb.append("��ġ�� ���� ���� �ɾ ���� ��ġ�� �����ϴ�.");
    printStringBuilder(sb);
    sb.insert(10,"��ǳ���� ���� ���Ͽ� ��");
    printStringBuilder(sb);
	}
	static void printStringBuilder(StringBuilder sb){
		String str = sb.toString();
		int len = sb.length();
		int bufSize = sb.capacity();
		System.out.printf("%s(%d): %d %n",str,len,bufSize);
	}
}	