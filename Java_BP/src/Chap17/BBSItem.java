package Chap17;
/*
 * �ۼ�����:2017_03_19
 * �ۼ���:����
 * transient �ʵ带 �����ϴ� ����ȭ ���� Ŭ������ ��
 * ���� 17-4
 * ���� 17-6: ����ȭ�� �Ұ����� Ÿ���� �ʵ带 �����ϴ� ����ȭ ���� Ŭ������ ��
 */
public class BBSItem implements java.io.Serializable {
	static int itemNum=0;
	String writer;
	transient String passwd;//����ȭ�� ���´�.
	String title;
	String content;
	Object attachment;//÷������.
	public BBSItem(String writer,String passwd,String title,String content) {
		this.writer=writer;this.passwd=passwd;this.title=title;this.content=content;
		itemNum++;
		// TODO Auto-generated constructor stub
	}
	void modifyContent(String content,String passwd){
		if(!passwd.equals(this.passwd))
			return;
		this.content=content;
	}
	void addAttachment(Object attachment){
		this.attachment=attachment;
	}
}
