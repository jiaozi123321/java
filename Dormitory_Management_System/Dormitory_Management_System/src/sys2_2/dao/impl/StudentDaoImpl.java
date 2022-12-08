package sys2_2.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import sys2_2.dao.StudentDao;
import sys2_2.model.Student;
import sys2_2.util.DBUtils;

public class StudentDaoImpl implements StudentDao{
	private Connection connection = DBUtils.getConnection();//ªÒ»°¡¥Ω”
	@Override
	public int saveStudent(Student student) {
		// TODO Auto-generated method stub
		String sql = "insert into student values( ? , ? , ? , ? , ? , ? , ? , ?)";
		
		int result = DBUtils.executeUpdate(connection, sql, student.getArrys());
		return result;
	}

	@Override
	public int deleteStudent(String stu_num) {
		// TODO Auto-generated method stub
		String sql = "delete from student where stu_num = ?";
		int result = DBUtils.executeUpdate(connection, sql, stu_num);
		return result;
	}

	@Override
	public Student getStudent(String stu_num) {
		// TODO Auto-generated method stub
		ResultSet resultSet = null;
		Student student = null;
		String sql = "select * from student where stu_num = ?";
		resultSet = DBUtils.executeQuary(connection, sql, stu_num);
		try {
			if(resultSet.next()) {
			student=new Student();
			student.setStu_num(resultSet.getString(1));
			student.setStu_name(resultSet.getString(2));
			student.setStu_dor_num(resultSet.getString(3));
			student.setStu_bed(resultSet.getInt(4));
			student.setStu_tel(resultSet.getInt(5));
			student.setStu_cid(resultSet.getString(6));
			student.setStu_class(resultSet.getString(7));
			student.setStu_back(resultSet.getInt(8));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return student;
	}

	@Override
	public int updateSturing(String stu_num) {
		// TODO Auto-generated method stub
		String sql ="update student set stu_back =1 where stu_num = ?";
		int result =DBUtils.executeUpdate(connection, sql, stu_num);
		return result;
	}

	@Override
	public List<Student> listStudentNoback() {
		ResultSet resultSet =null;
		Student student =null;
		List<Student> list = new ArrayList<Student>();
		String sql ="select * from student where stu_back = 0";
		resultSet =DBUtils.executeQuary(connection, sql);
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

	@Override
	public List<Student> listStudentCnoback(String num_class) {
		// TODO Auto-generated method stub
		ResultSet resultSet =null;
		Student student =null;
		List<Student> list = new ArrayList<Student>();
		String sql ="select * from student where stu_class=? and stu_back = 1";
		resultSet =DBUtils.executeQuary(connection, sql, num_class);
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

	@Override
	public List<Student> listClassStudent(String num_class) {
		// TODO Auto-generated method stub
		ResultSet resultSet =null;
		Student student =null;
		List<Student> list = new ArrayList<Student>();
		String sql ="select * from student where stu_class=? ";
		resultSet =DBUtils.executeQuary(connection, sql, num_class);
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
			e.printStackTrace();
		}
		return list;
	}

}
