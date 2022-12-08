package sys2_2.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import sys2_2.dao.AdminDao;
import sys2_2.model.Admin;
import sys2_2.util.DBUtils;

public class AdminDaoImpl implements AdminDao{
	private Connection connection = DBUtils.getConnection();
	
	
	
	@Override
	public int saveAdmin(Admin admin) {
		// TODO Auto-generated method stub
		String sql = "insert into admin values(null,?,?,4)";
		int result = DBUtils.executeUpdate(connection, sql,admin.getArrays() );
		return result;
	}
	@Override
	public Admin getAdmin(String name) {
		// TODO Auto-generated method stub
		ResultSet resultSet = null;
		Admin admin=null;
		String sql = "select * from admin where name =?";
		resultSet = DBUtils.executeQuary(connection, sql, name);
		try {
			if(resultSet.next()) {
				admin = new Admin();
				admin.setId(resultSet.getInt(1));
				admin.setName(resultSet.getString(2));
				admin.setPassword(resultSet.getString(3));
				admin.setKind(resultSet.getInt(4));
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return admin;
	}

}
