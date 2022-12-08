package sys2_2.util;
/**  
 * 数据库工具类
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBUtils {
	private static final String DATABASE_NAME = "dormitory_system";//表名
	private static final String USER = "XXX";		//用户名
	private static final String PWD = "XXXXXXX";	//密码
	private static final String DRIVER = "com.mysql.jdbc.Driver";//驱动
	private static final String URL ="jdbc:mysql://XXX.XXX.XXX.XXX:3306/"+DATABASE_NAME+"?useUnicode=true&characterEncoding=gbk";
	
	
	public static Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName(DRIVER);
			conn =  (Connection) DriverManager.getConnection(URL,USER,PWD);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}

public static void closeConn(Connection conn) {
	if(conn != null) {
		try {
			conn.close();
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
private static void setParam(PreparedStatement ps,Object...values) {
	if(values != null && values.length>0) {
		for(int i=0;i<values.length;i++) {
			try {
				ps.setObject(i+1,values[i]);
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
public static int executeUpdate(Connection conn,String sql,Object...values) {
	int count = 0;
	try {
		PreparedStatement ps = conn.prepareStatement(sql);
		setParam(ps,values);
		count = ps.executeUpdate();
	}catch(SQLException e) {
		e.printStackTrace();
	}
	return count;
}
public static ResultSet executeQuary(Connection conn,String sql,Object...values) {
	ResultSet rs = null;
	try {
		PreparedStatement ps =  conn.prepareStatement(sql);
		setParam(ps,values);
		rs = ps.executeQuery();
	}catch(SQLException e) {
		e.printStackTrace();
	}
	return rs;

}
}
