package sys2_2.controller;

import java.util.List;
import java.util.Scanner;

import sys2_2.model.Admin;
import sys2_2.model.Dormitory;
import sys2_2.model.Student;
import sys2_2.service.AdminService;
import sys2_2.service.StudentService;
import sys2_2.service.DormitoryService;
import sys2_2.service.impl.AdminServiceImpl;
import sys2_2.service.impl.DormitoryServiceImpl;
import sys2_2.service.impl.StudentServiceImpl;

public class SystemController {
	private static Scanner sc = new Scanner(System.in);
	private static AdminService adminService = new AdminServiceImpl();
	private static StudentService studentService = new StudentServiceImpl();
	private static DormitoryService dormitoryService = new DormitoryServiceImpl();
	public static void main(String[] args) {
		Login();
	}
public static void Login() {
	int select = 0;
	System.out.println("***��ӭʹ���������ϵͳ***");
	System.out.println("***����<< 1 >>-��¼ϵͳ***");
	System.out.println("***����<< 0 >>-�˳�ϵͳ***");
	select = sc.nextInt();
	while(true) {
		switch(select) {
		case 1:getAdmin();break;
		case 0:Exit();
		}
		//System.out.println("�˳�ϵͳ��");
	}
}
public static void getAdmin(){
	String name =null;
	String password= null;
	Admin admin =null;
	System.out.println("�������˺�");
	name=sc.next();
	System.out.println("����������");
	password = sc.next();
	admin = adminService.getAdmin(name);
if(password.equals(admin.toString())) {
	System.out.println("��¼�ɹ�");
	try {
		Thread.sleep(500);
	} catch (Exception e) {
		
	}
	switch(admin.toStringTow()) {
	case 1:adminCreateFace();break;//ϵͳ����Ա��¼
	case 2:DmanagerCreateFace();break;//�޹ܵ�¼
	case 3:InstructorCreatFace();break;//����Ա��¼
	case 4:AssistantCreatFace();break;//ѧ�������¼
	}
	
}else {
	System.out.println("��������˺Ż���������");
}
}
public static void adminCreateFace() {
	int select =0;
	System.out.println("ϵͳ����Ա��������");
	System.out.println("1����ѯ������ס��Ϣ");
	System.out.println("2��ɾ��ѧ����λ��Ϣ");
	System.out.println("3������ѧ����ס��Ϣ");
	System.out.println("4��ͳ�Ƶ�������δ��ѧ����Ϣ");
	System.out.println("5����ѯ�༶����ѧ����Ϣ");
	System.out.println("6��¼��ѧ��������޼�¼");
	System.out.println("7�������༶ҹ������ѧ������");
	System.out.println("8�����ѧ������");
	System.out.println("9����������");
	System.out.println("0���˳�����ϵͳ");
	while(true) {
		select = sc.nextInt();
		switch(select) {
		case 1:getDormitory();adminCreateFace();break;
		case 2:deleteStudent();adminCreateFace();break;
		case 3:saveStudent();adminCreateFace();break;
		case 4:listStudenNback();adminCreateFace();break;
		case 5:listClassStudent();adminCreateFace();break;
		case 6:EntryStudent();adminCreateFace();break;
		case 7:ExportClassStudent();adminCreateFace();break;
		case 8:AddAssistant();adminCreateFace();break;
		case 9:managementFac();adminCreateFace();break;
		case 0:Exit();
		}
	}
}
public static void managementFac() {
	Dormitory dormitory = new Dormitory();
	System.out.println("������Ҫ�޸Ĺ��ܵ�����");
	dormitory.setDor_num(sc.next());
	System.out.println("1:����ס 2:������ס 3:����������");
	System.out.println("��ѡ����");
	dormitory.setKind(sc.nextInt());
	if(dormitoryService.managementDormitory(dormitory)>0) {
		System.out.println("�޸ĳɹ�");
	}else {
		System.out.println("�޸�ʧ��");
	}
}
//�޹ܲ�������
public static void DmanagerCreateFace() {
	int select =0;
	System.out.println("1����ѯ������ס��Ϣ");
	System.out.println("2��ɾ��ѧ����λ��Ϣ");
	System.out.println("3������ѧ����ס��Ϣ");
	System.out.println("4��ͳ�Ƶ�������δ��ѧ����Ϣ");
	System.out.println("0���˳�����ϵͳ");
	
	while(true) {
		select = sc.nextInt();
		switch(select) {
		case 1:getDormitory();DmanagerCreateFace();break;
		case 2:deleteStudent();DmanagerCreateFace();break;
		case 3:saveStudent();DmanagerCreateFace();break;
		case 4:listStudenNback();DmanagerCreateFace();break;
		case 0:Exit();
		}
	}
}
public static void saveStudent() {
	Student student = new Student();
	System.out.println("������ѧ��");
	student.setStu_num(sc.next());
	System.out.println("����������");
	student.setStu_name(sc.next());
	System.out.println("�����������");
	student.setStu_dor_num(sc.next());
	System.out.println("�����봲λ��");
	student.setStu_bed(sc.nextInt());
	System.out.println("�������ֻ���");
	student.setStu_tel(sc.nextInt());
	System.out.println("�����븨��Ա���");
	student.setStu_cid(sc.next());
	System.out.println("������༶");
	student.setStu_class(sc.next());
	System.out.println("�����뿼��״̬");
	student.setStu_back(sc.nextInt());
	if(studentService.saveStudent(student)>0) {
		System.out.println("��ӳɹ�");
		//DmanagerCreateFace();
	}else {
		System.out.println("���ʧ��");
		//DmanagerCreateFace();
	}
}
public static void deleteStudent() {
	String num =null;
	System.out.println("��������Ҫɾ����ѧ��");
	num=sc.next();
	if(studentService.deleteStudent(num)>0) {
		System.out.println("ɾ���ɹ�");
	}else {
		System.out.println("ɾ��ʧ��");
	}
}
public static void getDormitory() {
	String stu_dor_num=null;
	Dormitory dormitory =null;
	System.out.println("������Ҫ��ѯ�����Һ�");
	stu_dor_num=sc.next();
	dormitory = dormitoryService.getDormitory(stu_dor_num);
	if(dormitory !=null) {
		System.out.println(dormitory.toString());
	}else {
		System.out.println("û�в鵽��������Ϣ");
	}
}
public static void listStudenNback() {
	List<Student> list = studentService.listStudentNoback();
	if(!list.isEmpty()) {
		for(Student s:list) {
			System.out.println(s.toString());
		}
	}else {
		System.out.println("��δ����Ա");
	}
}
public static void Exit() {
	System.out.println("�ɹ��˳���");
	System.exit(0);
}
//����Ա��������
public static void InstructorCreatFace() {
	int select =0;
	System.out.println("1����ѯ�༶����ѧ����Ϣ");
	System.out.println("2��¼��ѧ��������޼�¼");
	System.out.println("3�������༶ҹ������ѧ������");
	System.out.println("4�����ѧ������");
	System.out.println("0���˳�����ϵͳ");
	while(true) {
		select = sc.nextInt();
		switch(select) {
		case 1:listClassStudent();InstructorCreatFace();break;
		case 2:EntryStudent();InstructorCreatFace();break;
		case 3:ExportClassStudent();InstructorCreatFace();break;
		case 4:AddAssistant();InstructorCreatFace();break;
		case 0:Exit();
		}
	}
}
/*
 * ��ѯ������༶������ѧ����Ϣ
 */
public static void listClassStudent() {
	String num_class =null;
	System.out.println("�������ѯ�༶");
	num_class=sc.next();
	List<Student> list = studentService.listClassStudent(num_class);
	if(!list.isEmpty()) {
		for(Student s:list) {
			System.out.println(s.toString());
		}
	}else {
		System.out.println("û���������");
	}
}
/*
 * ¼��ѧ�����������Ϣ
 */
public static void EntryStudent() {
	String stu_num = null;
	System.out.println("��������Ҫ¼��ȱ��ѧ��ѧ��");
	stu_num = sc.next();
	if(studentService.updateSturing(stu_num)>0) {
		System.out.println("¼��ɹ�");
	}else {
		System.out.println("¼��ʧ��");
	}
}
/*
 * ��������༶ҹ�����޵�ѧ������
 */
public static void ExportClassStudent() {
	String stu_class = null;
	System.out.println("��������Ҫ���������İ༶");
	stu_class=sc.next();
	List<Student> list = studentService.listStudentCnoback(stu_class);
	if(!list.isEmpty()) {
		for(Student s:list) {
			System.out.println(s.toString());
		}
	}else {
		System.out.println("û���������");
	}
}
/*
 * ���ѧ������
 */
public static void AddAssistant() {

	Admin admin =new Admin();
	System.out.println("��������Ҫ��ӵ�ѧ����������");
	admin.setName(sc.next());
	System.out.println("��������Ҫѧ�������¼����");
	admin.setPassword(sc.next());
	if(adminService.saveAdmin(admin)>0) {
		System.out.println("��ӳɹ�");
	}else {
		System.out.println("���ʧ��");
	}
}

public static void AssistantCreatFace() {
	int select =0;
	System.out.println("1��¼��ѧ��������Ϣ");
	System.out.println("0���˳�����ϵͳ");
	while(true) {
		select = sc.nextInt();
		switch(select) {
		case 1:EntryStudent();AssistantCreatFace();break;
		case 0:Exit();
		}
	}
}


}
