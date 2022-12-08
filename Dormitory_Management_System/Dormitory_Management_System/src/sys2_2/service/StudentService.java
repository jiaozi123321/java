package sys2_2.service;

import java.util.List;

import sys2_2.model.Student;

public interface StudentService {
	public int saveStudent(Student student);		//新增学生入住信息
	public int deleteStudent(String stu_num);		//删除学生床位信息
	public Student getStudent(String stu_num);
	public int updateSturing(String stu_num);		//通过学号录入未归学生
	public List<Student> listStudentNoback();		//查询所有未归学生信息
	public List<Student> listStudentCnoback(String num_class);//查询班级未归学生
	public List<Student> listClassStudent(String num_class);//查询班级所有
}
