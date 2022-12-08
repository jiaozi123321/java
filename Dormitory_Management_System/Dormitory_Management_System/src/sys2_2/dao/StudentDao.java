package sys2_2.dao;

import java.util.List;

import sys2_2.model.Student;

public interface StudentDao {
	public int saveStudent(Student student);		//����ѧ����ס��Ϣ
	public int deleteStudent(String stu_num);		//ɾ��ѧ����λ��Ϣ
	public Student getStudent(String stu_num);
	public int updateSturing(String stu_num);		//ͨ��ѧ��¼��δ��ѧ��
	public List<Student> listStudentNoback();		//��ѯ����δ��ѧ����Ϣ
	public List<Student> listStudentCnoback(String num_class);//��ѯ�༶δ��ѧ��
	public List<Student> listClassStudent(String num_class);//��ѯ�༶����
}
