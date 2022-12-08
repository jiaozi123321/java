package sys2_2.dao;

import java.util.List;

import sys2_2.model.Dormitory;
import sys2_2.model.Student;

public interface DormitoryDao {
	public Dormitory getDormitory(String dor_num);//查询寝室入住信息
	public int managementDormitory(Dormitory dormitory);
	public List<Student> getStudentDormitory(Dormitory dormitory);//查询寝室入住学生信息
}
