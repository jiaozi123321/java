package sys2_2.service;

import java.util.List;

import sys2_2.model.Dormitory;
import sys2_2.model.Student;

public interface DormitoryService {
	public Dormitory getDormitory(String dor_num);//��ѯ������ס��Ϣ
	public int managementDormitory(Dormitory dormitory);
	public List<Student> getStudentDormitory(Dormitory dormitory);//��ѯ������סѧ����Ϣ
}
