package sys2_2.service.impl;

import java.util.List;

import sys2_2.dao.StudentDao;
import sys2_2.dao.impl.StudentDaoImpl;
import sys2_2.model.Student;
import sys2_2.service.StudentService;

public class StudentServiceImpl implements StudentService{
	private StudentDao studentDao = new StudentDaoImpl();
	@Override
	public int saveStudent(Student student) {
		// TODO Auto-generated method stub
		return studentDao.saveStudent(student);
	}

	@Override
	public int deleteStudent(String stu_num) {
		// TODO Auto-generated method stub
		return studentDao.deleteStudent(stu_num);
	}

	@Override
	public Student getStudent(String stu_num) {
		// TODO Auto-generated method stub
		return studentDao.getStudent(stu_num);
	}

	@Override
	public int updateSturing(String stu_num) {
		// TODO Auto-generated method stub
		return studentDao.updateSturing(stu_num);
	}

	@Override
	public List<Student> listStudentNoback() {
		// TODO Auto-generated method stub
		return studentDao.listStudentNoback();
	}

	@Override
	public List<Student> listStudentCnoback(String num_class) {
		// TODO Auto-generated method stub
		return studentDao.listStudentCnoback(num_class);
	}

	@Override
	public List<Student> listClassStudent(String num_class) {
		// TODO Auto-generated method stub
		return studentDao.listClassStudent(num_class);
	}

}
