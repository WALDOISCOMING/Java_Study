package Chap07;
/*
 * �ۼ�����:2017_03_12
 * �ۼ���:����
 * ������� ���� Ÿ������ �����ؼ� ����ϴ� ��
 * ���� 7-15
 * ���� 7-20: ���� ����� ������ ���� �̿��ϴ� ���α׷�
 */
public enum Season {
SPRING("��"),SUMMER("����"),FALL("����"),WINTER("�ܿ�");

final private String name;
Season(String name){
	this.name= name;
}
String value(){
	return name;
}
}
