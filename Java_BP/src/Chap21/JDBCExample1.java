package Chap21;
import java.sql.*;
/*
 * �ۼ�����:2017_03_21
 * �ۼ���:����
 * JDBC ����̹��� �ε��ϰ� DB�� �����ϴ� ���α׷�
 * ���� 21-1
 */
public class JDBCExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","");
			System.out.println("db ����");
			conn.close();
		}catch(ClassNotFoundException e){
			System.out.println(e.getMessage());
		}catch(SQLException e){
			System.out.println(e.getMessage());
		}
	}

}
