package sys2_2.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import sys2_2.dao.DormitoryDao;
import sys2_2.model.Dormitory;
import sys2_2.model.Student;
import sys2_2.util.DBUtils;

public class DormitoryDaoImpl implements DormitoryDao{
	private Connection connection = DBUtils.getConnection();
	@Override
	public Dormitory getDormitory(String dor_num) {
		// TODO Auto-generated method stub
		ResultSet resultSet =null;
		Dormitory dormitory =null;
		String sql = "select * from dormitory where dor_num=?";
		resultSet = DBUtils.executeQuary(connection, sql, dor_num);
		try {
			if(resultSet.next()) {
				dormitory = new Dormitory();
				dormitory.setDor_num(resultSet.getString(1));
				dormitory.setBulid_num(resultSet.getString(2));
				dormitory.setB_num(resultSet.getString(3));
				dormitory.setKind(resultSet.getInt(4));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dormitory;
	}
	@Override
	public int managementDormitory(Dormitory dormitory) {
		// TODO Auto-generated method stub
		String sql ="update dormitory set kind =? where dor_num = ?";
		int result =DBUtils.executeUpdate(connection, sql, dormitory.gerarrys());
		return result;
	}
	@Override
	public List<Student> getStudentDormitory(Dormitory dormitory) {
		// TODO Auto-generated method stub
		ResultSet resultSet =null;
		Student student =null;
		List<Student> list = new ArrayList<Student>();
		String sql ="select * from student where stu_dor_num=(select dor_num from dormitory where build_num=? and b_num =? and dor_num = ? )";
		resultSet =DBUtils.executeQuary(connection, sql,dormitory.getArryT());
		try {
			while(resultSet.next()) {
			student=new Student();
			student.setStu_num(resultSet.getString(1));
			student.setStu_name(resultSet.getString(2));
			student.setStu_dor_num(resultSet.getString(3));
			student.setStu_bed(resultSet.getInt(4));
			student.setStu_tel(resultSet.getLong(5));
			student.setStu_cid(resultSet.getString(6));
			student.setStu_class(resultSet.getString(7));
			student.setStu_back(resultSet.getInt(8));
			list.add(student);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

}
