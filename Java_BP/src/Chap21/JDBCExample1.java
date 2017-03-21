package Chap21;
import java.sql.*;
/*
 * 작성일자:2017_03_21
 * 작성자:길경완
 * JDBC 드라이버를 로드하고 DB에 연결하는 프로그램
 * 예제 21-1
 */
public class JDBCExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","");
			System.out.println("db 접속");
			conn.close();
		}catch(ClassNotFoundException e){
			System.out.println(e.getMessage());
		}catch(SQLException e){
			System.out.println(e.getMessage());
		}
	}

}
