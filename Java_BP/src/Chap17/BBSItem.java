package Chap17;
/*
 * 작성일자:2017_03_19
 * 작성자:길경완
 * transient 필드를 포함하는 직렬화 가능 클래스의 예
 * 예제 17-4
 * 예제 17-6: 직렬화가 불가능한 타입의 필드를 포함하는 직렬화 가능 클래스의 예
 */
public class BBSItem implements java.io.Serializable {
	static int itemNum=0;
	String writer;
	transient String passwd;//직렬화를 막는다.
	String title;
	String content;
	Object attachment;//첨부파일.
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
