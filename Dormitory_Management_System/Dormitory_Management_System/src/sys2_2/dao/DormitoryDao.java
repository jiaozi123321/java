package sys2_2.dao;

import java.util.List;

import sys2_2.model.Dormitory;
import sys2_2.model.Student;

public interface DormitoryDao {
	public Dormitory getDormitory(String dor_num);//��ѯ������ס��Ϣ
	public int managementDormitory(Dormitory dormitory);
	public List<Student> getStudentDormitory(Dormitory dormitory);//��ѯ������סѧ����Ϣ
}
